package com.mengyuan.booksystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class BookSystemApplication {

    public static void main(String[] args) {
        System.out.println("启动!");
        SpringApplication.run(BookSystemApplication.class, args);
    }

}
