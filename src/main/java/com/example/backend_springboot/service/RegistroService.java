package com.example.backend_springboot.service;

import com.example.backend_springboot.model.Registro;

public interface RegistroService {

    Registro getRegistro (String id);

    Registro save(Registro registro);

    void delete(String id);

}
