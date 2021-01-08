package com.vip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerAppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerAppDemoApplication.class, args);
	}

}
