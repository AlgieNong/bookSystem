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

    PARAM_MISS(1001, "参数缺失"),

    USERNAME_ERROR(1002, "用户名错误"),

    PASSWORD_ERROR(1003, "密码错误"),

    DATE_EXIST(1004, "数据已存在"),




    ;

    private Integer code;

    private String msg;






}
