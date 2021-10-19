package service;

import java.util.Collection;
import model.Producto;

public interface ProductService {
    public abstract void createProduct(Producto product);
    public abstract void updateProduct(String id, Producto product);
    public abstract void deleteProduct(String id);
    public abstract Collection<Producto> getProducts();
}