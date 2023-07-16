package org.example.user;

import lombok.*;
import org.example.common.BaseEntity;

import javax.management.relation.Role;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
public class User extends BaseEntity<UUID> {

   private String name;
   private String surname;
   private double balance;
   private String phoneNumber;
   private String password;
   private Role role;
   private LocalDate employmentDate;
   private double salary;
   private UUID restaurantId;

   public User(UUID id, LocalDateTime created, LocalDateTime modified, User createdBy, User modifiedBy, String name, String surname, double balance, String phoneNumber, String password, Role role, LocalDate employmentDate, double salary, UUID restaurantId) {
      super(id, created, modified, createdBy, modifiedBy);
      this.name = name;
      this.surname = surname;
      this.balance = balance;
      this.phoneNumber = phoneNumber;
      this.password = password;
      this.role = role;
      this.employmentDate = employmentDate;
      this.salary = salary;
      this.restaurantId = restaurantId;
   }
}
