package org.gaipianer.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "org.gaipianer")
@EnableEurekaClient
public class EurekaClientHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientHiApplication.class, args);
    }

}
