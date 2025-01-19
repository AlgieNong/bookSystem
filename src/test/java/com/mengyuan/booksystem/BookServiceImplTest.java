package com.mengyuan.booksystem;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mengyuan.booksystem.bo.base.BaseResponse;
import com.mengyuan.booksystem.bo.vo.request.BookAddRequest;
import com.mengyuan.booksystem.bo.vo.response.BookSearchResponse;
import com.mengyuan.booksystem.iservice.BooksService;
import com.mengyuan.booksystem.service.BookManagementService;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

/**
 * @author ShanMengYuan
 * @date 2025/1/19 17:25
 * @description TODO
 */
@SpringBootTest
public class BookServiceImplTest {

    @Autowired
    BookManagementService booksService;


    @Test
    public void testAll() {
//        testAdd();
        testSearch();
    }

    private void testAdd() {
        BookAddRequest bookAddRequest = new BookAddRequest();
        bookAddRequest.setTitle("活着");
        bookAddRequest.setAuthor("余华");
        bookAddRequest.setYear(1992);
        BaseResponse<Integer> add = booksService.add(bookAddRequest);
        Assert.isTrue(add.getCode() == 1, "添加失败");
    }

    private void testSearch() {
        BaseResponse<Page<BookSearchResponse>> search = booksService.search("活着", 1, 10);
        System.out.printf(JSON.toJSONString(search));
    }


}
