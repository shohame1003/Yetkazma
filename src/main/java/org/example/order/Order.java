package org.example.order;

import lombok.*;
import org.example.common.BaseEntity;
import org.example.product.Product;
import org.example.user.User;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class Order extends BaseEntity<UUID> {
    private UUID userid;
    private UUID restaurantId;
    private UUID cookId;
    private UUID courierId;
    private List<Product> products;
    private OrderStatus status;

    public Order(UUID id, LocalDateTime created, LocalDateTime modified, User createdBy, User modifiedBy, UUID userid, UUID restaurantId, UUID cookId, UUID courierId, List<Product> products, OrderStatus status) {
        super(id, created, modified, createdBy, modifiedBy);
        this.userid = userid;
        this.restaurantId = restaurantId;
        this.cookId = cookId;
        this.courierId = courierId;
        this.products = products;
        this.status = status;
    }
}
