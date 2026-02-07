package com.bladcode.moviestart.moviestart_api.service;

import com.bladcode.moviestart.moviestart_api.dtos.ApiResponse;
import com.bladcode.moviestart.moviestart_api.dtos.MovieListResponse;
import com.bladcode.moviestart.moviestart_api.model.Movie;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.util.List;

public interface MovieService {

    public ApiResponse listMoviePage(int page);
    public StreamingResponseBody streamMovie(String id);
}
