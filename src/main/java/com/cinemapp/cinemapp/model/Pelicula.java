package com.cinemapp.cinemapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "peliculas")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String sinopsis;
    private int valoracion;
    private int duracion;

    // FetchType.LAZY: Solo lo cargaremos cuando sea necesario
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Genero> generos;


}
