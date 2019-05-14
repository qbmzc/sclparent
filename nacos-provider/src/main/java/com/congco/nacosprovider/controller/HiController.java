package com.congco.nacosprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author congco
 * @date 19-5-14 上午11:47
 */
@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    @GetMapping
    public String sayHi(@RequestParam String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
