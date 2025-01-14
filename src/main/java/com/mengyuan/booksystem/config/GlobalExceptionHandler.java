package com.mengyuan.booksystem.config;

import com.mengyuan.booksystem.bo.base.BaseResponse;
import com.mengyuan.booksystem.exception.ErrorMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author ShanMengYuan
 * @date 2025/1/8 21:39
 * @description 全局异常处理
 */
@Slf4j
@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(Exception.class)
    public BaseResponse<String> handleException(Exception e){
        log.error("全局异常捕获：{}",e.getMessage());
        return new BaseResponse<>(ErrorMsg.DEFAULT_ERROR);
    }


}
