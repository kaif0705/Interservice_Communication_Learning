package com.example.Consumer.RestTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest-template")
public class RestTemplateController {

    @Autowired
    private RestTemplateClient client;

    @GetMapping("/instance")
    public String getInstance() {
        return client.instanceInfo();
    }
}
