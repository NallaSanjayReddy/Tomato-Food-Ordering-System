/*
 * This is tomato a food ordering app
 */

package com.tomato.model.restaurantService;

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
public class Ingredient {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;

    private IngredientType category;
    
    private Restaurant restaurant;
    
    private boolean inStock;
}
