package com.ajwalker;

import com.ajwalker.entity.Pc;
import com.ajwalker.entity.User;
import com.ajwalker.repository.PcRepository;
import com.ajwalker.repository.UserRepository;
import com.ajwalker.service.PcService;
import com.ajwalker.service.UserService;
import com.ajwalker.utility.DemoData;

import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PcService pcService = new PcService();
        UserService userService = new UserService();

        DemoData demoData = new DemoData();
        demoData.createDemoData();

        System.out.println("-----------------------------------------------------------------------------");

//        pcService.findByFieldNameAndValue("userID", 1L).forEach(System.out::println);
        pcService.FindPcComponents();


    }
}