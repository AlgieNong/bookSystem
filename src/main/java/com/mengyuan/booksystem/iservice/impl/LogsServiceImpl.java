package com.mengyuan.booksystem.iservice.impl;

import com.mengyuan.booksystem.bo.entity.Logs;
import com.mengyuan.booksystem.mapper.LogsMapper;
import com.mengyuan.booksystem.iservice.LogsService;
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
public class LogsServiceImpl extends ServiceImpl<LogsMapper, Logs> implements LogsService {

}
