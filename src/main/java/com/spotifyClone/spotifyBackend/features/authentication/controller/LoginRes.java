package com.spotifyClone.spotifyBackend.features.authentication.controller;

public class LoginRes {
    private String status;
    private String data;

    public LoginRes() {
    }

    public LoginRes(String status, String data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
