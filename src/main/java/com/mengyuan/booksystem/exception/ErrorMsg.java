package com.mengyuan.booksystem.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author shanmengyuan
 * @date 2025/1/14 18:15
 */
@Getter
@AllArgsConstructor
public enum ErrorMsg {


    DEFAULT_ERROR(1000, "系统异常"),

    NOT_SUPPORT(1010, "不支持的操作"),



    ;

    private Integer code;

    private String msg;






}
