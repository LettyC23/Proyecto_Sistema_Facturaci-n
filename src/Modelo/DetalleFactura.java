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
public class DetalleFactura {
    
    int fk_Factura;
    int  fk_idProducto;
    int cantiddad;
    String descripcion;
    double precioUnitario;
    double precioTotal;

    public DetalleFactura() {
    }

    public DetalleFactura(int fk_Factura, int fk_idProducto, int cantiddad, String descripcion, double precioUnitario, double precioTotal) {
        this.fk_Factura = fk_Factura;
        this.fk_idProducto = fk_idProducto;
        this.cantiddad = cantiddad;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.precioTotal = precioTotal;
    }

    public int getFk_Factura() {
        return fk_Factura;
    }

    public void setFk_Factura(int fk_Factura) {
        this.fk_Factura = fk_Factura;
    }

    public int getFk_idProducto() {
        return fk_idProducto;
    }

    public void setFk_idProducto(int fk_idProducto) {
        this.fk_idProducto = fk_idProducto;
    }

    public int getCantiddad() {
        return cantiddad;
    }

    public void setCantiddad(int cantiddad) {
        this.cantiddad = cantiddad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "fk_Factura=" + fk_Factura + ", fk_idProducto=" + fk_idProducto + ", cantiddad=" + cantiddad + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario + ", precioTotal=" + precioTotal + '}';
    }

    
}
