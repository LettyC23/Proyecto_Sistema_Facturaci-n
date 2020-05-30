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
    
    public boolean eliminar(String id) {
		Conexion_BD.Conexion conexion = new Conexion_BD.Conexion();
		String sql = "DELETE FROM Detalle_Factura WHERE FK_IdFactura='"+id+"'";
		
		return conexion.ejecutarInstruccionEliminar(sql);
	}
}
