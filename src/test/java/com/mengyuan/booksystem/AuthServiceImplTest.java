package com.mengyuan.booksystem;

import com.mengyuan.booksystem.bo.base.BaseResponse;
import com.mengyuan.booksystem.exception.ErrorMsg;
import com.mengyuan.booksystem.service.AuthService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

/**
 * @author ShanMengYuan
 * @date 2025/1/19 16:32
 * @description TODO
 */
@SpringBootTest
public class AuthServiceImplTest {


    @Autowired
    private AuthService authService;

    private boolean errorEqual(BaseResponse<String> response, ErrorMsg errorMsg) {
        return response.getCode().equals(errorMsg.getCode()) && response.getMessage().equals(errorMsg.getMsg());
    }

    @Test
    public void testLoginAndRegister() {
        loginNotExist();
//        registerSuccess();
        loginError();
        loginSuccess();
        registerError();
    }

    private void loginNotExist() {
        BaseResponse<String> loginError1 = authService.login("123", "sdf");
        isTrue(errorEqual(loginError1, ErrorMsg.USERNAME_ERROR));
    }


    private void registerSuccess() {
        BaseResponse<String> register = authService.register("阿尔吉侬3", "123456");
        isTrue(register.getData().equals("注册成功"));
    }


    private void loginError() {
        BaseResponse<String> loginError1 = authService.login("阿尔吉侬3", "sdf");
        isTrue(errorEqual(loginError1, ErrorMsg.PASSWORD_ERROR));
    }

    private void loginSuccess() {
        BaseResponse<String> login = authService.login("阿尔吉侬", "123456");
        isTrue(login.getData().equals("登陆成功"));
    }

    private void registerError() {
        BaseResponse<String> registerError = authService.register("阿尔吉侬", "123456");
        isTrue(errorEqual(registerError, ErrorMsg.DATE_EXIST));
    }


    private void isTrue(boolean isTrue) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement caller = stackTrace[2];
        String callerMethodName = caller.getMethodName();
        Assert.isTrue(isTrue, callerMethodName);
    }


}
