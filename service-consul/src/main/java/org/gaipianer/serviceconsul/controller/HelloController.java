package org.gaipianer.serviceconsul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mr Coder on 2019/5/24.
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String hello() {
        return "Hi I'm service consul, my port is: " + port;
    }

}
