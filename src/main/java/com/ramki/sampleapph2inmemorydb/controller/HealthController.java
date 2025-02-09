package com.ramki.sampleapph2inmemorydb.controller;

import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/health")
public class HealthController {
    private final HealthEndpoint healthEndpoint;

    private final BuildProperties buildProperties;

    public HealthController(HealthEndpoint healthEndpoint, BuildProperties buildProperties) {
        this.healthEndpoint = healthEndpoint;
        this.buildProperties = buildProperties;
    }



    @GetMapping("/check")
    public Map<String,Object> check() {
        return Map.of(
                "application", buildProperties.getName(),
                "status", healthEndpoint.health().getStatus().getCode(),
                "version", buildProperties.getVersion()
        );
    }
}
