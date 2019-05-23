package org.gaipianer.servicemiya.controller;

import brave.sampler.Sampler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Mr Coder on 2019/5/22.
 */
@RestController
public class MiyaController {

    private static final Logger LOG = LoggerFactory.getLogger(MiyaController.class);

    @Value("${server.port}")
    String port;

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/miya")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        LOG.info( "calling trace service-miya ");
        return restTemplate.getForObject("http://localhost:8766/info", String.class);
    }

    @RequestMapping("/info")
    public String info(){
        LOG.info( "calling trace service-miya ");

        return "i'm service-miya";

    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

}
