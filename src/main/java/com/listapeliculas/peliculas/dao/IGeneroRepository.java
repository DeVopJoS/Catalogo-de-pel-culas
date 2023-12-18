package com.listapeliculas.peliculas.dao;

import com.listapeliculas.peliculas.entities.Genero;
import org.springframework.data.repository.CrudRepository;

public interface IGeneroRepository extends CrudRepository<Genero, Long> {

}
