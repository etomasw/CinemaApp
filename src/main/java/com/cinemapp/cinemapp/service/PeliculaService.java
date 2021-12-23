package com.cinemapp.cinemapp.service;

import com.cinemapp.cinemapp.model.Genero;
import com.cinemapp.cinemapp.model.Pelicula;

import java.util.List;

public interface PeliculaService {

    Pelicula crearPelicula(Pelicula pelicula);
    Pelicula editarPelicula(Pelicula pelicula);
    Pelicula buscarPeliculaPorId(Long id);
    void eliminarPeliculaPorId(Long id);
    List<Pelicula> getPeliculas();
    List<Pelicula> buscarPeliculasPorGenero(List<Genero> generos);
}
