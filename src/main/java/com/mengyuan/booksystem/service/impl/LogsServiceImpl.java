package com.mengyuan.booksystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mengyuan.booksystem.entity.Logs;
import com.mengyuan.booksystem.service.LogsService;
import com.mengyuan.booksystem.mapper.LogsMapper;
import org.springframework.stereotype.Service;

/**
* @author 90786
* @description 针对表【logs】的数据库操作Service实现
* @createDate 2025-01-08 17:51:32
*/
@Service
public class LogsServiceImpl extends ServiceImpl<LogsMapper, Logs>
    implements LogsService{

}




