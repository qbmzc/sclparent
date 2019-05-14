package com.congco.nacosconsuer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author congco
 * @date 19-5-14 上午11:48
 */
@FeignClient("nacos-provider")
public interface ProviderClient {

    @GetMapping("hi")
    String hi(@RequestParam(value = "name",defaultValue = "congco")String name);
}
