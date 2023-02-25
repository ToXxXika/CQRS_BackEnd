package com.example.htimesheet.Config.CommandConfig;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {
  @Value(value = "${spring.kafka.producer.bootstrap-servers}")
    private String bootstrapAddress;
  @Bean
    public KafkaAdmin kafkaAdmin(){
      Map<String,Object> configs = new HashMap<>();
        configs.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapAddress);
        return new KafkaAdmin(configs);
  }
  @Bean
    public NewTopic topic1(){
      return new NewTopic("Topic1",1,(short)1);
  }
}
