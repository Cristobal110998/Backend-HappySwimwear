package com.example.backend_springboot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import model.Producto;
import service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    private static Map<String, Producto> productRepo = new HashMap<>();
    static {
        Producto bikini1 = new Producto();
        bikini1.setId_producto("1");
        bikini1.setNombre_producto("Red Summer");
//        bikini1.setPrecio(388.12);
//        bikini1.setDescripcion("Conjunto de 2 piezas para dama");
//        bikini1.setNum_piezas("4");
//        bikini1.setId_categoria("1");
        productRepo.put(bikini1.getId_producto(), bikini1);

        Producto bikini2 = new Producto();
        bikini2.setId_producto("2");
        bikini2.setNombre_producto("Top Wave");
//        bikini1.setPrecio(215.50);
//        bikini1.setDescripcion("Traje de baño, dos piezas, tela con estampado, color cafe");
//        bikini1.setNum_piezas("5");
//        bikini1.setId_categoria("2");
        productRepo.put(bikini2.getId_producto(), bikini2);
    }

    @Override
    public void createProduct(Producto product) {
        productRepo.put(product.getId_producto(), product);
    }

    @Override
    public void updateProduct(String id, Producto product) {
        productRepo.remove(id);
        product.setId_producto(id);
        productRepo.put(id, product);
    }

    @Override
    public void deleteProduct(String id) {
        productRepo.remove(id);

    }
    @Override
    public Collection<Producto> getProducts() {
        return productRepo.values();
    }
}
