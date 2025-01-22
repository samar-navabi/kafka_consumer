package org.samar.libraryEventsConsumer.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.samar.libraryEventsConsumer.model.LibraryEvent;
import org.samar.libraryEventsConsumer.service.LibraryEventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LibraryEventsConsumer
{

    @Autowired
    private LibraryEventsService libraryEventsService;

    //private ObjectMapper mapper;

    @KafkaListener(topics = {"library-events"})
    public void onMessage(ConsumerRecord<Integer, String> record) throws JsonProcessingException {
        log.info("Consumer fetch the record: {}", record);

        libraryEventsService.processLibraryEvent(record);
        //return record;

    }
}
