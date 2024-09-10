package com.ajwalker.forum.modules;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuModule {
    private static Scanner scanner = new Scanner(System.in);
    private String title = """
                _                    _ ____     __                           \s
                (_) __ ___   ____ _  / | ___|   / _| ___  _ __ _   _ _ __ ___ \s
                | |/ _` \\ \\ / / _` | | |___ \\  | |_ / _ \\| '__| | | | '_ ` _ \\\s
                | | (_| |\\ V / (_| | | |___) | |  _| (_) | |  | |_| | | | | | |
              _/ |\\__,_| \\_/ \\__,_| |_|____/  |_|  \\___/|_|   \\__,_|_| |_| |_|
              |__/_ ___   __ _(_)_ __    _ __ ___   ___ _ __  _   _           \s
              | '_ ` _ \\ / _` | | '_ \\  | '_ ` _ \\ / _ \\ '_ \\| | | |          \s
              | | | | | | (_| | | | | | | | | | | |  __/ | | | |_| |          \s
              |_| |_| |_|\\__,_|_|_| |_| |_| |_| |_|\\___|_| |_|\\__,_|   \s
            """;

    public void mainMenuModule() {
        int opt;
        do {
            opt = mainMenuOptions(mainMenu());
        }while (opt != 0);
    }

    private int mainMenuOptions(int opt){
        switch (opt){
            case 1:{ //Register
                RegisterModule registerModule = new RegisterModule();
                registerModule.registerModule();
                break;
            }
            case 2:{ //Login
                LoginModule loginModule = new LoginModule();
                loginModule.loginModule();
                break;
            }
            case 0:{
                System.out.println("Gülü gülü...");
                break;
            }
            default:
                System.out.println("Please enter a valid option");
        }
        return opt;
    }

    private int mainMenu() {
        System.out.println(title);
        System.out.println("1-Register");
        System.out.println("2-Login");
        System.out.println("0- Exit");
        return userSelectionControl();
    }

    private int userSelectionControl() {
        while (true) {
            try {
                System.out.print("Enter your choice: ");
                int option = scanner.nextInt();
                scanner.nextLine();
                return option;
            }catch (InputMismatchException e) {
                System.out.println("Please enter a numeric valid option!"+ e.getMessage());
                scanner.nextLine();
            }
        }
    }
}
