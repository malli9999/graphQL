package com.code.graphQL.model;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id,
                     String name) {

    public static List<Author> authors = Arrays.asList(
            new Author(1, "Martin Kleppmann"),
            new Author(2,"Marc Loy, Patrick Niemeyer"),
            new Author(3,"Dan Leuck")
    );

    public static Optional<Author> getbyId(Integer id) {
        return authors.stream()
                .filter(b -> b.id.equals(id))
                .findFirst();
    }
}


