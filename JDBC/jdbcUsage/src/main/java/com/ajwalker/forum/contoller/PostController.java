package com.ajwalker.forum.contoller;

import com.ajwalker.forum.entity.Post;
import com.ajwalker.forum.entity.User;
import com.ajwalker.forum.modules.PostModule;
import com.ajwalker.forum.repository.PostRepository;
import com.ajwalker.forum.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class PostController  {
    private static final UserController userController = UserController.getInstance();
    private static PostController postController;
    private static PostRepository  postRepository;
    private Scanner scanner = new Scanner(System.in);
    private PostModule postModule;

    private PostController() {
        postRepository = PostRepository.getInstance();
    }

    public static PostController getInstance() {
        if (postController == null){
            postController = new PostController();
        }
        return postController;
    }

    public List<Post> findPostByUserID(int id) {
        Optional<User> optionalUser = userController.findByID(id);
        if (optionalUser.isPresent()){
            return postRepository.findByUserID(optionalUser.get().getId());
        }
        else{
            return new ArrayList<>();
        }
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public boolean save(Post post) {
       return postRepository.save(post);
    }
}
