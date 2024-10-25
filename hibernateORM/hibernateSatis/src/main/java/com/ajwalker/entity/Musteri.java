package com.ajwalker.entity;

import com.ajwalker.enums.ECinsiyet;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tblmusteri")
public class Musteri {
    @Id
    @SequenceGenerator(name="seq_musteri_id", sequenceName = "seq_musteri_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_musteri_id")
    private Long id;
    private String ad;

    @Enumerated(EnumType.STRING)
    private ECinsiyet cinsiyet;

    @Embedded
    private BaseEntity baseEntity;

    @ElementCollection
    List<String> hobiler;

    public Musteri() {
    }

    public Musteri(String ad) {
        this.ad = ad;
    }

    public Musteri(Long id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    public ECinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(ECinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
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
