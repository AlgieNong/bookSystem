package com.mengyuan.booksystem.service;

import com.mengyuan.booksystem.bo.base.BaseResponse;

public interface AuthService {

    BaseResponse<String> login(String username, String password);

    BaseResponse<String> register(String username, String password);

}
