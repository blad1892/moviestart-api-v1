package com.bladcode.moviestart.moviestart_api.controller;


import com.bladcode.moviestart.moviestart_api.dtos.ApiResponse;
import com.bladcode.moviestart.moviestart_api.dtos.MovieListResponse;
import com.bladcode.moviestart.moviestart_api.service.MovieService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin

public class MovieController {


    private final MovieService movieService;

    public  MovieController(MovieService movieService){
        this.movieService  = movieService;
    }

    @GetMapping
    public ApiResponse<MovieListResponse> list(@RequestParam(defaultValue = "1") int page){
        return  movieService.listMoviePage(page);
    }
}
