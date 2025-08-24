package com.example.Producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstanceController {

    @Value("${server.port}")
    private String port;

    private final String instanceId= java.util.UUID.randomUUID().toString();

    @GetMapping("/instance-info")
    public String instanceInfo() {
        return "Instance served at Port: " + port + " with Instance ID: " + instanceId;
    }

}