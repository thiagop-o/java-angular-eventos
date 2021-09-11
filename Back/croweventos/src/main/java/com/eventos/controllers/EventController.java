package com.eventos.controllers;

import com.eventos.configs.SwaggerConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Event", tags = {SwaggerConfig.Tag_1})
@RestController
@RequestMapping("api/v1/events")
public class EventController {

    @GetMapping
    @ApiOperation(value = "Get Event", tags = {SwaggerConfig.Tag_1})
    public String get(){
        return "Funcionou corretamente";
    }
}
