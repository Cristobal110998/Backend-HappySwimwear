package model;

public class Producto {

    private String id_producto; //int
    private String nombre_producto;
    private Double precio;
    private String descripcion;
    private String num_piezas; //int
    private String id_categoria; //int

    public String getId_producto() {
        return id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNum_piezas() {
        return num_piezas;
    }

    public String getId_categoria() {
        return id_categoria;
    }



    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNum_piezas(String num_piezas) {
        this.num_piezas = num_piezas;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }



}