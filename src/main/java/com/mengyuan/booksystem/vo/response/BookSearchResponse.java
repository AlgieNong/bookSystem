package com.mengyuan.booksystem.vo.response;

import lombok.Data;

/**
 * @author ShanMengYuan
 * @date 2025/1/8 20:51
 * @description 书籍搜索相应类
 */
@Data
public class BookSearchResponse {

    private String title;

    private String author;

    private Integer year;


}
