package com.elpadriiino.book.controller;

import com.elpadriiino.book.model.Book;
import com.elpadriiino.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BooksController {

    private final BookService bookService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveBook(@RequestBody Book book){
        bookService.saveBook(book);
    }

    @GetMapping
    public ResponseEntity<List<Book>> findAllBooks(){
        return ResponseEntity.ok(bookService.findAllBooks());
    }

    @GetMapping("/library/{library-id}")
    public ResponseEntity<List<Book>> findAllBooks(@PathVariable("library-id") Integer libraryId){
        return ResponseEntity.ok(bookService.findAllBooksByLibrary(libraryId));
    }

}
