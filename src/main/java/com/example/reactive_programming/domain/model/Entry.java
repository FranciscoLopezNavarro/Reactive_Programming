package com.example.reactive_programming.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Entry {
    private final String authorName;
    private final String title;
    private final String text;
    private final List<Comment> comments;
}
