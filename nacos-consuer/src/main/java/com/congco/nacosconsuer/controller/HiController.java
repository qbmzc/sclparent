package com.congco.nacosconsuer.controller;

import com.congco.nacosconsuer.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author congco
 * @date 19-5-14 上午11:45
 */
@RestController
public class HiController {

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("hi")
    public String sayHi(@RequestParam String name) {
        return providerClient.hi(name);
    }
}
