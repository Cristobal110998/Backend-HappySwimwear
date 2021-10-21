package com.example.backend_springboot.repository;

import com.example.backend_springboot.model.Registro;
import org.springframework.data.repository.CrudRepository;

public interface RegistroRepository extends CrudRepository<Registro,String> {

}
