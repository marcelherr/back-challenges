package org.example.rickandmortyapi;

import java.util.List;

public record ApiResponse(
        ApiResponseInfo info,
        List<Charater> results
) {

}
