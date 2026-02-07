package com.bladcode.moviestart.moviestart_api.client.clientImp;

import com.bladcode.moviestart.moviestart_api.client.VimeusClient;
import com.bladcode.moviestart.moviestart_api.dtos.ApiResponse;
import com.bladcode.moviestart.moviestart_api.dtos.MovieListResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;


@Component
public class VimeusClientImp  implements VimeusClient {


    private final WebClient webClient;

    public VimeusClientImp(
            @Value("${vimeus.base-url}") String baseUrl,
            @Value("${vimeus.api-key}") String apiKey
    ) {
        this.webClient = WebClient.builder()
                .baseUrl(baseUrl)
                .defaultHeader("X-API-Key", apiKey)
                .build();
    }

    @Override
    public ApiResponse<MovieListResponse> getMovies(int page) {

     return   webClient.get()
                .uri(uri -> uri
                        .path("/listing/movies")
                        .queryParam("page", page)
                        .build())
              .accept()
                .retrieve()
                .bodyToMono(
                        new ParameterizedTypeReference<ApiResponse<MovieListResponse>>() {
                        })
                .block();
    }
}
