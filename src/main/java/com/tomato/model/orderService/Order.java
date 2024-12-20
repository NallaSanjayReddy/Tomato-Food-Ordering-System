/*
 * This is tomato a food ordering app
 */

package com.tomato.model.orderService;

import java.sql.Date;
import java.util.HashSet;

import com.tomato.model.restaurantService.RestaurantDto;
import com.tomato.model.userService.UserDto;

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
public class Order {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private UserDto customer;
    
    private RestaurantDto restaurant;
    
    private Double totalAmount;
    
    private boolean orderStatus;
    
    private Date createdAt;
    
    private String deliveryAddress;
    
    private HashSet<OrderItem> items;
    
    private Double payment;
    
    private Long totalItem;
    
    private Double totalPrice;
}
