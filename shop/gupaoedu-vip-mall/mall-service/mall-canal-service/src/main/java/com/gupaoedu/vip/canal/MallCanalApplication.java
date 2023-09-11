package com.gupaoedu.vip.canal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 赵浩成
 * @date 2023/09/07
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients(basePackages ={"com.gupaoedu.vip.mall.page.feign","com.gupaoedu.vip.mall.search.feign","com.gupaoedu.vip.mall.goods.feign","com.gupaoedu.vip.mall.seckill.feign"})
public class MallCanalApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCanalApplication.class,args);
    }
}
