package com.example.htimesheet.Listener;

import com.example.htimesheet.Repositories.TacheRepository;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public class TacheEventListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(TacheEventListener.class);
    private final ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    private final TacheRepository tacheRepository;
    @Autowired
    public TacheEventListener(TacheRepository tacheRepository) {
        this.tacheRepository = tacheRepository;
    }
    @KafkaListener(topics = "${kafka.topic.name",groupId = "${kafka.group.id}")
    void listener(String message){
        try {
            Map<String,String> TacheEvent = objectMapper.readValue(message, Map.class);
            if(TacheEvent.get("type").equals("CREATE")){

            }

        }catch (Exception E){
            LOGGER.error("Error while processing message: {}", message, E);
        }
    }
}
