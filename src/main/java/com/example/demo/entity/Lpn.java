package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Lpn {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private Long id;
    private String place;
    private String status;
    private String waybill;
    private String item_sku;

}
