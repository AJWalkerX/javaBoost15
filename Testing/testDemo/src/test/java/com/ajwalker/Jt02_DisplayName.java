package com.ajwalker;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Tüm java sınıflarını test ettiğimiz faklı bir konu")
public class Jt02_DisplayName {
    @Test
    @DisplayName("Basarlı bir testin anantomisi")
    void doSuccessTest(){
        System.out.println("");
    }

    @Test
    void testIgnoreByUsername(){

    }

    @Nested
    class InnerClass{
        @Test
        void detayTest(){

        }

        @Test
        void coookFarkliBirTest(){

        }
    }
}
