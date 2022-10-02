package com.example.reactive_programming.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Blog {
    private List<Entry> entries;
}
