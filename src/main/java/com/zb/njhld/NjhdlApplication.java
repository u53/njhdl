package com.zb.njhld;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@MapperScan(value = "com.zb.njhld.dao")
public class NjhdlApplication {

    public static void main(String[] args) {
        SpringApplication.run(NjhdlApplication.class, args);
    }

}
