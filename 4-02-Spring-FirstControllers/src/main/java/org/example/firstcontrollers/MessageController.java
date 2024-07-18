package org.example.firstcontrollers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {

    private List<Message> messages = new ArrayList<>();

    @PostMapping("/messages")
    public void addMessage(@RequestBody Message message) {
        messages.add(message);
    }

    @GetMapping("/messages")
    public List<Message> getMessages() {
        return messages;
    }

    @DeleteMapping("/messages/{id}")
    public void deleteMessage(@PathVariable String id) {
        messages.removeIf(message -> message.getId().equals(id));
    }
}
