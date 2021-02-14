package com.example.demo.entity;

import javax.persistence.*;


@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    private final String sku;
    private final String description;
    private final String sale_code;


    public Item(String sku, String description, String sale_code) {
        this.sku = sku;
        this.description = description;
        this.sale_code = sale_code;
    }

    public String getSku() {
        return sku;
    }

    public String getDescription() {
        return description;
    }

    public String getSale_code() {
        return sale_code;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", sku='" + sku + '\'' +
                ", description='" + description + '\'' +
                ", sale_code='" + sale_code + '\'' +
                '}';
    }
}
