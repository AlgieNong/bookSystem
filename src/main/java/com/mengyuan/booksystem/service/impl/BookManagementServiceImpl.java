package com.mengyuan.booksystem.service.impl;

import com.mengyuan.booksystem.bo.vo.request.BookAddRequest;
import com.mengyuan.booksystem.bo.vo.response.BookSearchResponse;
import com.mengyuan.booksystem.service.BookManagementService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shanmengyuan
 * @date 2025/1/14 18:25
 */
@Service
public class BookManagementServiceImpl implements BookManagementService {
    @Override
    public Integer add(BookAddRequest request) {
        return null;
    }

    @Override
    public List<BookSearchResponse> search(String bookName) {
        return null;
    }
}
