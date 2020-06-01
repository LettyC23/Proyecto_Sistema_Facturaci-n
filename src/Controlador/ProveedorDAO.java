/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion_BD.Conexion;
import Modelo.Cliente;
import Modelo.Proveedor;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tmx
 */
public class ProveedorDAO {
    public boolean AgregarProveedor(Proveedor proveedor) {
		Conexion conexion = new Conexion();
		
		return conexion.ejecutarInstruccionProveedores(proveedor);
	}
    
    public boolean ActualizarProveedor(Proveedor proveedor, String s) {
		Conexion conexion = new Conexion();
		
		return conexion.ejecutarInstruccionModificarProveedor(proveedor, s);
	}
    public boolean EliminarProveedor( String s) {
		Conexion conexion = new Conexion();
		
		return conexion.ejecutarInstruccionEliminar(s);
	}
    
    public String ContadorProveedor () {
       String sql = "SELECT count(id_Proveedor) as Contador FROM Proveedores";
		Conexion conexion = new Conexion();
		return conexion.contadorRegistros(sql);
	}
    
    
    public DefaultTableModel vista () {
       String sql = "SELECT  * from ProductosRegistrados";
		Conexion conexion = new Conexion();
		return conexion.vistaMultitabla(sql);
	}
}
