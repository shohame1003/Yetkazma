package org.example.user;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.common.BaseRepository;

import java.util.UUID;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserRepository extends BaseRepository<User, UUID> {

    private static final UserRepository repository = new UserRepository();

    public static UserRepository getInstance() {
        return repository;
    }

}
