
package com.tomato.model.userService;

import java.util.HashSet;

import com.tomato.model.orderService.Order;
import com.tomato.model.restaurantService.RestaurantDto;

import lombok.Data;

/**
 *
 * @author NallaSanjayReddy
 */
@Data
public class UserDto {
    private Long id;
    private String fullName;
    private String email;
    private HashSet<String> addresses = new HashSet<>();
    private USER_ROLE role;
    private HashSet<Order> orders = new HashSet<>();
    private HashSet<RestaurantDto> favourites = new HashSet<>();
}
