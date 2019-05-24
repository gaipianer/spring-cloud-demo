package org.gaipianer.consulfeignhi.controller;

import org.gaipianer.consulfeignhi.feign.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    HelloService helloService;

    @RequestMapping("hello")
    public String hello() {
        String result = "你在访问的是 conful-feign-hi port is: " + port + "/r/n";
        return result + helloService.sayHi();
    }

}
