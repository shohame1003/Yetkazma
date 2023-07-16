package org.example.product;

import lombok.*;
import org.example.common.BaseEntity;
import org.example.user.User;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data

public class Product extends BaseEntity<UUID> {
    private UUID restaurantId;
    private String name;
    private double price;
    private boolean isAvailable;

    public Product(UUID id, LocalDateTime created, LocalDateTime modified, User createdBy, User modifiedBy, UUID restaurantId, String name, double price, boolean isAvailable) {
        super(id, created, modified, createdBy, modifiedBy);
        this.restaurantId = restaurantId;
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }
}
