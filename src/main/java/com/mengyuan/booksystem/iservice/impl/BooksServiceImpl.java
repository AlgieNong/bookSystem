package com.mengyuan.booksystem.iservice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mengyuan.booksystem.bo.entity.Books;
import com.mengyuan.booksystem.iservice.BooksService;
import com.mengyuan.booksystem.mapper.BooksMapper;
import org.springframework.stereotype.Service;

/**
* @author 90786
* @description 针对表【books】的数据库操作Service实现
* @createDate 2025-01-08 17:51:32
*/
@Service
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books>
    implements BooksService{

}




