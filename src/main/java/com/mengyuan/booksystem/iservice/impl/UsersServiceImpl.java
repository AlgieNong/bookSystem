package com.mengyuan.booksystem.iservice.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mengyuan.booksystem.bo.base.BaseResponse;
import com.mengyuan.booksystem.bo.entity.Users;
import com.mengyuan.booksystem.exception.ErrorMsg;
import com.mengyuan.booksystem.mapper.UsersMapper;
import com.mengyuan.booksystem.iservice.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shanmengyuan
 * @since 2025-01-15
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {


    @Autowired
    UsersMapper usersMapper;

    @Override
    public Users getByUsername(String username) {
        LambdaQueryWrapper<Users> usersLambdaQueryWrapper = new LambdaQueryWrapper<>();
        usersLambdaQueryWrapper.eq(Users::getUsername, username);
        return usersMapper.selectOne(usersLambdaQueryWrapper);
    }
}
