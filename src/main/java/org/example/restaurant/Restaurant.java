package org.example.restaurant;

import lombok.*;
import org.example.common.BaseEntity;
import org.example.user.User;

import java.time.LocalDateTime;
import java.util.UUID;


@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
public class Restaurant extends BaseEntity<UUID> {
       private String location;
       private String name;

       public Restaurant(UUID id, LocalDateTime created, LocalDateTime modified, User createdBy, User modifiedBy, String location, String name) {
              super(id, created, modified, createdBy, modifiedBy);
              this.location = location;
              this.name = name;
       }
}
