package com.example.reactive_programming.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class Comment {
    private final String authorName;
    private final String content;
    private final LocalDateTime date;
}
