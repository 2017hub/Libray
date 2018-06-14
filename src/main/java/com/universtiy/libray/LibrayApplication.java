package com.universtiy.libray;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.universtiy.libray.mapper")
public class LibrayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrayApplication.class, args);
    }
}
