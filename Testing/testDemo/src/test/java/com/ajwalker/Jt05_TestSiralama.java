package com.ajwalker;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Jt05_TestSiralama {

    @Test
    @Order(2)
    void test001(){
        System.out.println("Test-1");
    }
    @Test
    @Order(3)
    void test002(){
        System.out.println("Test-2");
    }
    @Test
    @Order(1)
    void test003(){
        System.out.println("Test-3");
    }

}
