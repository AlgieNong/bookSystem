package com.mengyuan.booksystem.service;

import java.util.List;

import com.mengyuan.booksystem.vo.request.BookAddRequest;
import com.mengyuan.booksystem.vo.response.BookSearchResponse;

public interface BookService {

    String add(BookAddRequest request);

    List<BookSearchResponse> search(String bookName);

}
