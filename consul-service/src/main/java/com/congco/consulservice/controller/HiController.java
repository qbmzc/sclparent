package com.congco.consulservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author congco
 * @date 19-5-13 下午8:16
 */
@RestController
public class HiController {

    /**
     * 服务端口
     */
    @Value("{server.port}")
    String port;

    /**
     * 测试方法
     * @param name
     * @return
     */
    @GetMapping("hi")
    public String sayHi(@RequestParam String name){
        return "hi "+ name+",i am from port:"+port;
    }
}
