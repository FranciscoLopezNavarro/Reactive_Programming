package com.example.reactive_programming.domain.ports.input;

import com.example.reactive_programming.domain.model.Entry;
import reactor.core.publisher.Flux;

public interface GetBlogEntries {
    Flux<Entry> execute();
}
