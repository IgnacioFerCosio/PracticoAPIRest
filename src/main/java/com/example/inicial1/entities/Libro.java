package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="libro")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Libro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer fecha;
    private String genero;
    private Integer paginas;


    @Builder.Default
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name= "libro_autor",
            joinColumns = @JoinColumn(name="libro_id"),
            inverseJoinColumns = @JoinColumn(name="autor_id")
    )
    private List<Autor> autores = new ArrayList<>();

//    @ManyToOne(cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "fk_persona")
//    private Persona persona;
}
