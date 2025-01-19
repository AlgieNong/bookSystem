package com.mengyuan.booksystem.bo.vo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * @author ShanMengYuan
 * @date 2025/1/8 20:49
 * @description 图书添加请求体
 */
@Data
public class BookAddRequest {

    @ApiModelProperty(value = "书名",required = true)
    private String title;

    @ApiModelProperty(value = "作者",required = true)
    private String author;

    @Length(min = 4,max = 4)
    @ApiModelProperty(value = "出版年份",required = true)
    private Integer year;



}
