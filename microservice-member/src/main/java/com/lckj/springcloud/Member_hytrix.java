package com.lckj.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 微服务监控
 * 查看地址：http://localhost:9001/hystrix（本机换机，远程环境需要替换地址）
 */

@MapperScan("com.lckj.springcloud.mapper")
@SpringBootApplication
@EnableHystrix //开启Hystrix的熔断机制
@EnableEurekaClient //将此服务注册到Eureka 服务注册中心
public class Member_hytrix {

    public static void main(String[] args) {
        SpringApplication.run(Member_hytrix.class, args);
    }
}
