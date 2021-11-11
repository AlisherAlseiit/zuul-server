package com.example.zuulserv;

import com.example.zuulserv.filters.BaseFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulServApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServApplication.class, args);
    }

    @Bean
    public BaseFilter baseFilter() {
        return new BaseFilter();
    }
}
