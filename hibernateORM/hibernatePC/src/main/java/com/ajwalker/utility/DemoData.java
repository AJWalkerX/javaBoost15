package com.ajwalker.utility;

import com.ajwalker.entity.Components;
import com.ajwalker.entity.Pc;
import com.ajwalker.entity.User;
import com.ajwalker.enums.ECompType;
import com.ajwalker.repository.CompRepository;
import com.ajwalker.repository.PcRepository;
import com.ajwalker.repository.UserRepository;

public class DemoData {
    UserRepository userRepository;
    PcRepository pcRepository;
    CompRepository compRepository;

    public DemoData() {
        this.userRepository = new UserRepository();
        this.pcRepository = new PcRepository();
        this.compRepository = new CompRepository();
    }

    public void createDemoData(){
        createUsers();
        createPcs();
        createComponents();
    }

    private void createComponents() {
        compRepository.save(Components.builder().pcID(1L).comp_type(ECompType.GRAPHICCARD).brand("NVIDIA").build());
        compRepository.save(Components.builder().pcID(1L).comp_type(ECompType.MAINBOARD).brand("MCI").build());
        compRepository.save(Components.builder().pcID(1L).comp_type(ECompType.HARDDISK).brand("SandDisk").build());
        compRepository.save(Components.builder().pcID(1L).comp_type(ECompType.RAM).brand("SandDisk").build());
        compRepository.save(Components.builder().pcID(1L).comp_type(ECompType.CPU).brand("Intel").build());

        compRepository.save(Components.builder().pcID(2L).comp_type(ECompType.GRAPHICCARD).brand("NVIDIA").build());
        compRepository.save(Components.builder().pcID(2L).comp_type(ECompType.MAINBOARD).brand("MCI").build());
        compRepository.save(Components.builder().pcID(2L).comp_type(ECompType.HARDDISK).brand("SandDisk").build());
        compRepository.save(Components.builder().pcID(2L).comp_type(ECompType.RAM).brand("SandDisk").build());
        compRepository.save(Components.builder().pcID(2L).comp_type(ECompType.CPU).brand("Intel").build());

        compRepository.save(Components.builder().pcID(3L).comp_type(ECompType.GRAPHICCARD).brand("NVIDIA").build());
        compRepository.save(Components.builder().pcID(3L).comp_type(ECompType.MAINBOARD).brand("MCI").build());
        compRepository.save(Components.builder().pcID(3L).comp_type(ECompType.HARDDISK).brand("SandDisk").build());
        compRepository.save(Components.builder().pcID(3L).comp_type(ECompType.RAM).brand("SandDisk").build());
        compRepository.save(Components.builder().pcID(3L).comp_type(ECompType.CPU).brand("Intel").build());

        compRepository.save(Components.builder().pcID(4L).comp_type(ECompType.GRAPHICCARD).brand("NVIDIA").build());
        compRepository.save(Components.builder().pcID(4L).comp_type(ECompType.MAINBOARD).brand("MCI").build());
        compRepository.save(Components.builder().pcID(4L).comp_type(ECompType.HARDDISK).brand("SandDisk").build());
        compRepository.save(Components.builder().pcID(4L).comp_type(ECompType.RAM).brand("SandDisk").build());
        compRepository.save(Components.builder().pcID(4L).comp_type(ECompType.CPU).brand("Intel").build());
    }

    private void createPcs() { //3 tane pc
        pcRepository.save(Pc.builder()
                .userID(1L)
                .brand("Barış PC-1")
                .build());
        pcRepository.save(Pc.builder()
                .userID(1L)
                .brand("Barış PC-2")
                .build());
        pcRepository.save(Pc.builder()
                .userID(1L)
                .brand("Barış PC-3")
                .build());
        pcRepository.save(Pc.builder()
                .userID(2L)
                .brand("Alexa")
                .build());
    }

    private void createUsers() { //3 tane user 1 tanesinin 2 pcsi 1 tanesinin 1 pc 1 tanesinin pc'si yok.
        userRepository.save(User.builder()
                .name("Barış")
                .build());
        userRepository.save(User.builder()
                .name("Alex")
                .build());
        userRepository.save(User.builder()
                .name("Ahmet")
                .build());
    }
}
