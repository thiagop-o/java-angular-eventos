package com.eventos.services.contracts;

import com.eventos.models.entities.Event;

import java.util.List;

public interface IEventService {

    //GET All Events - Pegar todos eventos
    List<Event> findAllEvents();

    //GET All Events by name - Pegar todos eventos por nome
    List<Event> findAllEventsByName(String eventName);

    //POST Event - Criar Evento
    Event createEvent(Event event);
}
