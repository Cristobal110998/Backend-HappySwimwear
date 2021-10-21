package com.example.backend_springboot.service;

import com.example.backend_springboot.model.Product;

public interface ProductService {

    Product getProduct( String id );

    Product save( Product product );

    void delete( String id );
}
