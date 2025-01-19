package com.mengyuan.booksystem.iservice;

import com.mengyuan.booksystem.bo.entity.Books;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shanmengyuan
 * @since 2025-01-15
 */
public interface BooksService extends IService<Books> {

    Books getOne(String title, String author, Integer year);

    List<Books> getByTitle(String title);

}
