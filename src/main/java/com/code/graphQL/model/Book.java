package com.code.graphQL.model;

import java.util.Arrays;
import java.util.List;

public record Book(Integer id,
                   String name,
                   Integer pageCount) {

    public static List<Book> books = Arrays.asList(
            new Book(1,"DATA INTENSIVE APPLICATION", 500),
            new Book(2, "JAVA BY ORELLIY", 400),
            new Book(3, "Interview Questions", 700)
    );

}
