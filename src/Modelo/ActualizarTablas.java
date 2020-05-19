/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JTable;

/**
 *
 * @author tmx
 */
public class ActualizarTablas {
    public void actualizarTabla(JTable tabla) {
			String controlador = "oracle.jdbc.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String consulta = "SELECT * FROM Clientes ";
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
