package com.ajwalker.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tblsatis")
public class Satis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long musteri_id;
    private String urun;

    public Satis() {
    }

    public Satis(Long musteri_id, String urun) {
        this.musteri_id = musteri_id;
        this.urun = urun;
    }

    public Satis(Long id, Long musteri_id, String urun) {
        this.id = id;
        this.musteri_id = musteri_id;
        this.urun = urun;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Satis{" +
                "id=" + id +
                ", musteri_id=" + musteri_id +
                ", urun='" + urun + '\'' +
                '}';
    }
}
