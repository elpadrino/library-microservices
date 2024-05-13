package com.elpadriiino.book.repository;

import com.elpadriiino.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {
    List<Book> findAllByLibraryId(Integer libraryId);
}
