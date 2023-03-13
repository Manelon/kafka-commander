package com.manelon.kommander.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;

import com.manelon.kommander.services.ClusterService;

@Component
public class KafkaClusterHealthIndicator extends AbstractHealthIndicator{

    @Autowired
    ClusterService clusterService;

    
    @Override
    protected void doHealthCheck(Builder builder) throws Exception {
        var isConnected = clusterService.isConnected();
        if(isConnected) {
            builder.up().withDetail("state", "connected to boostrap servers" + clusterService.getBootstrapServers() );
        } else {
            builder.down().withDetail("state", "unable to connect to boostrap servers " + clusterService.getBootstrapServers());
        }
    }
    
}
