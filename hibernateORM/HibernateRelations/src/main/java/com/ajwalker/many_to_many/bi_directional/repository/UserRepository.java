package com.ajwalker.many_to_many.bi_directional.repository;


import com.ajwalker.many_to_many.bi_directional.entity.User;

public class UserRepository extends RepositoryManager<User,Long> {
    public UserRepository() {
        super(User.class);
    }
}
