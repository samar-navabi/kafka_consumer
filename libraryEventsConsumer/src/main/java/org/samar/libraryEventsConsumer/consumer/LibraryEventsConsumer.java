package org.samar.libraryEventsConsumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LibraryEventsConsumer
{

    @KafkaListener(topics = {"library-events"})
    public ConsumerRecord<Integer, String> onMessage(ConsumerRecord<Integer, String> record)
    {
        log.info("Consumer fetch the record: {}", record);
        //log.info(record.value());

        String data = record.value();
        System.out.println(data);

        return record;
    }
}
