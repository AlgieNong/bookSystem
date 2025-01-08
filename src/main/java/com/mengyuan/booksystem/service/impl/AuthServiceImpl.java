package com.mengyuan.booksystem.service.impl;

import com.mengyuan.booksystem.service.AuthService;
import com.mengyuan.booksystem.iservice.UsersService;
import io.swagger.v3.oas.annotations.servers.Server;

/**
 * @author ShanMengYuan
 * @date 2025/1/8 20:39
 * @description 授权登录服务实现类
 */
@Server
public class AuthServiceImpl implements AuthService {

    private UsersService userService;

    public String login(String username, String password) {

    }

    @Override
    public String register(String username, String password) {


    }


}
