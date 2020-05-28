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
public class Factura {
    
    String vendedor;
    String estadoFactura;
    double totalFactura;
    String cliente;
    int formaPago;
    

    public Factura() {
    }

    public Factura(String vendedor, String estadoFactura, double totalFactura, String cliente, int formaPago) {
        this.vendedor = vendedor;
        this.estadoFactura = estadoFactura;
        this.totalFactura = totalFactura;
        this.cliente = cliente;
        this.formaPago = formaPago;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(String estadoFactura) {
        this.estadoFactura = estadoFactura;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(int formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Factura{" + "vendedor=" + vendedor + ", estadoFactura=" + estadoFactura + ", totalFactura=" + totalFactura + ", cliente=" + cliente + ", formaPago=" + formaPago + '}';
    }

    
    
}
