package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name="localidad")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Localidad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denominacion;

//    @ManyToOne(cascade = CascadeType.PERSIST)
//    @JoinColumn(name="fk_domicilio")
//    private Domicilio domicilio;
}
