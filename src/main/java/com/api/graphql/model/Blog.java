package com.api.graphql.model;

public class Blog {

    private final String title;
    private final String content;

    public Blog(String title, String content) {
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