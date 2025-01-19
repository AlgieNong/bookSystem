package com.mengyuan.booksystem.iservice.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mengyuan.booksystem.bo.entity.Books;
import com.mengyuan.booksystem.mapper.BooksMapper;
import com.mengyuan.booksystem.iservice.BooksService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shanmengyuan
 * @since 2025-01-15
 */
@Service
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books> implements BooksService {


    @Autowired
    BooksMapper booksMapper;

    @Override
    public Books getOne(String title, String author, Integer year) {
        LambdaQueryWrapper<Books> booksLambdaQueryWrapper = new LambdaQueryWrapper<>();
        booksLambdaQueryWrapper.eq(Books::getTitle, title)
                .eq(Books::getAuthor, author)
                .eq(Books::getYear, year);
        return getOne(booksLambdaQueryWrapper);
    }

    @Override
    public List<Books> getByTitle(String title) {
        LambdaQueryWrapper<Books> booksLambdaQueryWrapper = new LambdaQueryWrapper<>();
        booksLambdaQueryWrapper.like(Books::getTitle, title);
        return booksMapper.selectList(booksLambdaQueryWrapper);
    }
}
