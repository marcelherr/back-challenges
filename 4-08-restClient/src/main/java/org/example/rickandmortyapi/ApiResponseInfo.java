package org.example.rickandmortyapi;

public record ApiResponseInfo(
        int count,
        int pages,
        String next,
        String prev
) {
}
