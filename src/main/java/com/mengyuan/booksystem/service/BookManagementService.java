package com.mengyuan.booksystem.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mengyuan.booksystem.bo.base.BaseResponse;
import com.mengyuan.booksystem.bo.vo.request.BookAddRequest;
import com.mengyuan.booksystem.bo.vo.response.BookSearchResponse;

/**
 * @author shanmengyuan
 * @date 2025/1/14 18:25
 */
public interface BookManagementService {

    BaseResponse<Integer> add(BookAddRequest request);

    BaseResponse<Page<BookSearchResponse>> search(String bookName, Integer currentPage, Integer pageSize);

}
