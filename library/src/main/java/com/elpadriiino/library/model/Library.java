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
public class Library {
    private @Id @GeneratedValue Integer id;
    private String name;
    private String address;
    private String email;
}
