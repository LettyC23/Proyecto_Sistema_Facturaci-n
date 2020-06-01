
package Controlador;

import Conexion_BD.Conexion;
import Modelo.Cliente;
import Modelo.NuevoUsuario;
import Modelo.Usuario;
import javax.swing.table.DefaultTableModel;


public class UsuarioDAO {
    
    	public boolean login(Usuario u) {
		Conexion_BD.Conexion conexion = new Conexion_BD.Conexion();
		String sql = "SELECT * FROM RegistroDeUsuarios WHERE usuario = '"+u.getUsuario()+"' AND contrasenia = '"+u.getContraseña()+"'";
		
		return conexion.ejecutarInstruccionLogin(sql);
	}

        public boolean AgregarUsuario(NuevoUsuario nu){
            Conexion_BD.Conexion conexion = new Conexion_BD.Conexion();
		
		return conexion.ejecutarInstruccionAgregarUsuario(nu);

        }
        
        public String buscarContraseña(String c) {
		Conexion_BD.Conexion conexion = new Conexion_BD.Conexion();
		String sql = "select Contrasenia from RegistroDeUsuarios WHERE id_Usuario='"+c+"'";
		
		return conexion.buscarContraseña(sql);
	}
    
        public boolean EliminarUsuario (String s) {
		Conexion conexion = new Conexion();
		return conexion.ejecutarInstruccionEliminar(s);
	}
        
        public boolean ActualizarUsuario (NuevoUsuario nu, String s) {
		Conexion conexion = new Conexion();
		return conexion.ejecutarInstruccionModificarUsuario(nu, s);
	}
        
        public String ContadorUsuarios () {
       String sql = "SELECT count(id_Usuario) as Contador FROM RegistroDeUsuarios";
		Conexion conexion = new Conexion();
		return conexion.contadorRegistros(sql);
	}
        
        public DefaultTableModel UltimosUsuarios (String sql) {
		Conexion conexion = new Conexion();
		return conexion.UltimosUsuariosRegistrados(sql);
	}
}
