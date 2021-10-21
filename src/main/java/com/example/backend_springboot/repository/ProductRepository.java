package com.example.backend_springboot.repository;

import com.example.backend_springboot.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,String>
{
}
