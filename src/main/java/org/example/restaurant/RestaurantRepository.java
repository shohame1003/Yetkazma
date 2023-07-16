package org.example.restaurant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.common.BaseRepository;
import org.example.common.Repository;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RestaurantRepository extends BaseRepository<Restaurant, UUID> {

    private static final RestaurantRepository repository = new RestaurantRepository();

    public static RestaurantRepository getInstance(){
        return repository;
    }

}
