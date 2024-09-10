package com.ajwalker.forum.modules;

import com.ajwalker.forum.entity.User;
import com.ajwalker.forum.repository.UserRepository;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RegisterModule {
    private Scanner scanner = new Scanner(System.in);
    private UserRepository userRepository = new UserRepository();

    public  void registerModule() {
            registerMenu();
    }

    private void registerMenu() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        String username = getUsername();
        String password = getUserPassword();
        User user = new User(name, surname, username, password);
        userRepository.save(user);
        System.out.println("Register successful!");
    }

    private String getUserPassword() {
        while (true) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            System.out.print("Enter your password again: ");
            String passwordAgain = scanner.nextLine();
            if (isValidPassword(password, passwordAgain)) {
                return password;
            }
        }
    }

    private boolean isValidPassword(String password, String passwordAgain) {
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters");
            return false;
        }
        if (!password.equals(passwordAgain)) {
            System.out.println("Passwords do not match");
            return false;
        }
        return true;
    }

    private String getUsername() {
        while (true) {
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();
            boolean isUnique = existByUsername(username);
            if (isUnique) {
                return username;
            } else {
                System.out.println("This username is already in use!");
            }
        }
    }

    private boolean existByUsername(String username) {
        List<User> userList = userRepository.findAll();
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }


}
