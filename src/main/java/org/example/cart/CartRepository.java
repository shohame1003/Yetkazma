package org.example.cart;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.common.BaseRepository;
import org.example.common.Repository;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CartRepository extends BaseRepository<Cart, UUID> {
    private static final CartRepository repository = new CartRepository();

    public static CartRepository getInstance(){
        return repository;
    }
}
