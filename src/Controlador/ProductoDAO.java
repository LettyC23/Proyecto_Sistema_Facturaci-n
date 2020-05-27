/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion_BD.Conexion;
import Modelo.Cliente;
import Modelo.Producto;
import Modelo.Proveedor;
import Modelo.Usuario;

/**
 *
 * @author tmx
 */
public class ProductoDAO {
     public boolean AgregarProducto(Producto p) {
		Conexion conexion = new Conexion();
        	return conexion.ejecutarInstruccionProductos(p);
	}
     
     public String buscaridProveedor(String nombre) {
		Conexion_BD.Conexion conexion = new Conexion_BD.Conexion();
		String sql = "select id_Proveedor from Proveedores WHERE NombreProveedor='"+nombre+"'";
		
		return conexion.buscarIdExistenteProveedor(sql);
	}
     
       public String buscaridTipoProducto(String nombre) {
		Conexion_BD.Conexion conexion = new Conexion_BD.Conexion();
		String sql = "select id_TipoProducto from Tipo_Producto WHERE Descripcion='"+nombre+"'";
		
		return conexion.buscarIdExistenteTipoProducto(sql);
	}
       
       public boolean ActualizarProducto(Producto p, String s) {
		Conexion conexion = new Conexion();
        	return conexion.ejecutarInstruccionModificarProducto(p, s);
	}
}
