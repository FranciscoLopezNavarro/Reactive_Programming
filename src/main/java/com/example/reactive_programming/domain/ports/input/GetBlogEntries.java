package com.example.reactive_programming.domain.ports.input;

import com.example.reactive_programming.application.dto.EntryDTO;
import reactor.core.publisher.Flux;

public interface GetBlogEntries {
    Flux<EntryDTO> execute();
}
