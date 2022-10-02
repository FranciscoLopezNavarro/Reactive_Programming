package com.example.reactive_programming.domain.service;

import com.example.reactive_programming.application.dto.EntryDTO;
import com.example.reactive_programming.domain.model.Entry;
import com.example.reactive_programming.domain.ports.output.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class BlogService implements BlogDomainAPI {

    private final EntryRepository entryRepository;

    @Autowired
    public BlogService(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }

    @Override
    public Flux<EntryDTO> getBlogEntries() {
        return Flux.fromStream(entryRepository.findAllEntries().stream().map(this::mapToDTO));
    }

    private EntryDTO mapToDTO(Entry entry) {
        return EntryDTO.builder()
                .authorName(entry.getAuthorName())
                .title(entry.getTitle())
                .text(entry.getText())
                .build();
    }
}
