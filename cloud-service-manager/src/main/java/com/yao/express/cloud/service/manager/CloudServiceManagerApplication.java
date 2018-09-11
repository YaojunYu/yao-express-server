package com.yao.express.cloud.service.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 开启eureka服务注册与发现
public class CloudServiceManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServiceManagerApplication.class, args);
	}
}
