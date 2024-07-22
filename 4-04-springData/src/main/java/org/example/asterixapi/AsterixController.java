package org.example.asterixapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/characters")
public class AsterixController {


    private final AsterixService asterixService;

    public AsterixController(AsterixService asterixService) {
        this.asterixService = asterixService;
    }

    @GetMapping
    public List<Character> getAllCharacters() {
        return asterixService.findAllCharacters();
    }

    @PostMapping
    public Character addCharacter(@RequestBody Character character) {
        return asterixService.saveCharacter(character);
    }

    @DeleteMapping("/{id}")
    public void deleteCharacterById(@PathVariable String id) {
        asterixService.deleteCharacterById(id);
    }

    @PutMapping("/{id}")
    public Character updateCharacterById(@PathVariable String id, @RequestBody Character character) {
        return asterixService.updateCharacterById(id, character);
    }

}
