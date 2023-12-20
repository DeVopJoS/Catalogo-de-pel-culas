package com.listapeliculas.peliculas.controllers;

import com.listapeliculas.peliculas.services.IArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArchivoController {

    @Autowired
    private IArchivoService archivoService;

    @RequestMapping("/archivo")
    public ResponseEntity<Resource> get(@RequestParam("n") String archivo){
        return archivoService.get(archivo);
    }
}
