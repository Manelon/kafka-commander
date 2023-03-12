package com.manelon.kommander;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.EmbeddedKafkaBroker;

import com.manelon.kommander.configuration.KommanderConfig;
import com.manelon.kommander.utils.EmbeddedKafkaHolder;

@SpringBootTest
class KommanderApplicationTests {

	@Autowired
	private KommanderConfig config;
	
	private static final EmbeddedKafkaBroker broker = EmbeddedKafkaHolder.getEmbeddedKafka();
	@Test
	void contextLoads() {
	}

	@Test
	void configuration_is_loaded() {
		//test config is not null
		assert(config != null);
		assertEquals(config.getClusterProperties().getProperty(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG),broker.getBrokersAsString());
		
	}




}
