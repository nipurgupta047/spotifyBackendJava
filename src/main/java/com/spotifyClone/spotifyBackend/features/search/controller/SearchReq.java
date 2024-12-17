package com.spotifyClone.spotifyBackend.features.search.controller;

public class SearchReq{

    private String searchValue;

    public SearchReq(){

    }

    public SearchReq(String searchValue) {
        this.searchValue = searchValue;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }
}