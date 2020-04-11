/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion_BD;

import Modelo.Clientes;
//import Modelo.Factura;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author tmx
 */
public class Conexion {
  public Connection conexion;
	private Statement stm;
	
	private PreparedStatement pstm ; 
	
	ResultSet rs=null;
        
	
	public Conexion() {
		try {
			Class.forName("com.ibm.db2.jcc.DB2Driver");
									 //127.0.0.1 
			String url = "jdbc:db2://localhost:50000/Fact";
			conexion = DriverManager.getConnection(url, "db2adminL", "EStrell24");//(ruta, nombreUsuario, contraseña)
			System.out.println("Conexion establecida");
		} catch (ClassNotFoundException e) {
			System.out.println("No se encontro el controlador");
		
		}catch(SQLException e) {
			System.out.println("No se pudo conectar al servidor");
			
		}finally {
			//Codigo que SIEMPRE SE EJECUTA 
			//Cierre de la conexion de la BD
		}
	}//Cnstructor
	
	public void cerrarConexion() {
		try {
			stm.close();
			conexion.close();
		} catch (SQLException e) {
			System.out.println("No se pudo cerrar la conexion");
		}
        }
        
        
       	
	public boolean ejecutarInstruccion(Clientes e) {
		try {
			
	
			String sql =  "INSERT INTO Clientes (Nombre,PrimerAP,SegundoAp,Dirección,FechaNac,Teléfono,Email)VALUES(?,?,?,?,?,?,?)";
			PreparedStatement pstm = conexion.prepareStatement(sql);
			
                 //     pstm.setString(1, e.getNombre());
		//	pstm.setString(2, e.getPrimerAp());
		//	pstm.setString(3, e.getSegundoAp());
		//	pstm.setString(4, e.getDireccion());
		//	pstm.setString(5, e.getFechaNac());
		//	pstm.setString(6, e.getTelefono());
		//	pstm.setString(7, e.getEmail());
			
		
			String sql1= "SELECT * FROM Clientes WHERE Nombres = ?; ";
			PreparedStatement pstm1 = conexion.prepareStatement(sql1);
//			pstm1.setString(1, e.getNombre());
                        
                      JOptionPane.showConfirmDialog(null, "Empleado registrado!!", "Error al registrar", JOptionPane.ERROR_MESSAGE);
			int ejecucion;
                        
			ejecucion = pstm.executeUpdate();
			return ejecucion==1?true:false;
                        
			
		} catch (SQLException e1) {
                    JOptionPane.showConfirmDialog(null, "Llena todos los campos!!", "Error al registrar", JOptionPane.ERROR_MESSAGE);
		System.out.println("No se pudo ejecutar la instruccion SQL"+ e1);
		return false;
		}
	}
	/*public boolean ejecutarInstruccionFactura(Factura f) {
		try {
			
	
			String sql =  "INSERT INTO Factura (Fecha,id_Pago,Id_Cliente)VALUES(?,?,?)";
			PreparedStatement pstm = conexion.prepareStatement(sql);
			
                        pstm.setString(1, f.getFecha());
			pstm.setInt(2, f.getId_Pago());
			pstm.setInt(3, f.getId_Cliente());
			
	
			String sql1= "SELECT * FROM Clientes WHERE Nombres = ?; ";
			PreparedStatement pstm1 = conexion.prepareStatement(sql1);
			pstm1.setString(1, f.getFecha());
                        
                      int ejecucion;
                        
			ejecucion = pstm.executeUpdate();
			return ejecucion==1?true:false;
                        
			
		} catch (SQLException e1) {
                    JOptionPane.showConfirmDialog(null, "Recuerda que los id_Pago & id_Cliente"
                            + "deben pertenecer a los establecidos en la tabla Clientes y modo_Pago", "Error al registrar", JOptionPane.ERROR_MESSAGE);
		System.out.println("No se pudo ejecutar la instruccion SQL"+ e1);
		return false;
		}
	}*/
	
        
         public boolean ejecutarInstruccionC (Clientes e, String s) {
		try {
			
			String sql3 = "DELETE FROM Clientes WHERE Nombre='"+s+"' LIMIT 1";
			PreparedStatement pstm1 = conexion.prepareStatement(sql3);
			//pstm1.setString(1, "");
		
			
			
                        
		int ejecucion;
		//ejecucion = pstm.executeUpdate();
		ejecucion =pstm1.executeUpdate();
		return ejecucion==1?true:false;
		
	} catch (SQLException e1) {
	System.out.println("No se pudo ejecutar la instruccion SQL" +e1);
	return false;
	}
	}
                
                public boolean ejecutarInstruccionModificaciones (Clientes e, String s) {
		try {
			
			
			String sql2="UPDATE Clientes SET Nombre=?, PrimerAp=?, SegundoAp=?, Dirección=?, FechaNac=?, Teléfono=?, "
                                + "Email=? WHERE Nombre=? LIMIT 1"; 
                               
			PreparedStatement pstm = conexion.prepareStatement(sql2);
			
		/*	String a = e.getNombre();
			String b = e.getPrimerAp();
			String c = e.getSegundoAp();
			String d = e.getDireccion();
			String f = e.getFechaNac();
			String g = e.getTelefono();
			String h = e.getEmail();
			
			pstm.setString(1, a);
			pstm.setString(2, b);
			pstm.setString(3, c);
			pstm.setString(4, d);
			pstm.setString(5, f);
			pstm.setString(6, g);
			pstm.setString(7, h);
			pstm.setString(8, s);
                  */      
			
		int ejecucion;
		ejecucion = pstm.executeUpdate();
		return ejecucion==1?true:false;
	} catch (SQLException e1) {
	System.out.println("No se pudo ejecutar la instruccion SQL" + e1);
	return false;
	}
	}
	//otro metodo para SQL (CONSULTAS)
	
	public ResultSet ejecutarConsultaRegistros(String sql) {
		try {
			stm = conexion.prepareStatement(sql);
			stm.executeQuery(sql);
			System.out.println("si");
		} catch (SQLException e) {
			System.out.println("No se pudo ejecutar la instruccion SQL");
			e.printStackTrace();
		}
		return rs;
	}
	
	public boolean ejecutarInstruccionLogin(String sql) {
		try{
			stm = conexion.prepareStatement(sql);
		rs = stm.executeQuery(sql);
		if( rs.first() ) { 
            return true;      
		}else {
			JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
            return false;        
		}       
    } catch (Exception e)
    {
        e.printStackTrace();
        return false;
    }

        
        }
      
}
