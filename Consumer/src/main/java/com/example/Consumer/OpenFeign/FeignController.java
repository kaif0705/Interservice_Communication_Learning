package com.example.Consumer.OpenFeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/feign")
public class FeignController {

    @Autowired
    private ProviderFeignClient providerFeignClient;

    @GetMapping("/instance")
    public String getInstanceInfo() {
        return providerFeignClient.getInstanceInfo();
    }

}
