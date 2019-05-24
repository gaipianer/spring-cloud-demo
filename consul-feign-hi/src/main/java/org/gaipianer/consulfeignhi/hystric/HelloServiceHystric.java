package org.gaipianer.consulfeignhi.hystric;

import org.gaipianer.consulfeignhi.feign.HelloService;
import org.springframework.stereotype.Component;

/**
 * Created by Mr Coder on 2019/5/24.
 */
@Component
public class HelloServiceHystric implements HelloService {
    @Override
    public String sayHi() {
        return "sorry, it's does not work!";
    }
}
