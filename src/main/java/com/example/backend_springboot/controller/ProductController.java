package com.example.backend_springboot.controller;

import com.example.backend_springboot.model.Product;
import com.example.backend_springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin( "*" )
@RestController
public class ProductController {
    public ProductController( @Autowired ProductService productService )
    {
        this.productService = productService;
    }

    private final ProductService productService;

    @GetMapping( "/product/{id}" )
    public Product getProduct( @PathVariable String id )
    {
        return productService.getProduct( id );
    }

    @PostMapping( "/product" )
    public Product newProduct( @RequestBody Product product )
    {
        return productService.save( product );
    }

    @PutMapping( "/product" )
    public Product updateProduct( @RequestBody Product product )
    {
        return productService.save( product );
    }

    @DeleteMapping( "/product/{id}" )
    public void deleteProduct( @PathVariable String id )
    {
        productService.delete( id );
    }
}
