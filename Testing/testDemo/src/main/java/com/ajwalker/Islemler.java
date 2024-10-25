package com.ajwalker;

public class Islemler {

    public int toplam(int s1 , int s2){
        int toplam = s1 + s2;
        return toplam;
    }

    public double bolum(double s1 , double s2){
        double bolum = s1 / s2;
        if (s2 == 0){
            System.out.println("işlem tanımsız. Sıfırdan farklı bir değer giriniz!");
            return 0;
        }
        return bolum;
    }

    public int carpim(int s1 , int s2, String token){
        if (token.equals("admin")){
            try {
                Thread.sleep(8);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return s1 * s2;
        }else{
            throw new RuntimeException("Gecersiz token");
        }
    }
}
