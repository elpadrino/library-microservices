package com.elpadriiino.library.client;

import com.elpadriiino.library.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "book-service", url = "${application.config.books-url}")
public interface BookClient {

    @GetMapping("/library/{library-id}")
    List<Book> findAllBooksByLibrary(@PathVariable("library-id")Integer libraryId);

}
