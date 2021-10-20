package service;

import java.util.Collection;
import model.Registro;

public interface RegistroService {
    public abstract void createRegister(Registro register);
    public abstract void updateRegister(String id, Registro register);
    public abstract void deleteRegister(String id);
    public abstract Collection<Registro> getRegistros();
}
