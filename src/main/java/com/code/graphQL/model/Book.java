package com.code.graphQL.model;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id,
                   String name,
                   Integer pageCount,
                   int authId) {

    public static List<Book> books = Arrays.asList(
            new Book(1,"DATA INTENSIVE APPLICATION", 500, 1),
            new Book(2, "JAVA BY O'REILLY", 400,2),
            new Book(3, "Interview Questions", 700,3 )
    );

    public static Optional<Book> getbyId(Integer id) {
       return books.stream()
               .filter(b -> b.id.equals(id))
               .findFirst();
    }
}
