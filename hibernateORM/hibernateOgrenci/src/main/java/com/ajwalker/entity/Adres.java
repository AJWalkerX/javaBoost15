package com.ajwalker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder //new keywordu yerine builder ile gelir.
@Data // @Getter, @Setter, @ToString anatasyonların birleşimi.
@Entity
@Table (name = "tbladres")
public class Adres {
    @Id
    Long id;
    String il;
    String ilce;
    String mahalle;
    String cadde;
    String sokak;
    String bina_no;
    String kapi_no;
    String posta_kodu;
}
