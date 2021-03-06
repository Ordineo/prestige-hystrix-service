package be.connectedcar.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableEurekaClient
public class HystrixServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixServiceApplication.class, args);
	}
}
