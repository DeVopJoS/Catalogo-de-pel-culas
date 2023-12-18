package com.listapeliculas.peliculas.controllers;

import com.listapeliculas.peliculas.entities.Actor;
import com.listapeliculas.peliculas.entities.Pelicula;
import com.listapeliculas.peliculas.services.IActorService;
import com.listapeliculas.peliculas.services.IGeneroService;
import com.listapeliculas.peliculas.services.IPeliculaService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class PeliculaController {

    private IPeliculaService service;
    private IGeneroService generoService;
    private IActorService actorService;

    public PeliculaController(IPeliculaService service, IGeneroService generoService, IActorService actorService){
        this.generoService = generoService;
        this.service = service;
        this.actorService = actorService;
    }

    @GetMapping("/pelicula")
    public String crear(Model model){
        Pelicula pelicula = new Pelicula();

        model.addAttribute("titulo", "Peliculas");
        model.addAttribute("generos", generoService.findAll());
        model.addAttribute("protagonistas", actorService.findAll());
        model.addAttribute("pelicula", pelicula);

        return "pelicula";
    }

    @GetMapping("/pelicula/{id}")
    public String editar(@PathVariable(name="id") Long id, Model model){
        Pelicula pelicula = new Pelicula();

        model.addAttribute("generos", generoService.findAll());
        model.addAttribute("protagonistas", actorService.findAll());
        model.addAttribute("titulo", "Editar Pelicula");
        model.addAttribute("pelicula", pelicula);

        return "pelicula";
    }

    @PostMapping("/pelicula")
    public  String guardar(@Valid Pelicula pelicula, BindingResult br, @ModelAttribute(name="ids") String ids, Model model){

        if(br.hasErrors()){
            model.addAttribute("generos", generoService.findAll());
            model.addAttribute("protagonistas", actorService.findAll());
            return "pelicula";
        }

        List<Long> idsProtagonistas = Arrays.stream(ids.split(",")).map(Long::parseLong).collect(Collectors.toList());
        List<Actor> protagonistas = actorService.findAllById(idsProtagonistas);

        pelicula.setProtagonistas(protagonistas);

        service.save(pelicula);
        return "redirect:home";
    }

    @GetMapping({"/", "/home", "/index"})
    public String home(Model model){
        model.addAttribute("peliculas", service.findAll());
        model.addAttribute("msj", "catalogo actualizado");
        model.addAttribute("tipoMsj", "success");

        return "home";
    }
}
