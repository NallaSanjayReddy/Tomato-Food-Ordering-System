
package com.tomato.model.restaurantService;


import java.sql.Date;
import java.sql.Time;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


import com.tomato.model.orderService.Order;
import com.tomato.model.userService.UserDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author NallaSanjayReddy
 */

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    
    private String tile;

    private String description;
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Long owner;
    
    private String name;
    
    private HashSet<CuisineType> cuisineType = new HashSet<>();
    
    private String address;
    
    private String contactInformation;
    
    private Time openingHours;
    
    private String reviews;
    
    private HashMap<UserDto,Order> orders = new HashMap<>();
    
    private Double numRating;
    
    @Column(length = 1000)
    private List<String> images;

    private Date registrationDate;
    
    private boolean open;
    
    private HashSet<Food> foods = new HashSet<>();
}
