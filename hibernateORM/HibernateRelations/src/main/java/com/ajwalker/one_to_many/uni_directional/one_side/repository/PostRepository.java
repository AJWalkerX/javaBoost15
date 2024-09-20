package com.ajwalker.one_to_many.uni_directional.one_side.repository;


import com.ajwalker.one_to_many.uni_directional.one_side.entity.Post;

public class PostRepository extends RepositoryManager<Post,Long> {
    public PostRepository() {
        super(Post.class);
    }
}
