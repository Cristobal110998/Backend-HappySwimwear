package com.example.backend_springboot.controller;

import com.example.backend_springboot.model.Registro;
import com.example.backend_springboot.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin( "*" )
@RestController
public class RegistroController {

    public RegistroController( @Autowired RegistroService registroService )
    {
        this.registroService = registroService;
    }

    private final RegistroService registroService;

    @GetMapping( "/registro/{id}" )
    public Registro getRegistro( @PathVariable String id )
    {
        return registroService.getRegistro( id );
    }

    @PostMapping( "/registro" )
    public Registro newRegistro( @RequestBody Registro registro )
    {
        return registroService.save( registro );
    }

    @PutMapping( "/registro" )
    public Registro updateRegistro( @RequestBody Registro registro )
    {
        return registroService.save( registro );
    }

    @DeleteMapping( "/registro/{id}" )
    public void deleteRegistro( @PathVariable String id )
    {
        registroService.delete( id );
    }

}
