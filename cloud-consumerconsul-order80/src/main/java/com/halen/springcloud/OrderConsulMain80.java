package com.halen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created By Halen 2020/5/5 17:03
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用Consul或者Zookeeper作为注册中心注册服务
public class OrderConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain80.class, args);
    }
}
