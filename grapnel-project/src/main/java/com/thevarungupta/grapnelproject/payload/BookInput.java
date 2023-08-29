package com.thevarungupta.grapnelproject.payload;

import lombok.Data;

@Data
public class BookInput {
    private String title;
    private String description;
    private String author;
    private double price;
    private int page;
}
