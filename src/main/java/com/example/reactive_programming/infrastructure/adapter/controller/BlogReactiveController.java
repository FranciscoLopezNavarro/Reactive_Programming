package com.example.reactive_programming.infrastructure.adapter.controller;

import com.example.reactive_programming.domain.model.Entry;
import com.example.reactive_programming.domain.ports.input.GetBlogEntries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/blog")
public class BlogReactiveController {

    private final GetBlogEntries getBlogEntries;

    @Autowired
    public BlogReactiveController(GetBlogEntries getBlogEntries) {
        this.getBlogEntries = getBlogEntries;
    }

    @GetMapping("/entries")
    public Flux<Entry> getCategories(){
        return getBlogEntries.execute();
    }
}
