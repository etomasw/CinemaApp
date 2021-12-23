package com.cinemapp.cinemapp.repository;

import com.cinemapp.cinemapp.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepository extends JpaRepository<Genero, Long> {
    Genero findByTitulo(String titulo);
}
