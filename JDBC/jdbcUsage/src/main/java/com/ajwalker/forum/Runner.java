package com.ajwalker.forum;

import com.ajwalker.forum.modules.MainMenuModule;
import com.ajwalker.forum.repository.UserRepository;

public class Runner {
    public static void main(String[] args) {
        MainMenuModule mainMenu = new MainMenuModule();
        mainMenu.mainMenuModule();


    }
}
