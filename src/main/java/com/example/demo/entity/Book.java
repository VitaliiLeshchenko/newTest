package com.example.demo.entity;

public class Book {
    int id;

    public Book(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                '}';
    }
}
