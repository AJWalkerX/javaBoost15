package com.ajwalker.one_to_many.uni_directional.many_side.repository;


import com.ajwalker.one_to_many.uni_directional.many_side.entity.User;

public class UserRepository extends RepositoryManager<User,Long> {
    public UserRepository() {
        super(User.class);
    }
}
