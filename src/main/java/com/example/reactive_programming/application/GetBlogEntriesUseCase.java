package com.example.reactive_programming.application;

import com.example.reactive_programming.application.dto.EntryDTO;
import com.example.reactive_programming.domain.model.Entry;
import com.example.reactive_programming.domain.ports.input.GetBlogEntries;
import com.example.reactive_programming.domain.service.BlogDomainAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GetBlogEntriesUseCase implements GetBlogEntries {

    private final BlogDomainAPI blogService;

    @Autowired
    public GetBlogEntriesUseCase(BlogDomainAPI blogService) {
        this.blogService = blogService;
    }

    @Override
    public Flux<EntryDTO> execute() {
        return blogService.getBlogEntries();
    }
}
