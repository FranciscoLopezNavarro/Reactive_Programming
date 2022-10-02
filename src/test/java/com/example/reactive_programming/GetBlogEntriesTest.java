package com.example.reactive_programming;

import com.example.reactive_programming.domain.model.Entry;
import com.example.reactive_programming.domain.ports.output.EntryRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GetBlogEntriesTest {

    @Autowired
    private WebTestClient webClient;

    @MockBean
    private EntryRepository entryRepository;

    @Test
    @DisplayName("Should return empty list if no entries")
    void shouldReturnEmptyListIfNoEntries() {
        webClient.get().uri("/blog/entries")
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(APPLICATION_JSON_VALUE)
                .expectBodyList(Entry.class)
                .value(List::size, equalTo(0));

    }


    @Test
    @DisplayName("Should return list with entries. (Mocked)")
    void shouldReturnEntriesListMocked() {
        var entryList = new ArrayList<Entry>();
        var entry = new Entry("User1", "Reactive programming is good", "Hello Reactive-World!");
        var entry2 = new Entry("User1", "Reactive programming is bad", "Bye Reactive-World!");

        entryList.add(entry);
        entryList.add(entry2);

        when(entryRepository.findAllEntries()).thenReturn(entryList);

        webClient.get().uri("/entries")
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(APPLICATION_JSON_VALUE)
                .expectBodyList(Entry.class)
                .value(List::size, equalTo(2));
    }

}
