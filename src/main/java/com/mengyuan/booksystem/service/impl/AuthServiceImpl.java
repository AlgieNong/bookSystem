package com.mengyuan.booksystem.service.impl;

import com.mengyuan.booksystem.bo.base.BaseResponse;
import com.mengyuan.booksystem.bo.entity.Users;
import com.mengyuan.booksystem.exception.ErrorMsg;
import com.mengyuan.booksystem.iservice.UsersService;
import com.mengyuan.booksystem.service.AuthService;
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
    public BaseResponse<String> login(String username, String password) {
        Users user = userService.getByUsername(username);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                return new BaseResponse<>("登陆成功");
            } else {
                return new BaseResponse<>(ErrorMsg.PASSWORD_ERROR);
            }
        } else {
            return new BaseResponse<>(ErrorMsg.USERNAME_ERROR);
        }
    }

    @Override
    public BaseResponse<String> register(String username, String password) {
        Users user = userService.getByUsername(username);
        if (user != null) {
            return new BaseResponse<>(ErrorMsg.DATE_EXIST);
        } else {
            boolean save = userService.save(new Users(username, password));
            if (save) {
                return new BaseResponse<>("注册成功");
            } else {
                return new BaseResponse<>(ErrorMsg.DEFAULT_ERROR);
            }
        }
    }


}
