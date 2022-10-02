package com.example.reactive_programming.application.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class EntryDTO {
    String authorName;
    String title;
    String text;
}
