package com.example.Consumer.RestClient;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    @Bean
    @LoadBalanced
    public RestClient.Builder builder(){
        return RestClient.builder();
    }

    @Bean
    public RestClient restClient(RestClient.Builder restClient) {
        return restClient
                .baseUrl("http://provider")
                .build();
    }

}
