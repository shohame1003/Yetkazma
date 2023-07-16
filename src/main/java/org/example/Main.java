package org.example;

import org.example.order.Order;
import org.example.order.OrderRepository;
import org.example.restaurant.Restaurant;
import org.example.restaurant.RestaurantRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
       RestaurantRepository repository = RestaurantRepository.getInstance();

        repository.add(new Restaurant(UUID.randomUUID(), LocalDateTime.now(),LocalDateTime.now(),null,null,"PDP","sh.oha.me"));

        List<Restaurant> all = repository.findAll();
        System.out.println(all);
    }
}