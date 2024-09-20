package com.ajwalker.one_to_many.bi_directional.repository;


import com.ajwalker.one_to_many.bi_directional.entity.Post;

public class PostRepository extends RepositoryManager<Post,Long> {
    public PostRepository() {
        super(Post.class);
    }
}
