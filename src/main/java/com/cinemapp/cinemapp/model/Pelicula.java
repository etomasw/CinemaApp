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

    public Pelicula(Long id, String titulo, String sinopsis, int valoracion, int duracion, List<Genero> generos) {
        this.id = id;
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.valoracion = valoracion;
        this.duracion = duracion;
        this.generos = generos;
    }

    public Pelicula() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }
}
