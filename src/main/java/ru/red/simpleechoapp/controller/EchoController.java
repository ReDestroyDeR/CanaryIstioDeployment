package ru.red.simpleechoapp.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/")
public class EchoController {
    @GetMapping
    public String echo(@Value("${info.app.version:unknown}") String version) {
        return "Hello from Version %s [Thread: %s]".formatted(version, Thread.currentThread());
    }
}

