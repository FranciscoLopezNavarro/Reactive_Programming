package com.example.reactive_programming.domain.service;

import com.example.reactive_programming.application.dto.EntryDTO;
import reactor.core.publisher.Flux;

public interface BlogDomainAPI {
    Flux<EntryDTO> getBlogEntries();
}
