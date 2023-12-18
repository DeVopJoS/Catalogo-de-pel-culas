package com.listapeliculas.peliculas.dao;

import com.listapeliculas.peliculas.entities.Pelicula;
import org.springframework.data.repository.CrudRepository;

public interface IPeliculaRepository extends CrudRepository<Pelicula, Long> {
}
