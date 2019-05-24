package org.gaipianer.consulhi.controller;

import org.gaipianer.consulhi.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mr Coder on 2019/5/24.
 */
@RestController
public class HiController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hi")
    public String hi() {
        return helloService.hiService();
    }

}
