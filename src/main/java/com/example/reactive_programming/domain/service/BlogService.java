package com.example.reactive_programming.domain.service;

import com.example.reactive_programming.domain.model.Entry;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class BlogService implements BlogDomainAPI {
    @Override
    public Flux<Entry> getBlogEntries() {
        return null;
    }
}
