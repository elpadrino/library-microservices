package com.elpadriiino.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    private @Id @GeneratedValue Integer id;
    private String title;
    private String author;
    private Integer libraryId;


}
