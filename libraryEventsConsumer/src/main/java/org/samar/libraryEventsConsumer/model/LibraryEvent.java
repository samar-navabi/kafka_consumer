package org.samar.libraryEventsConsumer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LibraryEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int libraryEventId;
    //@Enumerated(EnumType.STRING)
    private String  libraryEventType;
    @OneToOne
    private Book book;
}