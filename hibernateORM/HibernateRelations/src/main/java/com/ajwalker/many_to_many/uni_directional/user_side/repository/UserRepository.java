package com.ajwalker.many_to_many.uni_directional.user_side.repository;


import com.ajwalker.many_to_many.uni_directional.user_side.entity.User;

public class UserRepository extends RepositoryManager<User,Long> {
    public UserRepository() {
        super(User.class);
    }
}
