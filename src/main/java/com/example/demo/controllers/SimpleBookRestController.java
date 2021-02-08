package com.example.demo.controllers;

import com.example.demo.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books-rest")
public class SimpleBookRestController {
    
    @GetMapping(path = "/{id}", produces = "application/json")
    public String getBook(@PathVariable int id) {
        return findBookById(id);
    }

    private String findBookById(int id) {
        return new Book(id).toString();
    }

    @GetMapping("/")
    public String getRestBook(){
        return "You're have a new book";
    }
}
