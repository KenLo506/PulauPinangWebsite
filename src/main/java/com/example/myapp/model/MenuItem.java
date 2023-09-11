package com.example.myapp.model;
import javax.persistence.*;

@Entity
@Table(name = "menu_items")
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;

    // Getters and setters

    // Constructors, other methods, and additional annotations
}
