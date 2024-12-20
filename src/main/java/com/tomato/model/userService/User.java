package com.tomato.model.userService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tomato.model.orderService.ORDER_STATUS;
import com.tomato.model.orderService.Order;
import com.tomato.model.restaurantService.RestaurantDto;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;
    
    private String email;
    
    private String password;
    
    private USER_ROLE role;

    @OneToMany
    @JsonIgnore
    private List<Order> orders = new ArrayList<>();

    @ElementCollection
    private List<RestaurantDto> favorites = new ArrayList<>();

    @ElementCollection
    private List<String> addresses = new ArrayList<>();

    @ElementCollection
	private HashMap<Order,ORDER_STATUS> status = new HashMap<>();

}
