package com.ajwalker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IslemlerTest {

    @Test
    void toplamS1BuyukS2(){
       Islemler islemler = new Islemler();
        int toplam = islemler.toplam(21, 5);
        Assertions.assertEquals(toplam, 26);
    }

    @Test
    void bolumS1PozitifS2Negatif(){
        Islemler islemler = new Islemler();
        double sonuc = islemler.bolum(12, -3);
        Assertions.assertEquals(sonuc, -4);
    }

    @Test
    void bolumS1PozitifS2Sifir(){
        Islemler islemler = new Islemler();
        double sonuc = islemler.bolum(12, 0);
        Assertions.assertEquals(sonuc, 0);
    }
}
