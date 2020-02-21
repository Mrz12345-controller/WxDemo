package net.com.wxdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.com.wxdemo.mapper")
public class WxdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxdemoApplication.class, args);
    }

}
