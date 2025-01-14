package com.mengyuan.booksystem.service.impl;

import com.mengyuan.booksystem.service.AuthService;
import com.mengyuan.booksystem.iservice.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ShanMengYuan
 * @date 2025/1/8 20:39
 * @description 授权登录服务实现类
 */
@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UsersService userService;

    @Override
    public String login(String username, String password) {
        return null;
    }

    @Override
    public String register(String username, String password) {
        return null;
    }


}
