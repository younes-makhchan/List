package com.app.list.models;

public class MyModel {
    private String title;
    private String content;

    public MyModel(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
