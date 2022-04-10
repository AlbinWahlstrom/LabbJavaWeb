package com.example.labb.models;

public class LabbPost {


    static int idCounter = 1;
    private final int id;
    private String title;
    private String message;

    public LabbPost(String title, String message) {
        this.id = idCounter;
        this.title = title;
        this.message = message;
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
