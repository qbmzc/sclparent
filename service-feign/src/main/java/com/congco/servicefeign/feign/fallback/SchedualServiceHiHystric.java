package com.congco.servicefeign.feign.fallback;

import com.congco.servicefeign.feign.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author congco
 * @date 19-5-13 下午2:21
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name+ " server error";
    }
}
