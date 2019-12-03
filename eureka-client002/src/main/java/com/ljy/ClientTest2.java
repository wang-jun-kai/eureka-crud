package com.ljy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @类名: com.ljy
 * @作者:
 * @创建时间: 2019-12-02 20:03
 * @描述:
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ClientTest2 {

    public static void main(String[] args){
        SpringApplication.run(ClientTest2.class);
    }
}
