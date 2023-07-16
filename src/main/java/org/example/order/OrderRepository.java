package org.example.order;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.common.BaseRepository;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderRepository extends BaseRepository<Order, UUID> {

    private static final OrderRepository repository = new OrderRepository();

    public static OrderRepository getInstance(){
        return repository;
    }

}
