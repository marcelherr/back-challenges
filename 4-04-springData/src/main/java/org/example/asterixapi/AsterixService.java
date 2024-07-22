package org.example.asterixapi;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AsterixService {

    private final AsterixRepo asterixRepo;

    public List<Character> findAllCharacters() {
        List<Character> allCharacters = asterixRepo.findAll();
        return allCharacters;
    }

    public Character saveCharacter(Character character) {
        return asterixRepo.save(character);
    }

    public void deleteCharacterById(String id) {
        asterixRepo.deleteById(id);
    }

    public Character updateCharacterById(String id, Character character) {
        Optional<Character> updateCharacter = asterixRepo.findById(id);

        if (updateCharacter.isPresent()) {
            Character existingCharacter = updateCharacter.get();
            Character updatedCharacter = new Character(
                    existingCharacter.id(),
                    character.name() != null ? character.name() : existingCharacter.name(),
                    character.age(),
                    character.profession() != null ? character.profession() : existingCharacter.profession()
            );
            return asterixRepo.save(updatedCharacter);
        } else {

            System.out.println("Character mit der id: " + id + " nicht gefunden.");
            return null;
        }
    }

}
