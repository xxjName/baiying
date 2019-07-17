package com.btc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.btc.dao")
public class BaiyingTongcaiBaiscdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaiyingTongcaiBaiscdataApplication.class, args);
    }

}
