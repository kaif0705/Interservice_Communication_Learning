package com.example.Consumer.RestClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest-client")
public class RestClientController {

    @Autowired
    private ProviderRestClient restClient;

    @GetMapping("/instance-info")
    public String instanceInfo() {
        return restClient.instanceInfo();
    }

}
