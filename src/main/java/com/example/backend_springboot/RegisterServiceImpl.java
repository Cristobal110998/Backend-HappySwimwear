package com.example.backend_springboot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import model.Registro;
import service.RegistroService;

@Service
public class RegisterServiceImpl implements RegistroService {
    private static Map<String, Registro> registroRepo = new HashMap<>();
    static {
        Registro registro1 = new Registro();
        registro1.setId_usuario("1");
        registro1.setNombre("Carlos Alberto");
        registro1.setCorreo("alberto@gmail.com");
        registro1.setDireccion("Miravalle #255");
        registro1.setTelefono(33320096);
        registro1.setCompras(3);
        registro1.setContrasena("12345678");
        registroRepo.put(registro1.getId_usuario(), registro1);

        Registro registro2 = new Registro();
        registro2.setId_usuario("2");
        registro2.setNombre("Manuel Alejandro");
        registro2.setCorreo("manuel@gmail.com");
        registro2.setDireccion("Col. El fresno #471");
        registro2.setTelefono(334885772);
        registro2.setCompras(1);
        registro2.setContrasena("qwerty98");
        registroRepo.put(registro2.getId_usuario(), registro2);
    }

    @Override
    public void createRegister(Registro register) {
        registroRepo.put(register.getId_usuario(), register);
    }

    @Override
    public void updateRegister(String id, Registro register) {
        registroRepo.remove(id);
        register.setId_usuario(id);
        registroRepo.put(id, register);
    }

    @Override
    public void deleteRegister(String id) {
        registroRepo.remove(id);

    }
    @Override
    public Collection<Registro> getRegistros() {
        return registroRepo.values();
    }
}
