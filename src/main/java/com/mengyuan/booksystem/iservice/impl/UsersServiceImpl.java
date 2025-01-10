package com.mengyuan.booksystem.iservice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mengyuan.booksystem.bo.entity.Users;
import com.mengyuan.booksystem.iservice.UsersService;
import com.mengyuan.booksystem.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author 90786
* @description 针对表【users】的数据库操作Service实现
* @createDate 2025-01-08 17:51:32
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




