package com.elpadriiino.library.controller;

import com.elpadriiino.library.dto.FullLibraryResponse;
import com.elpadriiino.library.model.Library;
import com.elpadriiino.library.service.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/libraries")
@RequiredArgsConstructor
public class LibraryController {

    private final LibraryService libraryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Library library){
        libraryService.saveLibrary(library);
    }

    @GetMapping
    public ResponseEntity<List<Library>> findAllLibraries(){
        return ResponseEntity.ok(libraryService.findAllLibraries());
    }

    @GetMapping("/with-books/{library-id}")
    public ResponseEntity<FullLibraryResponse> findAllBooksByLibraryId(@PathVariable("library-id")Integer libraryId){
        return ResponseEntity.ok(libraryService.findLibrariesWithBooks(libraryId));
    }
}
