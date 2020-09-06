package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //@EnableEurekaServer注解的作用：启用服务注册中心功能
@SpringBootApplication
public class CloudEurekaRegistryCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaRegistryCenterApplication.class, args);
    }

}
