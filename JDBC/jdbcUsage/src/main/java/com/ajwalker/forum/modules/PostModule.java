package com.ajwalker.forum.modules;

import com.ajwalker.forum.contoller.PostController;
import com.ajwalker.forum.contoller.UserController;
import com.ajwalker.forum.entity.Post;
import com.ajwalker.forum.entity.User;
import com.ajwalker.forum.repository.PostRepository;
import static com.ajwalker.forum.utility.ConsoleTextUtils.*;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class PostModule {
    private final PostController postController = PostController.getInstance();
    private final UserController userController = UserController.getInstance();


    public void showAllPosts() {
        List<Post> postList = postController.findAll();
        if (postList.isEmpty()) {
            System.out.println("No posts found");
        }else {
            PostListModel(postList);
        }
    }



    public boolean sharePost(User user) {
        String postTitle = getStringUserInput("Post title: ");
        String postContent = getStringUserInput("Post content: ");
        return postController.save(new Post(user.getId(),postTitle,postContent));
    }

    public boolean reviewUserPosts(User user) {
        List<Post> postList = postController.findPostByUserID(user.getId());
        if (postList.isEmpty()) {
            return false;
        }
        PostListModel(postList);
        return true;
    }

    private void PostListModel(List<Post> postList) {
        for (Post post : postList) {
            printTitle(post.getTitle(), 30);
            System.out.println(post.getContent());
            System.out.println("----------------------------------------");
            String username = userController.findUsernameByUserID(post.getUserID());
            if (username != null) {
                System.out.println(username+ " / "+ post.getPostDate());
            }
            else {
                printErrorMessage("No user found!");
            }
            System.out.println("----------------------------------------");
        }
    }
}
