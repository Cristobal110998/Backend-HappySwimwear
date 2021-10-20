package com.example.backend_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.RegistroService;

import model.Registro;
import service.RegistroService;


@RestController
public class RegisterServiceController {
    @Autowired
    RegistroService registroService;

    @RequestMapping(value = "/registros")
    public ResponseEntity<Object> getProduct() {
        return new ResponseEntity<>(registroService.getRegistros(), HttpStatus.OK);
    }
    @RequestMapping(value = "/registros/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object>
    updateProduct(@PathVariable("id") String id, @RequestBody Registro register) {

        registroService.updateRegister(id, register);
        return new ResponseEntity<>("Register is updated successsfully", HttpStatus.OK);
    }
    @RequestMapping(value = "/registros/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        registroService.deleteRegister(id);
        return new ResponseEntity<>("Register is deleted successsfully", HttpStatus.OK);
    }
    @RequestMapping(value = "/registros", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Registro register) {
        registroService.createRegister(register);
        return new ResponseEntity<>("Register is created successfully", HttpStatus.CREATED);
    }
}
