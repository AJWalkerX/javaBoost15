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
@Table(name = "tbl_departman")
public class Departman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ad;
    private String aciklama;
    @Column(name = "yetkili_id")
    private Long yetkiliID;

    @OneToMany(mappedBy = "departman")
    private List<Personel> personelList;
}
