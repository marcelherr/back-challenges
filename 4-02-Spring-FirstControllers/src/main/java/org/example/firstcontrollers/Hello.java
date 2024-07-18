package org.example.firstcontrollers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Hello {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @PostMapping("/hello/{name}")
    public String helloSomeone(@PathVariable String name) {
        return "Hello, " + name + " !";
    }
}
