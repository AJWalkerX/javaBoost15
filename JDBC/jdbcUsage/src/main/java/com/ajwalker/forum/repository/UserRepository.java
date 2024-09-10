package com.ajwalker.forum.repository;

import com.ajwalker.forum.databases.DatabaseHelper;
import com.ajwalker.forum.databases.SQLQueryBuilder;
import com.ajwalker.forum.entity.User;
import com.ajwalker.forum.utality.ICRUD;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements ICRUD<User> {
    private String sql;
    private DatabaseHelper databaseHelper;

    public UserRepository() {
        databaseHelper = new DatabaseHelper();
    }

    @Override
    public void save(User user) {
        databaseHelper.executeUpdate(SQLQueryBuilder.generateInsert(user,"tbluser"));
    }

    @Override
    public void update(User user) {
        databaseHelper.executeUpdate(SQLQueryBuilder.generateUpdate(user,"tbluser"));
    }

    @Override
    public void delete(int id) {
        databaseHelper.executeUpdate(SQLQueryBuilder.generateDelete(User.class, "tbluser", id));
    }

    @Override
    public List<User> findAll() {
        sql = "SELECT * FROM tbluser ORDER BY id ASC";
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        if (resultSet.isPresent()) {
            ResultSet rs = resultSet.get();
            return SQLQueryBuilder.generateList(User.class, "tbluser", rs);
        }
         return new ArrayList<>();
    }

    @Override
    public Optional<User> findById(int id) {
        sql = "SELECT * FROM tbluser ORDER BY id ASC WHERE id = "+ id;
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        if (resultSet.isPresent()) {
            ResultSet rs = resultSet.get();
            return SQLQueryBuilder.findBy(User.class, "tbluser", "id", id, rs);
        }
        return Optional.empty();
    }

    public Optional<User> findByUsername(String username) {
        sql = "SELECT * FROM tbluser WHERE username = '"+ username + "'";
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        if (resultSet.isPresent()) {
            ResultSet rs = resultSet.get();
            return SQLQueryBuilder.findBy(User.class, "tbluser","username", username, rs);
        }
        return Optional.empty();
    }
}
