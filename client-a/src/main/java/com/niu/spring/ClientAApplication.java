package com.niu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 启动类
 *
 * @version 1.0 [2021/03/23 14:33]
 * @author [nza]
 * @createTime [2021/03/23 14:33]
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ClientAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientAApplication.class, args);
    }
}
