package com.example.reactive_programming.domain.ports.output;

import com.example.reactive_programming.domain.model.Entry;


import java.util.List;

public interface EntryRepository {
    List<Entry> findAllEntries();
}
