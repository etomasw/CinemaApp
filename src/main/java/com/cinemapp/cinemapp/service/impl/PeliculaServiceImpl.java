package com.cinemapp.cinemapp.service.impl;

import com.cinemapp.cinemapp.constant.PeliculaConstant;
import com.cinemapp.cinemapp.model.Genero;
import com.cinemapp.cinemapp.model.Pelicula;
import com.cinemapp.cinemapp.repository.PeliculaRepository;
import com.cinemapp.cinemapp.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

import static com.cinemapp.cinemapp.constant.PeliculaConstant.FILM_NOT_FOUND;

@Service
@Transactional
@Qualifier("peliculaService")
public class PeliculaServiceImpl implements PeliculaService {

    private PeliculaRepository peliculaRepository;

    @Autowired
    public PeliculaServiceImpl(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    @Override
    public Pelicula crearPelicula(Pelicula pelicula) {
        return this.peliculaRepository.save(pelicula);
    }

    @Override
    public Pelicula editarPelicula(Pelicula pelicula) {
        return this.peliculaRepository.save(pelicula);
    }

    @Override
    public Pelicula findPeliculaById(Long id) {
        return this.peliculaRepository.findById(id).get();
    }

    @Override
    public void eliminarPeliculaPorId(Long id) {
        if(findPeliculaById(id) != null) {
            this.peliculaRepository.deleteById(id);
        } else {
            throw new RuntimeException(FILM_NOT_FOUND);
        }
    }

    @Override
    public List<Pelicula> getPeliculas() {
        return this.peliculaRepository.findAll();
    }

    @Override
    public List<Pelicula> buscarPeliculasPorGenero(Genero genero) {
        return null;
    }
}
