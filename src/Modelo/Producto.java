/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author tmx
 */
public class Producto {
    private String descripcionProducto;
    private double precio;
    private int stock;
    private String tipo_Producto;
    private String id_Producto;

    public Producto() {
    }

    public Producto(String descripcionProducto, double precio, int stock, String tipo_Producto, String id_Producto) {
        this.descripcionProducto = descripcionProducto;
        this.precio = precio;
        this.stock = stock;
        this.tipo_Producto = tipo_Producto;
        this.id_Producto = id_Producto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTipo_Producto() {
        return tipo_Producto;
    }

    public void setTipo_Producto(String tipo_Producto) {
        this.tipo_Producto = tipo_Producto;
    }

    public String getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(String id_Producto) {
        this.id_Producto = id_Producto;
    }

    @Override
    public String toString() {
        return "Producto{" + "descripcionProducto=" + descripcionProducto + ", precio=" + precio + ", stock=" + stock + ", tipo_Producto=" + tipo_Producto + ", id_Producto=" + id_Producto + '}';
    }
    
    
    
    
    
}
