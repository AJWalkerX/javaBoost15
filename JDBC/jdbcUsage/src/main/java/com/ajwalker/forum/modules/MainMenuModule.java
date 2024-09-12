package com.ajwalker.forum.modules;

import com.ajwalker.forum.contoller.PostController;
import com.ajwalker.forum.contoller.UserController;
import com.ajwalker.forum.entity.User;
import com.ajwalker.forum.modules.user_module.LoginModule;
import com.ajwalker.forum.modules.user_module.RegisterModule;
import com.ajwalker.forum.modules.user_module.UserModule;

import static com.ajwalker.forum.utility.ConsoleTextUtils.*;

import java.util.Optional;
import java.util.Scanner;

public class MainMenuModule {
    private Optional<User> userOptional = Optional.empty();
    private final PostController postController = PostController.getInstance();
    private final UserController userController = UserController.getInstance();
    private static final PostModule postModule = new PostModule();
    private static final UserModule userModule = new UserModule();

    private String title = """
                _                    _ ____     __                           \s
                (_) __ ___   ____ _  / | ___|   / _| ___  _ __ _   _ _ __ ___ \s
                | |/ _` \\ \\ / / _` | | |___ \\  | |_ / _ \\| '__| | | | '_ ` _ \\\s
                | | (_| |\\ V / (_| | | |___) | |  _| (_) | |  | |_| | | | | | |
              _/ |\\__,_| \\_/ \\__,_| |_|____/  |_|  \\___/|_|   \\__,_|_| |_| |_|
            """;


    public void mainMenuModule() {
        boolean isRunning = true;
        welcomeMenu();
        do {
            if (userOptional.isEmpty()) {
                isRunning = mainMenuOptions(mainMenu());

            } else {
//                postController.setUser(userOptional);
                isRunning = mainMenuUserOptions(UserMainMenu());
            }
        } while (isRunning);
    }

    private void welcomeMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        System.out.println("Press any key to continue!");
        scanner.nextLine();
    }

    private int UserMainMenu() {
        printTitle("User Main Menu");
        printMenuOptions(
                "Show All Posts",
                "Share a post",
                "Review your posts",
                "See all the users",
                "Profile",
                "Logout", "exit");
        return getIntUserInput("Enter your choice: ");
    }

    private boolean mainMenuUserOptions(int opt) {
        boolean isUserExists = true;
        switch (opt) {
            case 1: { //Show All Posts
                postModule.showAllPosts();
                break;
            }
            case 2: { //Share a post
                if (userOptional.isPresent()) {
                    boolean isSended = postModule.sharePost(userOptional.get());
                    if (isSended) {
                        printSuccessMessage("Post Shared Successfully!");
                    }
                    else{
                        printErrorMessage("Post Shared Failed! Try again");
                    }
                } else {
                    isUserExists = false;
                }
                break;
            }
            case 3: { //Review your posts
                if (userOptional.isPresent()) {
                    boolean isPostExist = postModule.reviewUserPosts(userOptional.get());
                    if (!isPostExist) {
                        printErrorMessage("Post Review Failed! Try again");
                    }
                } else {
                   isUserExists = false;
                }
                break;
            }
            case 4: { //See all the users
                if (userOptional.isPresent()) {
                    postModule.reviewUserPosts(userOptional.get());
                } else {
                    isUserExists = false;
                }
                break;
            }
            case 5: { //Profile
                if (userOptional.isPresent()) {
                    userModule.showUserProfile(userOptional.get());
                } else {
                    isUserExists = false;
                }
                break;
            }
            case 6: {
                isUserExists = false;
                System.out.println("Logging out!");
                userOptional = Optional.empty();
                break;
            }
            case 7: {
                System.out.println("Gülü gülü...");
                return false;
            }
            default:
                printErrorMessage("Please enter a valid option");
        }
        if (!isUserExists) {
            printErrorMessage("User not found!");
        }
        return true;
    }

    private int mainMenu() {
        printTitle("Main Menu");
        printMenuOptions("Show All Posts", "Register", "Login", "Exit");
        return getIntUserInput("Enter your choice: ");
    }

    private boolean mainMenuOptions(int opt) {
        switch (opt) {
            case 1: {//Show all Posts
                postModule.showAllPosts();
                break;
            }
            case 2: { //Register
                RegisterModule registerModule = new RegisterModule();
                registerModule.registerModule();
                break;
            }
            case 3: { //Login
                LoginModule loginModule = new LoginModule();
                this.userOptional = loginModule.loginModule();
                break;
            }
            case 4: {
                System.out.println("Gülü gülü...");
                return false;
            }
            default:
                printErrorMessage("Please enter a valid option");
        }
        return true;
    }
}
