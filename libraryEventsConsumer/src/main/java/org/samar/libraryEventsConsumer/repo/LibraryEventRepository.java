package org.samar.libraryEventsConsumer.repo;

import org.samar.libraryEventsConsumer.model.LibraryEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryEventRepository extends JpaRepository<LibraryEvent, Integer>
{

}
