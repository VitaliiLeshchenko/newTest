package com.example.demo.controllers;

import com.example.demo.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/books")
public class SimpleBookController {

    @GetMapping(path = "/books/{id}", produces = "application/json")
    public @ResponseBody
    Book getBook(@PathVariable int id) {
        return findBookById(id);
    }

    private Book findBookById(int id) {
        return new Book(id);
    }

    @GetMapping("/books")
    public String getRestBook(){
        return "You're have a new book";
    }
}
