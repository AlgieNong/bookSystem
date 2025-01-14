package com.mengyuan.booksystem.service;

import java.util.List;

import com.mengyuan.booksystem.bo.vo.request.BookAddRequest;
import com.mengyuan.booksystem.bo.vo.response.BookSearchResponse;

/**
 * @author shanmengyuan
 * @date 2025/1/14 18:25
 */
public interface BookManagementService {

    Integer add(BookAddRequest request);

    List<BookSearchResponse> search(String bookName);

}
