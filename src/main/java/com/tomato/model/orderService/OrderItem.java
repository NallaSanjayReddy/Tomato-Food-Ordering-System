/*
 * This is tomato a food ordering app
 */

package com.tomato.model.orderService;

import java.util.HashSet;

import com.tomato.model.restaurantService.Food;
import com.tomato.model.restaurantService.Ingredient;

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
public class OrderItem {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Food food;
    private Integer quantity;
    private Integer totalPrice;
    private HashSet<Ingredient> ingredients;
}
