package com.manelon.kommander.utils;

import org.apache.kafka.common.KafkaException;
import org.springframework.kafka.test.EmbeddedKafkaBroker;

/**
 * This class generate an embedded kafka broker in order to have a kafka cluster for testing
 * Following the recommendations of the spring-kafka documentation: https://docs.spring.io/spring-kafka/docs/current/reference/html/#same-broker-multiple-tests
 */
public final class EmbeddedKafkaHolder {
    private static EmbeddedKafkaBroker embeddedKafka = new EmbeddedKafkaBroker(1, false)
            .brokerListProperty("kommander.clusterProperties.bootstrap.servers");

    private static boolean started;

    public static EmbeddedKafkaBroker getEmbeddedKafka() {
        if (!started) {
            try {
                embeddedKafka.afterPropertiesSet();
            }
            catch (Exception e) {
                throw new KafkaException("Embedded broker failed to start", e);
            }
            started = true;
        }
        return embeddedKafka;
    }

    private EmbeddedKafkaHolder() {
        super();
    }

}
