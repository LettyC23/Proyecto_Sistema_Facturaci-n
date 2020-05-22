/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;

/**
 *
 * @author tmx
 */
public class UsuarioDAO {
    
    	public boolean login(Usuario u) {
		Conexion_BD.Conexion conexion = new Conexion_BD.Conexion();
		String sql = "SELECT * FROM RegistroDeUsuarios WHERE usuario = '"+u.getUsuario()+"' AND contrasenia = '"+u.getContraseña()+"'";
		
		return conexion.ejecutarInstruccionLogin(sql);
	}

    
}
