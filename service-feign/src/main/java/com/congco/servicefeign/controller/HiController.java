package com.congco.servicefeign.controller;

import com.congco.servicefeign.feign.SchedualServiceHi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author congco
 * @date 19-5-13 下午2:10
 */
@RestController
public class HiController {

    private final SchedualServiceHi schedualServiceHi;

    public HiController(SchedualServiceHi schedualServiceHi) {
        this.schedualServiceHi = schedualServiceHi;
    }

    /**
     * say hi from eureka-client
     * @param name
     * @return
     */
    @GetMapping("hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
