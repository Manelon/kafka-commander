package com.manelon.kommander;

import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.admin.TopicListing;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.manelon.kommander.services.ClusterService;
import com.manelon.kommander.utils.EmbeddedKafkaHolder;

@SpringBootTest
public class ClusterServiceTest {
    static {
        EmbeddedKafkaHolder.getEmbeddedKafka().addTopics("topic1", "topic2");
    }
    @Autowired
    ClusterService clusterService;
    //Test if the cluster service is able to retrieve the list of topics of the cluster
    @Test
    public void testGetTopics() throws InterruptedException, ExecutionException {
       var topics =  clusterService.getTopics();
       assert(topics != null);

       //Assert the topics names are topic1 and topic2
       for (TopicListing topic : topics) {
           assert(topic.name().equals("topic1") || topic.name().equals("topic2"));}
       
    }
}
