package com.cinemapp.cinemapp.service.impl;

import com.cinemapp.cinemapp.model.Genero;
import com.cinemapp.cinemapp.repository.GeneroRepository;
import com.cinemapp.cinemapp.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@Qualifier("generoService")
public class GeneroServiceImpl implements GeneroService{

    private GeneroRepository generoRepository;

    @Autowired
    public GeneroServiceImpl(GeneroRepository generoRepository) {
        this.generoRepository = generoRepository;
    }

    @Override
    public Genero crearGenero(Genero genero) {
        return this.generoRepository.save(genero);
    }

    @Override
    public Genero editarGenero(Genero genero) {
        return this.generoRepository.save(genero);
    }

    @Override
    public Genero buscarGeneroPorId(Long id) {
        return this.generoRepository.findById(id).get();
    }

    @Override
    public void eliminarGenero(Long id) {
        if(buscarGeneroPorId(id) != null) {
            this.generoRepository.deleteById(id);
        }
    }
}
