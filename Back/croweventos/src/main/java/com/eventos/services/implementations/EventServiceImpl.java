package com.eventos.services.implementations;

import com.eventos.repositories.IEventRepository;
import com.eventos.services.contracts.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements IEventService{
    IEventRepository iEventRepository;

    @Autowired
    public EventServiceImpl(IEventRepository iEventRepository) {
        this.iEventRepository = iEventRepository;
    }
}
