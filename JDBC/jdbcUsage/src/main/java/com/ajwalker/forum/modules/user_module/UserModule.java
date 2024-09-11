package com.ajwalker.forum.modules.user_module;

import com.ajwalker.forum.contoller.UserController;
import com.ajwalker.forum.entity.User;
import static com.ajwalker.forum.utility.ConsoleTextUtils.*;

public class UserModule {
    private static final UserController userController = UserController.getInstance();


    public void showUserProfile(User user) {
        printTitle("User : "+ user.getUsername());
        System.out.println("Name    : " + user.getName());
        System.out.println("Surname : " + user.getSurname());

    }
}
