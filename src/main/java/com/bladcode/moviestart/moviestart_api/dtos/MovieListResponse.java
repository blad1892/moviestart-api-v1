package com.bladcode.moviestart.moviestart_api.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieListResponse {
    @JsonProperty("pages")
    private Long pages;

    @JsonProperty("result")
    private List<MovieDto> result;

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public List<MovieDto> getMovies() {
        return result;
    }

    public void setMovies(List<MovieDto> result) {
        this.result = result;
    }
}
