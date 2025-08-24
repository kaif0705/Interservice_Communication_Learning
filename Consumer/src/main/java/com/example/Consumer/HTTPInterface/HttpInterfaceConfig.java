package com.example.Consumer.HTTPInterface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class HttpInterfaceConfig {

    @Bean
    @LoadBalanced
    //Load balanced instance of WebClient
    public WebClient.Builder getWebClient() {
        return WebClient.builder();
    }

    @Bean
    public ProviderHttpInterface webClientHttpInterface(@Qualifier("getWebClient") WebClient.Builder builder) {
        WebClient webClient = builder
                .baseUrl("http://provider")
                .build();

        WebClientAdapter adapter = WebClientAdapter.create(webClient);

        HttpServiceProxyFactory factory = HttpServiceProxyFactory
                .builderFor(adapter)
                .build();

        return factory.createClient(ProviderHttpInterface.class);
    }

}
