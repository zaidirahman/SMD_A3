package com.example.a3;

public class PasswordEntry {
    private String username;
    private String password;
    private String websiteUrl;

    public PasswordEntry(String username, String password, String websiteUrl) {
        this.username = username;
        this.password = password;
        this.websiteUrl = websiteUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }
}
