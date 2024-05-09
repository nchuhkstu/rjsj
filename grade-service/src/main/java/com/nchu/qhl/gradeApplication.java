package com.nchu.qhl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nchu.qhl.mapper")
public class gradeApplication {
    public static void main(String[] args) {
        SpringApplication.run(gradeApplication.class,args);
    }
}
