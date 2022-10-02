package com.example.reactive_programming.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
public class Entry {
    private final String authorName;
    private final String title;
    private final String text;
    private final List<Comment> comments;

    public Entry(String authorName, String title, String text) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        comments = new ArrayList<>();
    }
}
