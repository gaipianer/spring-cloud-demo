package org.gaipianer.consulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "org.gaipianer")
@EnableDiscoveryClient
public class ConsulGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulGatewayApplication.class, args);
    }

}
