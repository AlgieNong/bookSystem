package com.mengyuan.booksystem.iservice;

import com.mengyuan.booksystem.bo.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shanmengyuan
 * @since 2025-01-15
 */
public interface UsersService extends IService<Users> {

    Users getByUsername(String username);

}
