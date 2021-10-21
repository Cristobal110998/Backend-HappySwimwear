package com.example.backend_springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "producto")
public class Product {

    public Product(String id_producto, String nombre_producto, double precio, String descripcion, int num_piezas, int id_categoria) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.descripcion = descripcion;
        this.num_piezas = num_piezas;
        this.id_categoria = id_categoria;
    }

    public Product()
    {
    }


    @Id
    @GeneratedValue
    private String id_producto;

    @Column(name = "nombre_producto")
    private String nombre_producto;

    @Column(name = "precio")
    private double precio;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "num_piezas")
    private int num_piezas;

    @Column(name = "id_categoria")
    private int id_categoria;



    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNum_piezas() {
        return num_piezas;
    }

    public void setNum_piezas(int num_piezas) {
        this.num_piezas = num_piezas;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }


}
