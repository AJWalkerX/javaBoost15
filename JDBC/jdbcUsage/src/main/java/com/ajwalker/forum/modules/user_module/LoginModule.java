package com.ajwalker.forum.modules.user_module;

import com.ajwalker.forum.contoller.UserController;
import com.ajwalker.forum.entity.User;

import static com.ajwalker.forum.utility.ConsoleTextUtils.*;

import java.util.Optional;
import java.util.Scanner;

public class LoginModule {
    private UserController userController = UserController.getInstance();

    public  Optional<User> loginModule() {
       Optional<User> userOptional = loginMenu();
        if (userOptional.isPresent()){
            return userOptional;
        }
        return Optional.empty();
    }

    private Optional<User> loginMenu() {
        String username = getStringUserInput("Enter your username: ");
       Optional<User> user = userController.findByUsername(username);
       if(user.isEmpty()){
           printErrorMessage("Invalid username!");
           return Optional.empty();
       }
       String password = getStringUserInput("Enter your password: ");
       if (userController.checkUserLogin(password, user)){
           printSuccessMessage("Login successful!");
           return user;
       }
       else{
           printErrorMessage("Incorrect username or password!");
       }
       return Optional.empty();
    }



}
