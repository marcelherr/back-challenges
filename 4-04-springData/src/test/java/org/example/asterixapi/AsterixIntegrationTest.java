package org.example.asterixapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

import java.awt.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class AsterixIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    AsterixRepo asterixRepo;

    @Test
    @DirtiesContext
    void getAllCharacters() throws Exception {
        //Given
        asterixRepo.save(new Character("1", "Tester1", 22, "Testing"));
        //When
        mockMvc.perform(get("/api/characters"))

                //Then
                .andExpect(status().isOk())
                .andExpect(content().json("""
                        [
                        {
                        "name":"Tester1",
                        "age":22,
                        "profession":"Testing"
                        }
                        ]
                        """));
    }

    @Test
    @DirtiesContext
    void postCharacter() throws Exception {
        //Given
        //When
        mockMvc.perform(post("/api/characters")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                                {
                                "name":"Tester2",
                                "age":33,
                                "profession":"Testing2"
                                }
                                """))
                .andExpect(jsonPath("$.id").exists());
    }

    @Test
    @DirtiesContext
    void getCharacterById() throws Exception {
        //Given
        asterixRepo.save(new Character("1", "Tester1", 22, "Testing"));
        //When
        mockMvc.perform(get("/api/characters/1"))
    }
}
