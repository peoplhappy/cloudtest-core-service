package cn.cloudtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class CloudtestCoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudtestCoreServiceApplication.class, args);
	}

}
