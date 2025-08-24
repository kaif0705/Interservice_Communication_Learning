package com.example.Consumer.WebClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/web-client")
public class WebClientController {

    @Autowired
    private ProviderWebClient providerWebClient;

    @GetMapping("/instance")
    public Mono<String> instanceInfo() {
        return providerWebClient.instanceInfo();

    }

}
