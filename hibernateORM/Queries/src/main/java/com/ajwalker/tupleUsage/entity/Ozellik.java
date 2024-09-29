package com.ajwalker.tupleUsage.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_ozellik")
public class Ozellik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String aciklama;
    @ManyToOne
//    @JoinColumn(name = "urun_id_midir_nedir")
    Urun urun;

    @Override
    public String toString() {
        return "Ozellik{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", aciklama='" + aciklama + '\'' +
                ", urun=" + urun.getAd() +
                '}';
    }
}
