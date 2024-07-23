package org.example.rickandmortyapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/characters")
public class CharacterController {

    private final ApiService apiService;

    @GetMapping
    public List<Character> getAllCharacters() {
        return apiService.loadAllCharacters();
    }
}
