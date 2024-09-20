package com.ajwalker.one_to_many.uni_directional.many_side;

import com.ajwalker.one_to_many.uni_directional.many_side.entity.Post;
import com.ajwalker.one_to_many.uni_directional.many_side.entity.User;
import com.ajwalker.one_to_many.uni_directional.many_side.repository.PostRepository;
import com.ajwalker.one_to_many.uni_directional.many_side.repository.UserRepository;

public class Runner {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        PostRepository postRepository = new PostRepository();

        User user = User.builder().username("alex").build();
        Post post = Post.builder().title("Post title").content("Post content").user(user).build();
        Post post1 = Post.builder().title("Post title2").content("Post content2").user(user).build();
        userRepository.save(user);
        postRepository.save(post);
        postRepository.save(post1);
        userRepository.findAll().forEach(System.out::println);
        postRepository.findAll().forEach(System.out::println);
    }
}
