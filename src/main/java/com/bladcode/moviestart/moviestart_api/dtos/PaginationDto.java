package com.bladcode.moviestart.moviestart_api.dtos;

public class PaginationDto {
    private int current_page;
    private int total_pages;
    private int total_results;
    private int per_page;
    private boolean has_next;
    private boolean has_prev;

    public PaginationDto() {
    }

    public PaginationDto(int current_page, int total_pages, int total_results, int per_page, boolean has_next, boolean has_prev) {
        this.current_page = current_page;
        this.total_pages = total_pages;
        this.total_results = total_results;
        this.per_page = per_page;
        this.has_next = has_next;
        this.has_prev = has_prev;
    }

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public boolean isHas_next() {
        return has_next;
    }

    public void setHas_next(boolean has_next) {
        this.has_next = has_next;
    }

    public boolean isHas_prev() {
        return has_prev;
    }

    public void setHas_prev(boolean has_prev) {
        this.has_prev = has_prev;
    }
}
