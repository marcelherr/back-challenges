package org.example.asterixapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/characters")
public class AsterixController {

    private final AsterixRepo asterixRepo;

    public AsterixController(AsterixRepo asterixRepo) {
        this.asterixRepo = asterixRepo;
    }

    @GetMapping
    public List<Character> getAllCharacters() {
        List<Character> allCharacters = asterixRepo.findAll();
        return allCharacters;
    }

    @PostMapping
    public Character addCharacter(@RequestBody Character character) {
        return asterixRepo.save(character);
    }

    @DeleteMapping("/{id}")
    public void deleteCharacterById(@PathVariable String id) {
        asterixRepo.deleteById(id);
    }
}
