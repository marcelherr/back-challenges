package org.example.asterixapi;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AsterixServiceTest {

    AsterixRepo asterixRepo = mock(AsterixRepo.class);
    AsterixService asterixService = new AsterixService(asterixRepo);

    @Test
    void findAllCharactersTest_EmptyList() {
        //Given

        //When
        List<Character> actual = asterixService.findAllCharacters();

        //THEN
        List<Character> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    void findAllCharactersTest() {
        //Given
        Character c1 = new Character("1", "TestC1", 33, "Tester");
        List<Character> characters = List.of(c1);

        when(asterixRepo.findAll()).thenReturn(characters);

        //When
        List<Character> actual = asterixService.findAllCharacters();

        //THEN
        List<Character> expected = new ArrayList<>();
        expected.add(new Character("1", "TestC1", 33, "Tester"));

        verify(asterixRepo).findAll();
        assertEquals(expected, actual);
    }

}