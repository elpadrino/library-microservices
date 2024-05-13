package com.elpadriiino.library.service;

import com.elpadriiino.library.client.BookClient;
import com.elpadriiino.library.dto.FullLibraryResponse;

import com.elpadriiino.library.model.Library;
import com.elpadriiino.library.repository.LibraryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class LibraryService {

    private final LibraryRepository libraryRepository;

    private final BookClient bookClient;

    public void saveLibrary( Library library ){
        libraryRepository.save(library);
    }

    public List<Library> findAllLibraries(){
        return libraryRepository.findAll();
    }

    public FullLibraryResponse findLibrariesWithBooks(Integer libraryId){
        var library = libraryRepository.findById(libraryId)
                .orElse(
                        Library.builder()
                                .name("NOT_FOUND")
                                .address("NOT_FOUND")
                                .email("NOT_FOUND")
                                .build()
                );
        var books = bookClient.findAllBooksByLibrary(libraryId);
        return FullLibraryResponse.builder()
                .name(library.getName())
                .address(library.getAddress())
                .email(library.getEmail())
                .books(books)
                .build();
    }

}
