package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Incoming {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String internet_order;


}
