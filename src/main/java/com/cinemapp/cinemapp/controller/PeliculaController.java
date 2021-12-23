package com.cinemapp.cinemapp.controller;

import com.cinemapp.cinemapp.model.Pelicula;
import com.cinemapp.cinemapp.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/api/films")
public class PeliculaController {

    private PeliculaService peliculaService;

    @Autowired
    public PeliculaController(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Pelicula> getFilmById(@PathVariable("id") Long id) {
        Pelicula pelicula = peliculaService.buscarPeliculaPorId(id);
        return new ResponseEntity<>(pelicula, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Pelicula>> getAllFilms() {
        List<Pelicula> films = peliculaService.getPeliculas();
        return new ResponseEntity<>(films, HttpStatus.OK);
    }
}
