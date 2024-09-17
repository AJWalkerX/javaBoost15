package com.ajwalker.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tblmusteri")
public class Musteri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ad;

    public Musteri() {
    }

    public Musteri(String ad) {
        this.ad = ad;
    }

    public Musteri(Long id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                '}';
    }
}
