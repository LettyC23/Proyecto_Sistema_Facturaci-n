/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion_BD.Conexion;
import Modelo.Cliente;
import Modelo.Proveedor;

/**
 *
 * @author tmx
 */
public class ProveedorDAO {
    public boolean AgregarProveedor(Proveedor proveedor) {
		Conexion conexion = new Conexion();
		
		
	
		return conexion.ejecutarInstruccionProveedores(proveedor);
	}
}
