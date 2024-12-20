/*
 * This is tomato a food ordering app
 */

package com.tomato.model.restaurantService;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author 223053211
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    private Double price;

    private CuisineType foodCategory;

    @Column(length = 1000)
    private String images;

    private boolean available;

    private Restaurant restaurant;

    private boolean isVegetarian;

    private boolean isSeasonal;

    private List<Ingredient> ingredients = new ArrayList<>();

    private Date creationDate;
}
