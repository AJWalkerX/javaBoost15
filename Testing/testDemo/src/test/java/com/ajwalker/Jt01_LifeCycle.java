package com.ajwalker;

import org.junit.jupiter.api.*;

public class Jt01_LifeCycle {

    @BeforeAll
    static void initAll(){
        System.out.println("Tüm methodlar başlamadan önce");
    }

    @BeforeEach
    void initBefore(){
        System.out.println("initBefore");
    }

    @Test
    void basariliTest() {
        System.out.println("1- Herşeyden tamam");
    }

    @Test
    void basarisizTest() {
        Assertions.fail();
        System.out.println("2- Basaramadik kirmizi sortlu!");
    }

    @AfterEach
    void afterTest(){
        System.out.println("afterTest");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Bütün methodlar bittikten sonra");
    }
}
