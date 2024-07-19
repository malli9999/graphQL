package com.code.graphQL.controller;

import com.code.graphQL.model.Book;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @QueryMapping
    public List<Book> books(){

        return Book.books;
    }

}
