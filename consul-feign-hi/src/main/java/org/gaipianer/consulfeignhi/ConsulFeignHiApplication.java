package org.gaipianer.consulfeignhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "org.gaipianer")
@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrixDashboard
public class ConsulFeignHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulFeignHiApplication.class, args);
    }

}
