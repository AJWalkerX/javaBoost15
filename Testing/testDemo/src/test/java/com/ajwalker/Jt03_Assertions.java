package com.ajwalker;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class Jt03_Assertions {
    private static Islemler islemler;

    @BeforeAll
    static void initAll(){
        islemler = new Islemler();
    }

    @Test
    void standardAssertions(){
        assertEquals(10, islemler.toplam(7,3), "dogru islem");
    }

    @Test
    void standardAssertionsFail(){
        assertEquals(10, islemler.toplam(7,5), "İki sayının toplamını verir eger dogru degil ise abov");
    }

    @Test
    void standardAssertionsBoolean(){
        assertTrue(islemler.toplam(7,3) == 10);
    }

    @Test
    void groupAssertions(){
        assertAll("Tüm methodları calisti mi ?",
                ()->assertEquals(12, islemler.toplam(9,3)),
                ()->assertTrue(islemler.bolum(20,5)==4),
                ()->assertFalse(0!=0)
        );
    }

    @Test
    void testCarpimSuccess(){
        assertEquals(50, islemler.carpim(5,10, "admin"), "carpim islemi");
    }

    @Test
    void exceptionAssertions(){
       RuntimeException rt = assertThrows(RuntimeException.class,
                ()-> islemler.carpim (3,5,"token moken yok"),"hata gönderme islemi");
        assertEquals("Gecersiz token", rt.getMessage());
    }

    @Test
    void timeoutTest(){
        assertTimeout(Duration.ofMillis(10),()->islemler.carpim(3,12,"admin"));
    }
}
