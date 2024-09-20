package com.ajwalker.one_to_many.bi_directional;

import com.ajwalker.one_to_many.bi_directional.entity.Post;
import com.ajwalker.one_to_many.bi_directional.entity.User;
import com.ajwalker.one_to_many.bi_directional.repository.PostRepository;
import com.ajwalker.one_to_many.bi_directional.repository.UserRepository;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        PostRepository postRepository = new PostRepository();

        User user = User.builder().username("alex").build();

        Post post = Post.builder().title("Post title").content("Post content").user(user).build();
        Post post2 = Post.builder().title("Post title2").content("Post content2").user(user).build();

        user.setPosts(List.of(post,post2));

        userRepository.save(user);

        postRepository.findAll().forEach(System.out::println);
        userRepository.findAll().forEach(System.out::println);

    }
}
