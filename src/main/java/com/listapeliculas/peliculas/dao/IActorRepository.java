package com.listapeliculas.peliculas.dao;

import com.listapeliculas.peliculas.entities.Actor;
import org.springframework.data.repository.CrudRepository;

public interface IActorRepository extends CrudRepository<Actor, Long> {

}
