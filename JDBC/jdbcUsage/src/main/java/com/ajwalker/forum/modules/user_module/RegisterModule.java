package com.ajwalker.forum.modules.user_module;

import com.ajwalker.forum.contoller.UserController;
import com.ajwalker.forum.entity.User;

import static com.ajwalker.forum.utility.ConsoleTextUtils.*;

import java.util.Scanner;

public class RegisterModule {
    private final UserController userController = UserController.getInstance();

    public  void registerModule() {
            registerMenu();
    }

    private void registerMenu() {
        String name = getStringUserInput("Enter Username: ");
        String surname = getStringUserInput("Enter your surname: ");
        String username = getUsername();
        String password = getUserPassword();
        if(userController.save(new User(name, surname, username, password))){
            printSuccessMessage("Register successful!");
            System.out.println("--------------------------------------------------");
            System.out.println("Please enter your username and password to Login!");
            LoginModule loginModule = new LoginModule();
            loginModule.loginModule();
        }
        else{
            printErrorMessage("Register failed!");
        }
    }

    private String getUserPassword() {
        while (true) {
            String password = getStringUserInput("Enter your password: ");
            String rePassword = getStringUserInput("Enter your password again: ");
            if (isValidPassword(password, rePassword)) {
                return password;
            }
        }
    }

    private boolean isValidPassword(String password, String passwordAgain) {
        if (password.length() < 8) {
            printErrorMessage("Password must be at least 8 characters");
            return false;
        }
        if (!password.equals(passwordAgain)) {
            printErrorMessage("Passwords do not match");
            return false;
        }
        return true;
    }

    private String getUsername() {
        while (true) {
            String username = getStringUserInput("Enter your username: ");
            boolean isUnique = UserController.existByUsername(username);
            if (isUnique) {
                return username;
            } else {
                printErrorMessage("This username is already in use!");
            }
        }
    }



}
