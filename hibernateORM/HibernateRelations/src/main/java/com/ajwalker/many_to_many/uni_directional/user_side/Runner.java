package com.ajwalker.many_to_many.uni_directional.user_side;

import com.ajwalker.many_to_many.uni_directional.user_side.entity.Group;
import com.ajwalker.many_to_many.uni_directional.user_side.entity.User;
import com.ajwalker.many_to_many.uni_directional.user_side.repository.GroupRepository;
import com.ajwalker.many_to_many.uni_directional.user_side.repository.UserRepository;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        GroupRepository groupRepository = new GroupRepository();

        Group group = Group.builder().name("Grup 1").build();
        Group group2 = Group.builder().name("Grup 2").build();

        User user = User.builder().username("Alex").groups(List.of(group)).build();
        User user1 = User.builder().username("Murat").groups(List.of(group2)).build();
        User user2 = User.builder().username("Emine").groups(List.of(group2)).build();



        groupRepository.saveAll(List.of(group,group2));
        userRepository.saveAll(List.of(user,user1,user2));

        groupRepository.findAll().forEach(System.out::println);
        userRepository.findAll().forEach(System.out::println);
    }
}
