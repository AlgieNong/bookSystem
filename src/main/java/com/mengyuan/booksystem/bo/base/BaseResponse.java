package com.mengyuan.booksystem.bo.base;

import com.mengyuan.booksystem.exception.ErrorMsg;
import lombok.Data;

/**
 * @author shanmengyuan
 * @date 2025/1/9 9:43
 */
@Data
public class BaseResponse<T> {

    private Integer code;

    private String message;

    private T data;

    private final static Integer SUCCESS_CODE = 0;

    private final static String SUCCESS_MESSAGE = "success";


    public BaseResponse() {
        this.code = SUCCESS_CODE;
        this.message = SUCCESS_MESSAGE;
    }


    public BaseResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public BaseResponse(T data) {
        this.code = SUCCESS_CODE;
        this.message = SUCCESS_MESSAGE;
        this.data = data;
    }


    public boolean isSuccess() {
        return SUCCESS_CODE.equals(this.code);
    }

    public BaseResponse(ErrorMsg errorMsg) {
        this.code = errorMsg.getCode();
        this.message = errorMsg.getMsg();
    }



}
