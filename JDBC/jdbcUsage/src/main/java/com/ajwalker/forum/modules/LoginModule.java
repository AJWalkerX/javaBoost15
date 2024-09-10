package com.ajwalker.forum.modules;

import com.ajwalker.forum.entity.User;
import com.ajwalker.forum.repository.UserRepository;

import java.util.Optional;
import java.util.Scanner;

public class LoginModule {
    private Scanner scanner = new Scanner(System.in);
    private UserRepository userRepository = new UserRepository();

    public  void loginModule() {
        loginMenu();
    }

    private void loginMenu() {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
       Optional<User> user = userRepository.findByUsername(username);
       if(user.isEmpty()){
           System.out.println("Invalid username!");
           return;
       }
       System.out.print("Enter your password: ");
       String password = scanner.nextLine();
       if (checkUser(password, user)){
           //TODO: başka bir menüye aktarılsın!
           System.out.println("Login successful!");
       }
       else{
           System.out.println("Incorrect username or password!");
       }
    }

    private boolean checkUser(String password, Optional<User> userOptional) {
        User user = userOptional.get();
        if (user.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }


}
