package com.example.reactive_programming.domain.service;

import com.example.reactive_programming.domain.model.Entry;
import reactor.core.publisher.Flux;

public interface BlogDomainAPI {

    Flux<Entry> getBlogEntries();
}
