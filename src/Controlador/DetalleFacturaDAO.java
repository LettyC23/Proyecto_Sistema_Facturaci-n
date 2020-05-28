/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion_BD.Conexion;
import Modelo.Cliente;
import Modelo.DetalleFactura;
import Modelo.Factura;

/**
 *
 * @author tmx
 */
public class DetalleFacturaDAO {

        public boolean AgregarDetalle(DetalleFactura df) {
		Conexion conexion = new Conexion();
        	return conexion.ejecutarInstruccionDetalleFactura(df);
	}
    
    
}
