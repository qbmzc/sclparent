package com.congco.servicefeign.feign;

import com.congco.servicefeign.feign.fallback.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author congco
 * @date 19-5-13 下午2:07
 */
@FeignClient(value = "eureka-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    /**
     * hi from eureka-client
     * @param name
     * @return
     */
    @GetMapping("/")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
