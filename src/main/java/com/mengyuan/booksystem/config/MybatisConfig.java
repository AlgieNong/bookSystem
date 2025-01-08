package com.mengyuan.booksystem.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
@MapperScan("com.mengyuan.booksystem.mapper")
public class MybatisConfig {
}
