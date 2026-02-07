package com.bladcode.moviestart.moviestart_api.client;

import com.bladcode.moviestart.moviestart_api.dtos.ApiResponse;
import com.bladcode.moviestart.moviestart_api.dtos.MovieListResponse;

public interface VimeusClient {

    public ApiResponse<MovieListResponse> getMovies(int page);
}
