package com.cinemapp.cinemapp.service;

import com.cinemapp.cinemapp.model.Genero;

public interface GeneroService {

    Genero crearGenero(Genero genero);
    Genero editarGenero(Genero genero);
    Genero buscarGeneroPorId(Long id);
    void eliminarGenero(Long id);

}
