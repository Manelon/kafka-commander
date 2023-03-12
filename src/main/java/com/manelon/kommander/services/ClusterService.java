package com.manelon.kommander.services;

import java.util.Collection;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.TopicListing;

import com.manelon.kommander.configuration.KommanderConfig;


@Service

public class ClusterService {
    
    private Properties clusterProperties;
    private AdminClient adminClient;

    public String getBootstrapServers() {
        return clusterProperties.getProperty(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG);
    }

    public ClusterService(KommanderConfig config) {
        this.clusterProperties = config.getClusterProperties();
        this.adminClient = AdminClient.create(clusterProperties);
    }
    

    public Collection<TopicListing> getTopics() throws InterruptedException, ExecutionException {
       return adminClient.listTopics().listings().get();
    }
}

