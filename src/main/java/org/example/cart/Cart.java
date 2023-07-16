package org.example.cart;

import lombok.*;
import org.example.common.BaseEntity;
import org.example.product.Product;
import org.example.user.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class Cart extends BaseEntity<UUID> {
    private UUID userid;
    private UUID restaurantId;
    private List<UUID> products;
    private LocalDate expirationData;

    public Cart(UUID id, LocalDateTime created, LocalDateTime modified, User createdBy, User modifiedBy, UUID userid, UUID restaurantId, List<UUID> products, LocalDate expirationData) {
        super(id, created, modified, createdBy, modifiedBy);
        this.userid = userid;
        this.restaurantId = restaurantId;
        this.products = products;
        this.expirationData = expirationData;
    }
}
