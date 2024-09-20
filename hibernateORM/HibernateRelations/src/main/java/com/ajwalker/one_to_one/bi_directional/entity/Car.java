package com.ajwalker.one_to_one.bi_directional.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "tblcar")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    @OneToOne(mappedBy = "car", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Personel personel;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", personel.id=" + personel.getId() +
                ", personel.name=" + personel.getName() +
                '}';
    }
}
