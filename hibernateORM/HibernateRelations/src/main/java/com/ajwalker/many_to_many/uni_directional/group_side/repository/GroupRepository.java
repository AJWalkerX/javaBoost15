package com.ajwalker.many_to_many.uni_directional.group_side.repository;


import com.ajwalker.many_to_many.uni_directional.group_side.entity.Group;

public class GroupRepository extends RepositoryManager<Group,Long> {
    public GroupRepository() {
        super(Group.class);
    }
}
