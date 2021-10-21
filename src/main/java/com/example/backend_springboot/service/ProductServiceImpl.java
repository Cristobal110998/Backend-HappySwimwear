package com.example.backend_springboot.service;

import org.springframework.stereotype.Service;
import java.util.Optional;
import com.example.backend_springboot.model.Product;
import com.example.backend_springboot.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl( ProductRepository productRepository )
    {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProduct( String id )
    {
        Optional<Product> product = productRepository.findById( id );
        return product.orElse( null );
    }

    @Override
    public Product save( Product product )
    {
        return productRepository.save( product );
    }


    @Override
    public void delete( String id )
    {
        productRepository.deleteById( id );
    }

}
