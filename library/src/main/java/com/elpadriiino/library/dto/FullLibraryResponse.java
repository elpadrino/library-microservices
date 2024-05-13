package com.elpadriiino.library.dto;

import com.elpadriiino.library.model.Book;
import lombok.*;


import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FullLibraryResponse {
    private String name;
    private String address;
    private String email;
    List<Book> books;
}
