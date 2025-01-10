package com.mengyuan.booksystem.controller;

import com.mengyuan.booksystem.bo.base.BaseResponse;
import com.mengyuan.booksystem.service.AuthService;
import com.mengyuan.booksystem.bo.vo.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ShanMengYuan
 * @date 2025/1/8 20:35
 * @description 授权登录控制器
 */
@RequestMapping("/auth")
@Controller
public class AuthController {

    @Autowired
    private AuthService authService;


    @PostMapping("/login")
    public BaseResponse login(@RequestBody LoginRequest request){

        return "index";
    }


    @PostMapping("/register")
    public String register(@RequestBody LoginRequest request){


        return "index";
    }





}
