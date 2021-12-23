package com.cinemapp.cinemapp.repository;

import com.cinemapp.cinemapp.model.Genero;
import com.cinemapp.cinemapp.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

    Pelicula findByTitulo(String titulo);
    Pelicula findByValoracion(int valoracion);
    void deleteById(Long id);
    List<Genero> findByGeneros(Genero genero);
}
