/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion_BD.Conexion;
import Modelo.Cliente;
import Modelo.Factura;

/**
 *
 * @author tmx
 */
public class FacturaDAO {
    public boolean AgregarFactura(Factura f) {
		Conexion conexion = new Conexion();
        	return conexion.ejecutarInstruccionFactura(f);
	}
    
     public String buscaridTipoPago(String nombre, String columna) {
		Conexion_BD.Conexion conexion = new Conexion_BD.Conexion();
		String sql = "SELECT id_FormaPago FROM Forma_Pago WHERE Descripcion='"+nombre+"'";
		
		return conexion.buscarIdExistente(sql, columna);
	}
     
     public String buscaridIdFactura(String nombre, String columna) {
		Conexion_BD.Conexion conexion = new Conexion_BD.Conexion();
		String sql = "SELECT id_Factura FROM Facturas ORDER BY id_Factura DESC FETCH FIRST 1 ROWS ONLY";
		
		return conexion.buscarIdExistente(sql, columna);
	}
     
     
}
