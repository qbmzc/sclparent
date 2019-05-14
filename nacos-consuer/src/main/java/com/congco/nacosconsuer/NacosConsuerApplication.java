package com.congco.nacosconsuer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author congco
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConsuerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsuerApplication.class, args);
    }

}
