package com.cinemapp.cinemapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "peliculas")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula")
    private Long id;
    private String titulo;
    private String sinopsis;
    private int valoracion;
    private int duracion;

    // FetchType.LAZY: Solo lo cargaremos cuando sea necesario
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "genero_pelicula",
    joinColumns = @JoinColumn(name = "id_pelicula"),
    inverseJoinColumns = @JoinColumn(name = "id_genero"))
    private List<Genero> generos;


}
