package com.hypertech.applet.eshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hypertech.applet.eshop.mapper")
public class EShopAppletApplication {
    public static void main(String[] args) {
        SpringApplication.run(EShopAppletApplication.class, args);
    }

}
