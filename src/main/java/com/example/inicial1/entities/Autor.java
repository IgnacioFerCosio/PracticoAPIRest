package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name="autor")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Autor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String biografia;

//    @ManyToMany(mappedBy = "autores")
//    private ArrayList<Libro> libros = new ArrayList<>();
}