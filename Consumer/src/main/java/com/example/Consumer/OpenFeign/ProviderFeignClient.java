package com.example.Consumer.OpenFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name= "provider-service", url= "http://provider")
@FeignClient(name= "provider")
public interface ProviderFeignClient {

    @GetMapping("/instance-info")
    String getInstanceInfo();
}
