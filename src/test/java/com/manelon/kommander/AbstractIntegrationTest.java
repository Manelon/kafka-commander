package com.manelon.kommander;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
public abstract class AbstractIntegrationTest {
    
}

// @Bean
//   public SchemaRegistryClient schemaRegistryClient(
//       @Value("${spring.kafka.properties.schema.registry.url}") String endpoint) {
//     SchemaRegistryClient client = MockSchemaRegistry.getClientForScope(endpoint);
//     return client;
// }