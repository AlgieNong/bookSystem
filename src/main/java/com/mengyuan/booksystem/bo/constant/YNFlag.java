package com.mengyuan.booksystem.bo.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author shanmengyuan
 * @date 2025/1/14 18:37
 */
@Getter
@AllArgsConstructor
public enum YNFlag {

    YES("是",1, "1"),

    NO("否",0, "0");
    //名称
    private String name;
    //编码
    private Integer code;
    private String codeStr;

}
