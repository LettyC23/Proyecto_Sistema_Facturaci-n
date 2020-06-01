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
       
        public boolean EliminarProducto (String s) {
		Conexion conexion = new Conexion();
		return conexion.ejecutarInstruccionEliminar(s);
	}
        
        public String ContadorProducto () {
       String sql = "SELECT count(id_Producto) as Contador FROM Productos";
		Conexion conexion = new Conexion();
		return conexion.contadorRegistros(sql);
	}
        
        public String buscarIdProducto(String des, String columna) {
		Conexion_BD.Conexion conexion = new Conexion_BD.Conexion();
		String sql = "select id_Producto from Productos WHERE DescripcionProducto='"+des+"'";
		
		return conexion.buscarIdExistente(sql, columna);
	}
        
        
        public String buscarStockProducto() {
		Conexion_BD.Conexion conexion = new Conexion_BD.Conexion();
		String sql = "select DescripcionProducto from Productos WHERE Stock<=5";
		
		return conexion.buscarIdExistente(sql,"Stock");
	}
        
       
         public boolean stockNoCero(String id) {
		Conexion conexion = new Conexion();
                String sql = "select id_producto from productos where stock>0 and  DescripcionProducto='"+id+"'";
        	return conexion.stockNoCero(sql);
	}
      
}
