package org.gaipianer.consulfeignhi.feign;

import org.gaipianer.consulfeignhi.hystric.HelloServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Mr Coder on 2019/5/24.
 */
@FeignClient(value = "service-consul", fallback = HelloServiceHystric.class)
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHi();

}
