package com.mengyuan.booksystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mengyuan.booksystem.bo.base.BaseResponse;
import com.mengyuan.booksystem.bo.constant.YNFlag;
import com.mengyuan.booksystem.bo.entity.Books;
import com.mengyuan.booksystem.bo.vo.request.BookAddRequest;
import com.mengyuan.booksystem.bo.vo.response.BookSearchResponse;
import com.mengyuan.booksystem.exception.ErrorMsg;
import com.mengyuan.booksystem.iservice.BooksService;
import com.mengyuan.booksystem.service.BookManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @author shanmengyuan
 * @date 2025/1/14 18:25
 */
@Service
public class BookManagementServiceImpl implements BookManagementService {


    @Autowired
    BooksService booksService;

    @Override
    public BaseResponse<Integer> add(BookAddRequest request) {
        Books one = booksService.getOne(request.getTitle(), request.getAuthor(), request.getYear());
        if (one != null) {
            return new BaseResponse<>(ErrorMsg.DATE_EXIST);
        }
        Books books = new Books();
        books.setTitle(request.getTitle());
        books.setAuthor(request.getAuthor());
        books.setYear(request.getYear());
        books.setAddedBy(0);
        if (booksService.save(books)) {
            return new BaseResponse<>(1);
        } else {
            return new BaseResponse<>(ErrorMsg.DEFAULT_ERROR);
        }
    }

    @Override
    public BaseResponse<Page<BookSearchResponse>> search(String bookName, Integer currentPage, Integer pageSize) {
        LambdaQueryWrapper<Books> booksLambdaQueryWrapper = new LambdaQueryWrapper<>();
        booksLambdaQueryWrapper.like(Books::getTitle, bookName)
                .eq(Books::getIsDeleted, YNFlag.NO.getCode());
        Page<Books> books = booksService.page(new Page<Books>(currentPage, pageSize), booksLambdaQueryWrapper);
        Page<BookSearchResponse> responsePage = new Page<>(books.getCurrent(), books.getSize(), books.getTotal());
        responsePage.setRecords(books.getRecords().stream().map(book -> {
            return new BookSearchResponse(book.getTitle(), book.getAuthor(), book.getYear());
        }).collect(Collectors.toList()));
        return new BaseResponse<>(responsePage);
    }

}
