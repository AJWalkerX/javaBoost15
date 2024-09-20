package com.ajwalker.many_to_many.bi_directional;

import com.ajwalker.many_to_many.bi_directional.entity.Group;
import com.ajwalker.many_to_many.bi_directional.entity.User;
import com.ajwalker.many_to_many.bi_directional.repository.GroupRepository;
import com.ajwalker.many_to_many.bi_directional.repository.UserRepository;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        GroupRepository groupRepository = new GroupRepository();

        User user = User.builder().username("Alex").build();
        User user1 = User.builder().username("Murat").build();
        User user2 = User.builder().username("Emine").build();

        Group group = Group.builder().name("Grup 1").users(List.of(user)).build();
        Group group2 = Group.builder().name("Grup 2").users(List.of(user1,user2)).build();

        user.setGroups(List.of(group));
        user1.setGroups(List.of(group2));
        user2.setGroups(List.of(group2));

        userRepository.saveAll(List.of(user,user1,user2));
        groupRepository.saveAll(List.of(group,group2));

        groupRepository.findAll().forEach(System.out::println);
        userRepository.findAll().forEach(System.out::println);
    }
}
