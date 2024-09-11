package com.ajwalker.forum.contoller;

import com.ajwalker.forum.entity.User;
import com.ajwalker.forum.modules.PostModule;
import com.ajwalker.forum.repository.PostRepository;
import com.ajwalker.forum.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UserController {
    private static UserController userController;
    private static UserRepository userRepository;
    private Scanner scanner = new Scanner(System.in);
    private Optional<User> userOptional;
    private PostModule postModule;

    private UserController() {
        userRepository = UserRepository.getInstance();
    }

    public static UserController getInstance() {
        if (userController == null){
            userController = new UserController();
        }
        return userController;
    }

    public static boolean existByUsername(String username) {
        List<User> userList = userRepository.findAll();
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public boolean save(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public boolean checkUserLogin(String password, Optional<User> userOptional) {
        User user = userOptional.get();
        if (user.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }

    public String findUsernameByUserID(Integer userID) {
        userOptional = userRepository.findById(userID);
        if (userOptional.isPresent()){
            return userOptional.get().getUsername();
        }
        return null;
    }

    public Optional<User> findByID(int id) {
        return userRepository.findById(id);
    }
}
