package com.manelon.kommander;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.manelon.kommander.configuration.KommanderConfig;
import com.manelon.kommander.services.ClusterService;

@SpringBootTest
class KommanderApplicationTests {
	@Autowired
	private KommanderConfig config;

	// @Autowired
	// private ClusterService clusterService;

	@Test
	void contextLoads() {
	}

	@Test
	void configuration_is_loaded() {
		//test config is not null
		assert(config != null);
		//test cluster is not null
		assert(config.getCluster() != null);
		//test bootstrap servers is not null
		assert(config.getCluster().getBootstrapServers() != null);
		
	}

	// @Test 
	// void cluster_service_is_loaded() {
	// 	//test cluster service is not null
	// 	assert(clusterService != null);
		
	// }

}
