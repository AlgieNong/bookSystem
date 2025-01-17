package com.mengyuan.booksystem.iservice.impl;

import com.mengyuan.booksystem.bo.entity.Books;
import com.mengyuan.booksystem.mapper.BooksMapper;
import com.mengyuan.booksystem.iservice.BooksService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books> implements BooksService {

}
