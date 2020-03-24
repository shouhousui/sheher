package com.lckj.springcloud;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@MapperScan("com.lckj.springcloud.mapper")
@SpringBootApplication
@EnableHystrix //开启Hystrix的熔断机制
@EnableEurekaClient //将此服务注册到Eureka 服务注册中心
public class Hr_hytrix {

    public static void main(String[] args) {
        SpringApplication.run(Hr_hytrix.class, args);
    }
}
