package com.congco.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author congco
 * @date 19-5-13 上午11:19
 */
@RestController
public class HiController {

    /**
     * port
     */
    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home(@RequestParam(defaultValue = "congco") String name){
        return "hi " +name+" i am from port:"+port;
    }
}
