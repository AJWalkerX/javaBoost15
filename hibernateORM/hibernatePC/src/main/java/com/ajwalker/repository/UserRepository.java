package com.ajwalker.repository;

import com.ajwalker.entity.User;

public class UserRepository extends RepositoryManager<User,Long> {
    public UserRepository() {
        super(User.class);
    }
}
