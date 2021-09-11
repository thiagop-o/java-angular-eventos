package com.eventos.repositories;

import com.eventos.models.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IEventRepository extends JpaRepository<Event, UUID> {

}
