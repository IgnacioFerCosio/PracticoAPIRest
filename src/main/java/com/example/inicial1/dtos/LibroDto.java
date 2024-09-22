package com.example.inicial1.dtos;


import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class LibroDto {

    private Long id;
    private String titulo;
    private Date fecha;
    private String genero;
    private Integer paginas;
}
