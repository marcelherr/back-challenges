package org.example.rickandmortyapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class ApiService {

    private final RestClient restClient;

    public ApiService() {
        restClient = RestClient.builder()
                .baseUrl("https://rickandmortyapi.com/api")
                .build();
    }

    public List<Charater> loadAllCharacters() {
        ApiResponse responseBody = restClient
                .get()
                .uri("/character")
                .retrieve()
                .body(ApiResponse.class);

        return responseBody.results();
    }
}
