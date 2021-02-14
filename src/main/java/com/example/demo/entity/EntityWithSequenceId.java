package com.example.demo.entity;

import javax.persistence.*;

@Entity
// Define a sequence - might also be in another class:
@SequenceGenerator(name="seq", initialValue=2100000000, allocationSize=100)
public class EntityWithSequenceId {
    // Use the sequence that is defined above:
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq")
    @Id
    long id;
}