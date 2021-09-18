package com.eventos.repositories;

import com.eventos.models.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface IEventRepository extends JpaRepository<Event, UUID> {
    @Query("SELECT e FROM Event e WHERE e.eventName LIKE %?1%")
    List<Event> findEventByNameContaining(String eventName);
}
