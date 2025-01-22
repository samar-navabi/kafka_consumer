package org.samar.libraryEventsConsumer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.samar.libraryEventsConsumer.model.LibraryEvent;
import org.samar.libraryEventsConsumer.repo.LibraryEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LibraryEventsService
{
    @Autowired
    private LibraryEventRepository libraryEventRepository;

    @Autowired
    private ObjectMapper objectMapper;

    public void processLibraryEvent(ConsumerRecord<Integer, String> record) throws JsonProcessingException {
        //return null;
        LibraryEvent libraryEvent =  objectMapper.readValue(record.value(), LibraryEvent.class);
    }
}
