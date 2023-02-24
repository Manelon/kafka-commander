package com.manelon.kommander.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.manelon.kommander.configuration.KommanderConfig;

import lombok.Data;

@Data
@Service

public class ClusterService {
    private String bootstrapServers;
    private String schemaRegistryUrl;

    @Autowired 
    public ClusterService(KommanderConfig config) {
        this.bootstrapServers = config.getCluster().getBootstrapServers();
        this.schemaRegistryUrl = config.getCluster().getSchemaRegistryUrl();
    }
    
    public ClusterService(String bootstrapServers, String schemaRegistryUrl) {
        this.bootstrapServers = bootstrapServers;
        this.schemaRegistryUrl = schemaRegistryUrl;
    }

    //Get list of topics of the cluster using kafka admin client
    public void getTopics() {
        
    }            
}

