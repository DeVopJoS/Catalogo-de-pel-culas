package com.listapeliculas.peliculas.services;

import com.listapeliculas.peliculas.dao.IActorRepository;
import com.listapeliculas.peliculas.entities.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService implements IActorService{

    @Autowired
    private IActorRepository repo;

    public List<Actor> findAll() {
        return (List<Actor>) repo.findAll();
    }

    public List<Actor> findAllById(List<Long> ids) {
        return (List<Actor>) repo.findAllById(ids);
    }
}
