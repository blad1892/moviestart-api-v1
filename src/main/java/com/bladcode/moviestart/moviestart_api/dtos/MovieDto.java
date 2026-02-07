package com.bladcode.moviestart.moviestart_api.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDto {

    @JsonProperty("download_url")
    private String download_url;

    @JsonProperty("embed_url")
    private String embed_url;


    @JsonProperty("imdb_id")
    private String imdb_id;
    private String poster;
    private String quality;
    private String title;

    @JsonProperty("tmdb_id")
    private Long tmdb_id;

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    public String getEmbed_url() {
        return embed_url;
    }

    public void setEmbed_url(String embed_url) {
        this.embed_url = embed_url;
    }
    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }
    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTmdb_id() {
        return tmdb_id;
    }

    public void setTmdb_id(Long tmdb_id) {
        this.tmdb_id = tmdb_id;
    }
}
