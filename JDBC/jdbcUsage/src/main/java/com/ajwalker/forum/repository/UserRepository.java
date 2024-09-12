package com.ajwalker.forum.repository;

import com.ajwalker.forum.databases.DatabaseHelper;
import com.ajwalker.forum.databases.SQLQueryBuilder;
import com.ajwalker.forum.entity.User;
import com.ajwalker.forum.utility.ICRUD;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements ICRUD<User> {
    private static UserRepository userRepository;
    private String sql;
    private final DatabaseHelper databaseHelper;

    private UserRepository() {
        this.databaseHelper = new DatabaseHelper();
    }
    public static UserRepository getInstance(){
        if (userRepository == null){
            userRepository = new UserRepository();
        }
        return userRepository;
    }


    @Override
    public boolean save(User user) {
        return databaseHelper.executeUpdate(SQLQueryBuilder.generateInsert(user, "tbluser"));

    }

    @Override
    public boolean update(User user) {
        return databaseHelper.executeUpdate(SQLQueryBuilder.generateUpdate(user, "tbluser"));
    }

    @Override
    public boolean delete(int id) {
        return databaseHelper.executeUpdate(SQLQueryBuilder.generateDelete(User.class, "tbluser", id));
    }

    @Override
    public List<User> findAll() {
        sql = "SELECT * FROM tbluser ORDER BY id ASC";
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        if (resultSet.isPresent()) {
            ResultSet rs = resultSet.get();
            return SQLQueryBuilder.generateList(User.class, rs);
        }
         return new ArrayList<>();
    }

    @Override
    public Optional<User> findById(int id) {
        sql = "SELECT * FROM tbluser ORDER BY id ASC WHERE id = "+ id;
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        if (resultSet.isPresent()) {
            ResultSet rs = resultSet.get();
            return SQLQueryBuilder.findBy(User.class, rs);
        }
        return Optional.empty();
    }

    public Optional<User> findByUsername(String username) {
        sql = "SELECT * FROM tbluser WHERE username = '"+ username + "'";
        Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
        if (resultSet.isPresent()) {
            ResultSet rs = resultSet.get();
            return SQLQueryBuilder.findBy(User.class, rs);
        }
        return Optional.empty();
    }
}
