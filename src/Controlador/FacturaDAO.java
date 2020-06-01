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
     
     public boolean EliminarFactura (String s) {
		Conexion conexion = new Conexion();
		return conexion.ejecutarInstruccionEliminar(s);
	}
     
     
     public boolean llamarProcedimiento(int f){
                Conexion_BD.Conexion conexion = new Conexion_BD.Conexion();
                String sql = "call EstadoFactura ( "+f+" , 'Pagado')";
		
		return conexion.procedminetoAlmacenado(sql);
     }
     
     public String buscaridFacturaProcedimiento(String nombre, String columna) {
		Conexion_BD.Conexion conexion = new Conexion_BD.Conexion();
		String sql = "SELECT id_Factura FROM Facturas WHERE Id_Factura='"+nombre+"'";
		
		return conexion.buscarIdExistente(sql, columna);
	}
     
     
      public boolean eliminar(String id) {
		Conexion_BD.Conexion conexion = new Conexion_BD.Conexion();
		String sql = "DELETE FROM Detalle_Factura WHERE FK_IdFactura='"+id+"'";
		
		return conexion.ejecutarInstruccionEliminar(sql);
	} 
      
      public String ContadorPagado () {
       String sql = "select count(*) as Contador from Facturas WHERE EstadoFactura = 'Pagado'";
		Conexion conexion = new Conexion();
		return conexion.contadorRegistros(sql);
	}
      public String ContadorPorPagar () {
       String sql = "select count(*) as Contador from Facturas WHERE EstadoFactura = 'Por pagar'";
		Conexion conexion = new Conexion();
		return conexion.contadorRegistros(sql);
	}
      
}
