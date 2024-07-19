package org.example.asterixapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AsterixController {

    private final AsterixRepo asterixRepo;

    public AsterixController(AsterixRepo asterixRepo) {
        this.asterixRepo = asterixRepo;
    }

    @GetMapping("/characters")
    public List<Character> getAllCharacters() {
        List<Character> allCharacters = asterixRepo.findAll();
        return allCharacters;
    }

}
