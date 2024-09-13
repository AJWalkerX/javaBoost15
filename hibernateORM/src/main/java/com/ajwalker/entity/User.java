package com.ajwalker.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

/*
!Hibernate kullanlınan entity'ler için camelCase kullanmak hataya sebebiyet verebilir!*/
@Entity
@Table(name = "tbluser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Serial'a denk geliyor değerleri 1'er 1'er artırır.
    private Long id;

    @Column(length = 30)
    private String name;

    @Column(length = 30)
    private String surname;

    @Transient // kolon olarak veritabanı tablosuna eklemek istemediğimiz fieldlar için kullanılan anatasyon!
    private String fullname;

    @Column(length = 50, unique = true)
    private String email;

    @Column(unique = true)
    private String username;

    private String password;

    private LocalDate dob;
    private LocalTime dogumsaati;

    @Lob
    private String about;

    public User() {

    }

    public User(String name, String surname, String email, String username, String password, LocalDate dob, LocalTime dogumsaati, String about) {
        this.name = name;
        this.surname = surname;
        this.fullname = name + " " + surname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.dob = dob;
        this.dogumsaati = dogumsaati;
        this.about = about;
    }

    public User(Long id, String name, String surname, String email, String username, String password, LocalDate dob, LocalTime dogumsaati, String about) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fullname = name + " " + surname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.dob = dob;
        this.dogumsaati = dogumsaati;
        this.about = about;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
