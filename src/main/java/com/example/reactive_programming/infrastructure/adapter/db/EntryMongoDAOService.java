package com.example.reactive_programming.infrastructure.adapter.db;

import com.example.reactive_programming.domain.model.Entry;
import com.example.reactive_programming.domain.ports.output.EntryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntryMongoDAOService implements EntryRepository {
    @Override
    public List<Entry> findAllEntries() {
        return new ArrayList<>();
    }
}
