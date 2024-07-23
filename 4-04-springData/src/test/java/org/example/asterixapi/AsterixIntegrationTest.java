package org.example.asterixapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

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
        asterixRepo.save(new Character("1","Tester1", 22, "Testing" ));
        //When
        mockMvc.perform
    }
}
