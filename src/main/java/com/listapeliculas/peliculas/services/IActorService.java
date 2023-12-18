package com.listapeliculas.peliculas.services;

import com.listapeliculas.peliculas.entities.Actor;

import java.util.List;

public interface IActorService {
    public List<Actor> findAll();
    public List<Actor> findAllById(List<Long> ids);
}
