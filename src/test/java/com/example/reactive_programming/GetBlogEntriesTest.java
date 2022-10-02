package com.example.reactive_programming;

import com.example.reactive_programming.domain.model.Entry;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GetBlogEntriesTest {

    @Autowired
    private WebTestClient webClient;


    @Test
    @DisplayName("Should return empty list if no entries")
    void shouldReturnEmptyListIfNoEntries() {
        webClient.get().uri("/blog/entries")
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(APPLICATION_JSON_VALUE)
                .expectBodyList(Entry.class);
    }


    @Test
    @DisplayName("Should return categories if they exists categories")
    void shouldGetCategories() {
        webClient.get().uri("/blog/entries")
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(APPLICATION_JSON_VALUE)
                .expectBodyList(Entry.class);
    }


}
