package com.mengyuan.booksystem.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mengyuan.booksystem.bo.base.BaseResponse;
import com.mengyuan.booksystem.bo.vo.request.BookAddRequest;
import com.mengyuan.booksystem.bo.vo.response.BookSearchResponse;
import com.mengyuan.booksystem.service.BookManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ShanMengYuan
 * @date 2025/1/8 20:42
 * @description 书籍控制器
 */
@RequestMapping("/api/books")
@RestController
public class BookController {


    @Autowired
    private BookManagementService bookManagementService;

    @PostMapping("/add")
    public BaseResponse<Integer> add(@RequestBody BookAddRequest request) {
        return bookManagementService.add(request);
    }


    @PostMapping("/search")
    public BaseResponse<Page<BookSearchResponse>> search(@RequestParam String bookName, Integer currenPage, Integer pageSize) {
        return bookManagementService.search(bookName, currenPage, pageSize);
    }


}
