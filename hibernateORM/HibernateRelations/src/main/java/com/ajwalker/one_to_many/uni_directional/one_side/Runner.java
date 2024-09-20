package com.ajwalker.one_to_many.uni_directional.one_side;

import com.ajwalker.one_to_many.uni_directional.one_side.entity.Post;
import com.ajwalker.one_to_many.uni_directional.one_side.entity.User;
import com.ajwalker.one_to_many.uni_directional.one_side.repository.PostRepository;
import com.ajwalker.one_to_many.uni_directional.one_side.repository.UserRepository;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        PostRepository postRepository = new PostRepository();

        Post post = Post.builder().title("Post title").content("Post content").build();
        Post post1 = Post.builder().title("Post title2").content("Post content2").build();
        Post post3 = Post.builder().title("Post title3").content("Post content3").build();
        Post post4 = Post.builder().title("Post title4").content("Post content4").build();
        User user = User.builder().username("alex").posts(List.of(post,post1)).build();
        User user2 = User.builder().username("Cano").posts(List.of(post3,post4)).build();
        postRepository.save(post);
        postRepository.save(post1);
        postRepository.save(post3);
        postRepository.save(post4);
        userRepository.save(user);
        userRepository.save(user2);
        userRepository.findAll().forEach(System.out::println);
//        postRepository.findAll().forEach(System.out::println);
    }
}
