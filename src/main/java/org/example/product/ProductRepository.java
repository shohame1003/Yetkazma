package org.example.product;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.common.BaseRepository;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductRepository extends BaseRepository<Product,UUID> {
    private static final ProductRepository repository = new ProductRepository();

    public static ProductRepository getInstance(){
        return repository;
    }
}
