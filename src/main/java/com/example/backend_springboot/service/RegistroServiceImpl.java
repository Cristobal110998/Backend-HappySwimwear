package com.example.backend_springboot.service;

import com.example.backend_springboot.model.Registro;
import com.example.backend_springboot.repository.RegistroRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class RegistroServiceImpl implements RegistroService {

    private final RegistroRepository registroRepository;

    public RegistroServiceImpl( RegistroRepository registroRepository )
    {
        this.registroRepository = registroRepository;
    }

    @Override
    public Registro getRegistro( String id )
    {
        Optional<Registro> registro = registroRepository.findById( id );
        return registro.orElse( null );
    }

    @Override
    public Registro save( Registro registro )
    {
        return registroRepository.save( registro );
    }

    @Override
    public void delete( String id )
    {
        registroRepository.deleteById( id );
    }


}
