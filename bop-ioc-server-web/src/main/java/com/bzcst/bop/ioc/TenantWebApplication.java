package com.bzcst.bop.ioc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动类
 *
 * @author 何昌稳
 * @version 1.0
 * @since 2021/8/17
 */
@EnableScheduling
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan({"com.bzcst.bop.ioc.*.mapper","com.bzcst.bop.ioc.*.*.mapper"})
public class TenantWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TenantWebApplication.class, args);
    }

}
