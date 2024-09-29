package com.ajwalker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "tbl_personel")
public class Personel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ad;
    private String soyad;
    private String unvan;
    private String maas;

    @ManyToOne
    @JoinColumn(name = "departman_id")
    private Departman departman;

    @OneToMany(mappedBy = "personel")
    private List<Adres> adresList;
}
