package com.ajwalker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.EnumSet;

public class Jt06_ParametreliTestler {
    private final Islemler islemler = new Islemler();


    /*
     * TDD -> Test Driven Development
     * -----------
     *
     */
    @ParameterizedTest
    @ValueSource(ints = {1, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 300, 400, 500})
    void testToplam(int sayi) {
        Assertions.assertTrue(sayi < 100);
    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {"", " ", "dasda", "\n"})
    void testString(String name) {
        Assertions.assertTrue(name != null && !name.isEmpty());
    }

    @ParameterizedTest
    @EnumSource(names = {"ACTIVE", "PASSIVE", "BLOCKED"})
    void testEnum(State state) {

        Assertions.assertTrue(state.name().equals("ACTIVE"));
        Assertions.assertTrue(EnumSet.of(State.ACTIVE, State.PASSIVE).contains(state));

    }

    @ParameterizedTest
    @CsvSource(
            {"1, muhammed",
             "23, Demet",
             "454, Bahadır"}
    )
    void testCvs(Long userId, String username) {
        System.out.println("userId = " + userId +"username = " + username);
    }
//    https://www.mockaroo.com/

    @ParameterizedTest
    @CsvFileSource(resources = "/kullanicilar.csv", numLinesToSkip = 400)
    void testSource(Long id, String name,String surname, String email) {
        System.out.println("id = " + id + " name = " + name + " surname = " + surname + " email = " + email);
    }
}
