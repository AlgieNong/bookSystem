package com.mengyuan.booksystem.controller;

import com.mengyuan.booksystem.iservice.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ShanMengYuan
 * @date 2025/1/8 20:42
 * @description 书籍控制器
 */
@RequestMapping("/api/books")
@Controller
public class BookController {

    @Autowired
    private BooksService booksService;

    @PostMapping("/add")
    public String add() {

    }


    @PostMapping("/search")
    public String search() {

    }





}
