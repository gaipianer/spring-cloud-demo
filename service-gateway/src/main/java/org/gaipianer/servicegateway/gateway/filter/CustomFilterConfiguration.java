package org.gaipianer.servicegateway.gateway.filter;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Created by Mr Coder on 2019/5/23.
 */
@SpringBootConfiguration
public class CustomFilterConfiguration {

    @Bean
    public RequestTimeGatewayFilterFactory elapsedGatewayFilterFactory() {
        return new RequestTimeGatewayFilterFactory();
    }

}
