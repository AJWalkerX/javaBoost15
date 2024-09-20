package com.ajwalker.service;

import com.ajwalker.entity.Pc;
import com.ajwalker.entity.User;
import com.ajwalker.repository.UserRepository;

import java.util.List;

public class UserService extends ServiceManager<User, Long> {
    private final UserRepository userRepository;
    private final PcService pcService;

    public UserService() {
        this(new UserRepository());

    }

    private UserService(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
        this.pcService=new PcService();
    }

    public void findUsersPcByUserId(Long id){
        findById(id).ifPresent(user -> System.out.println(user.getName()));
        System.out.println("-------------------");
        List<Pc> userPCs = pcService.findByFieldNameAndValue("userId", id);

        if (userPCs.isEmpty()) {
            System.out.println("Bu kullanıcının bilgisayarı yok.");
        } else {
            userPCs.forEach(System.out::println);
        }
    }
}
