package com.mengyuan.booksystem.exception;

/**
 * 不支持的操作异常
 * @author shanmengyuan
 * @date 2025/1/14 18:16
 */
public class NotSupportException extends Exception{

    public NotSupportException() {
        super();
    }

    public NotSupportException(String message) {
        super(message);
    }

    public NotSupportException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotSupportException(Throwable cause) {
        super(cause);
    }


}
