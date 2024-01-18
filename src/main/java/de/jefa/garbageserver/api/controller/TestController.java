package de.jefa.garbageserver.api.controller;

import de.jefa.garbageserver.api.model.TestObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public TestObject getTest() {
        return new TestObject("Aniratak", "123456", "test@gmail.com");
    }
}
