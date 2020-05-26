/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion_BD.Conexion;
import Modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author tmx
 */
public class ClienteDAO {
    public boolean AgregarCliente(Cliente e) {
		Conexion conexion = new Conexion();
        	return conexion.ejecutarInstruccion(e);
	}
    
   public boolean ActualizarCliente(Cliente e, String s) {
		Conexion conexion = new Conexion();
		return conexion.ejecutarInstruccionModificarCliente(e, s);
	}
   
   public boolean EliminarCliente (Cliente e, String s) {
		Conexion conexion = new Conexion();
		return conexion.ejecutarInstruccionEliminar(e, s);
	}
}
