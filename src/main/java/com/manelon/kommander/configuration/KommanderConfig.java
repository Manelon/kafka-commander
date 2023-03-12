package com.manelon.kommander.configuration;

import java.util.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

/**
 * This class is used to configure the application
 * 
 * @author Manel
 *
 */
@Configuration
@ConfigurationProperties(prefix = "kommander")
@Data
public class KommanderConfig {

    private final Properties clusterProperties = new Properties();

}

