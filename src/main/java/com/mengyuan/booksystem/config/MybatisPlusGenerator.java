package com.mengyuan.booksystem.config;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * @author shanmengyuan
 * @date 2025/1/14 19:14
 */
public class MybatisPlusGenerator {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:sqlite:database/identifier.sqlite",null,null)
                .globalConfig(builder -> {
                    builder.author("shanmengyuan")
                            .enableSwagger()
                            .outputDir("D:\\work data\\JavaProject\\bookSystem\\src\\main\\java")
                            .enableSwagger()
                            .commentDate("yyyy-MM-dd")
                            .build();
                })
                .packageConfig(builder -> {
                    builder.parent("com.mengyuan.booksystem")
                            .entity("bo.entity")
                            .service("iservice")
                            .serviceImpl("iservice.impl")
                            .mapper("mapper")
                            .xml("mapper")
                            .build();
                })
                .strategyConfig(builder -> {
                    builder.addInclude("Users")
                            .entityBuilder()
                            .disableSerialVersionUID()
                            .enableLombok()
                            .enableFileOverride()
                            .enableTableFieldAnnotation()
                            .logicDeleteColumnName("is_deleted")
                            .idType(IdType.AUTO)
                            .build();
                    builder.serviceBuilder()
                            .superServiceClass(IService.class)
                            .superServiceImplClass(ServiceImpl.class)
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            .build();
                    builder.mapperBuilder()
                            .superClass(BaseMapper.class)
                            .build();
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }


}