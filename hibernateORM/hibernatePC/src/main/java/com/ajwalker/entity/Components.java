package com.ajwalker.entity;

import com.ajwalker.enums.ECompType;
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
@Table(name = "tblcomponents")
public class Components {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "pcid")
    private Long pcID;
    private String brand;

    @Enumerated(EnumType.STRING)
    private ECompType comp_type;
}
