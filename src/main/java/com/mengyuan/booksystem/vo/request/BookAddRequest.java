package com.mengyuan.booksystem.vo.request;

import lombok.Data;

/**
 * @author ShanMengYuan
 * @date 2025/1/8 20:49
 * @description 图书添加请求体
 */
@Data
public class BookAddRequest {

    private String title;

    private String author;

    private Integer year;



}
