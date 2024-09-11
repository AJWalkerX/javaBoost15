package com.ajwalker.forum.repository;

import com.ajwalker.forum.databases.DatabaseHelper;
import com.ajwalker.forum.databases.SQLQueryBuilder;
import com.ajwalker.forum.entity.Post;
import com.ajwalker.forum.utility.ICRUD;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PostRepository implements ICRUD<Post> {
    private static final PostRepository postRepository = PostRepository.getInstance();
    private String sql;
    private final DatabaseHelper databaseHelper;


    private PostRepository() {
        databaseHelper = new DatabaseHelper();
    }
    public static PostRepository getInstance() {
        if (postRepository == null) {
            return new PostRepository();
        }
        return postRepository;
    }

    @Override
    public boolean save(Post post) {
       return databaseHelper.executeUpdate(SQLQueryBuilder.generateInsert(post,"tblpost"));
    }

    @Override
    public boolean update(Post post) {
       return databaseHelper.executeUpdate(SQLQueryBuilder.generateUpdate(post,"tblpost"));
    }

    @Override
    public boolean delete(int id) {
       return databaseHelper.executeUpdate(SQLQueryBuilder.generateDelete(Post.class, "tblpost", id));
    }

    @Override
    public List<Post> findAll() {
        sql = "SELECT * FROM tblpost ORDER BY id ASC";
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        if (resultSet.isPresent()) {
            ResultSet rs = resultSet.get();
            return SQLQueryBuilder.generateList(Post.class, "tblpost", rs);
        }
        return new ArrayList<>();
    }

    @Override
    public Optional<Post> findById(int id) {
        sql = "SELECT * FROM tblpost ORDER BY id ASC WHERE id = "+ id;
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        if (resultSet.isPresent()) {
            ResultSet rs = resultSet.get();
            return SQLQueryBuilder.findBy(Post.class, "tblpost", "id", id, rs);
        }
        return Optional.empty();
    }

    public List<Post> findByUserID(int id) {
        sql = "SELECT * FROM tblpost ORDER BY id ASC WHERE user_id  ="+ id;
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        if (resultSet.isPresent()) {
            ResultSet rs = resultSet.get();
            return SQLQueryBuilder.generateList(Post.class, "tblpost", rs);
        }
        return new ArrayList<>();
    }
}
