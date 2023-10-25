package com.example.ownframe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ownframe.dao") //添加mapper扫描
public class OwnFrameApplication {

    public static void main(String[] args) {
        SpringApplication.run(OwnFrameApplication.class, args);
    }

}
