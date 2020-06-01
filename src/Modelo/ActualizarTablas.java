/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tmx
 */
public class ActualizarTablas {
     public Connection conexion;
	private Statement stm;
	
	private PreparedStatement pstm ; 
	
	ResultSet rs=null;
    
           public DefaultTableModel mostrarClientes(){
            JButton btnEditar = new JButton();
            btnEditar.setName("Editar");
            
            JButton btnEliminar = new JButton();
            btnEliminar.setName("Eliminar");
            
        Object []  nombresColumnas = {"id_Cliente","NombreCliente","Direccion","Telefono","Correo","Editar","Eliminar"};
        Object [] registros = {"","","","","",btnEditar,btnEliminar};
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        String sql = "SELECT * FROM clientes";
        
        try { 
            pstm = conexion.prepareStatement(sql);                         
            rs = pstm.executeQuery();
            while(rs.next())
            {
                registros[0] = rs.getString("id_Cliente");
                registros[1] = rs.getString("NombreCliente");
                registros[2] = rs.getString("Direccion");
                registros[3] = rs.getString("Telefono");
                registros[4] = rs.getString("Correo");
                registros[5] = btnEditar.getName();
                registros[6] =btnEliminar.getName(); 
                
                modelo.addRow(registros);             
            }   
        } catch(SQLException e){    
            JOptionPane.showMessageDialog(null,"Error al conectar");    
        }
        finally{
            
        }
         return modelo;
    }
    
    public void actualizarTabla(JTable tabla, String consulta) {
			String controlador = "oracle.jdbc.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			//String consulta = "SELECT * FROM Clientes ";
			ResultSetTableModel modelDatos = null;
                        
			try {
				modelDatos = new ResultSetTableModel(controlador, url, "System", "EStrell25", consulta);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			tabla.setModel(modelDatos);
		}
    
    public void actualizarTablaFiltro(String consulta, JTable tabla){
                    String controlador = "oracle.jdbc.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
                       // String consulta = "SELECT * FROM Clientes WHERE Nombre LIKE '%"+nombre+"'%";
                        ResultSetTableModel modelDatos = null;
                        
                        try {
				modelDatos = new ResultSetTableModel(controlador, url, "System", "EStrell25", consulta);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                        
                      tabla.setModel(modelDatos); 
                     
                }
}
