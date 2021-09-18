package com.eventos.services.implementations;


import com.eventos.models.entities.Event;
import com.eventos.repositories.IEventRepository;
import com.eventos.services.contracts.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements IEventService {
    IEventRepository iEventRepository;

    @Autowired
    public EventServiceImpl(IEventRepository iEventRepository) {
        this.iEventRepository = iEventRepository;
    }

    @Override
    public List<Event> findAllEvents() {
        return iEventRepository.findAll();
    }

    @Override
    public List<Event> findAllEventsByName(String eventName) {
        return iEventRepository.findEventByNameContaining(eventName);
    }

    @Override
    public Event createEvent(Event event) {
        return iEventRepository.save(event);
    }
}
