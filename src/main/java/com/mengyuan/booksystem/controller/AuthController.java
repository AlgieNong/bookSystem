package com.mengyuan.booksystem.controller;

import com.mengyuan.booksystem.bo.base.BaseResponse;
import com.mengyuan.booksystem.bo.vo.request.LoginRequest;
import com.mengyuan.booksystem.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ShanMengYuan
 * @date 2025/1/8 20:35
 * @description 授权登录控制器
 */
@RequestMapping("/auth")
@RestController
public class AuthController {

    @Autowired
    private AuthService authService;


    @PostMapping("/login")
    public BaseResponse<String> login(@RequestBody LoginRequest request){
        return authService.login(request.getUsername(), request.getPassword());
    }


    @PostMapping("/register")
    public BaseResponse<String> register(@RequestBody LoginRequest request){
        return authService.register(request.getUsername(), request.getPassword());
    }





}
