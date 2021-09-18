package com.eventos.controllers;


import com.eventos.configs.SwaggerConfig;
import com.eventos.models.entities.Event;
import com.eventos.services.implementations.EventServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Api(value = "Event", tags = {SwaggerConfig.Tag_1})
@RestController
@RequestMapping("api/v1/events")
public class EventController {
    @Autowired
    EventServiceImpl eventService;

    @GetMapping
    @ApiOperation(value = "Get Event", tags = {SwaggerConfig.Tag_1})
    public ResponseEntity<List<Event>> findAllEvents(){
        List<Event> list = eventService.findAllEvents();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/name/{eventName}")
    @ApiOperation(value = "Get Event by Name", tags = {SwaggerConfig.Tag_1})
    public ResponseEntity<List<Event>> findAllEventsByName(@PathVariable String eventName){
        List<Event> list = eventService.findAllEventsByName(eventName);
        return ResponseEntity.ok(list);
    }

    @PostMapping
    @ApiOperation(value = "Create Event", tags = {SwaggerConfig.Tag_1})
    public ResponseEntity<Event> createEvent(@RequestBody Event event){
        event = eventService.createEvent(event);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(event.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }





}
