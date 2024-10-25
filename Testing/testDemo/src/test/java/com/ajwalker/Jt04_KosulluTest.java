package com.ajwalker;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class Jt04_KosulluTest {
    /*
    *
    * path ->
    * windows => c:\\klasor\\inner\\workspace\\konu.java
    * mac => username/inner/workspace/konu.txt
    * */
    @Test
    @EnabledOnOs(OS.MAC)
    void onlyMacOS(){
        System.out.println("MAC OS X");
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    void testWinAndLinux(){
        System.out.println("Windows and Linux");
    }

    @Test
//    @EnabledOnJre(JRE.JAVA_21)
     @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_21)
    void testOnJRE(){
        int deger = 5;
       String cikti = switch (deger){
            case 1,3,7 -> "dasdsa";
            default -> "";
        };
        System.out.println("JRE 21");
    }
}
