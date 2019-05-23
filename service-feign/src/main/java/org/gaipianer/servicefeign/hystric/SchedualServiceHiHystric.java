package org.gaipianer.servicefeign.hystric;

import org.gaipianer.servicefeign.feign.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by Mr Coder on 2019/5/22.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
