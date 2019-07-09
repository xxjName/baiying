package com.btc;

import com.btc.util.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class BaiyingTongcaiZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaiyingTongcaiZuulApplication.class, args);
    }
    //将过滤器交给Spring管理
    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }
}
