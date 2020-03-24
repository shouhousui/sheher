package com.lckj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard //启动dashBoard服务监控
@SpringBootApplication
public class Histix_Dashboard_9001 {

    public static void main(String[] args) {
        SpringApplication.run(Histix_Dashboard_9001.class,args);
    }
}
