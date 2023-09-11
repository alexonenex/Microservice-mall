package com.gupaoedu.vip.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author 赵浩成
 * @date 2023/09/01
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.gupaoedu.vip.mall.user.mapper"})
public class MallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallUserApplication.class,args);
    }
}
