package org.example.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.user.User;

import java.time.LocalDateTime;
import java.util.UUID;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class BaseEntity<ID> {
    private ID id;
    private LocalDateTime created;
    private LocalDateTime modified;
    private User createdBy;
    private User modifiedBy;

}
