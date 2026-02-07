package com.bladcode.moviestart.moviestart_api.model;

public class Movie {

    private String id;
    private String title;
    private String titleOrigin;
    private  String classifications;
    private String releaseDate;
    private String genres;
    private  String duration;
    private  String  pais;
    private String streamUrl;

    public Movie() {
    }

    public Movie(String id, String title, String titleOrigin, String classifications, String releaseDate, String genres, String duration, String pais, String streamUrl) {
        this.id = id;
        this.title = title;
        this.titleOrigin = titleOrigin;
        this.classifications = classifications;
        this.releaseDate = releaseDate;
        this.genres = genres;
        this.duration = duration;
        this.pais = pais;
        this.streamUrl = streamUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleOrigin() {
        return titleOrigin;
    }

    public void setTitleOrigin(String titleOrigin) {
        this.titleOrigin = titleOrigin;
    }

    public String getClassifications() {
        return classifications;
    }

    public void setClassifications(String classifications) {
        this.classifications = classifications;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getStreamUrl() {
        return streamUrl;
    }

    public void setStreamUrl(String streamUrl) {
        this.streamUrl = streamUrl;
    }
}
