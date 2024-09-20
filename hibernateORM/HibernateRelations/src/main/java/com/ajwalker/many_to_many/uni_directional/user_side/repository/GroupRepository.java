package com.ajwalker.many_to_many.uni_directional.user_side.repository;


import com.ajwalker.many_to_many.uni_directional.user_side.entity.Group;

public class GroupRepository extends RepositoryManager<Group,Long> {
    public GroupRepository() {
        super(Group.class);
    }
}
