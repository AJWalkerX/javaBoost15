package com.ajwalker.many_to_many.bi_directional.repository;


import com.ajwalker.many_to_many.bi_directional.entity.Group;

public class GroupRepository extends RepositoryManager<Group,Long> {
    public GroupRepository() {
        super(Group.class);
    }
}
