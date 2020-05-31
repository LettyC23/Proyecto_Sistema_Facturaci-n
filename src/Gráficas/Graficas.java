/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gráficas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import Conexion_BD.Conexion;

/**
 *
 * @author tmx
 */
public class Graficas {
    Conexion_BD.Conexion c= new Conexion_BD.Conexion();
     Connection cn = c.conexion;
    
    
    
    public DefaultTableModel agruparProductos(){
        
        DefaultTableModel miModelo = null;
        try{
            String titulos []= {"Nombre","Cantidad"};
            String dts [] = new String[2];
            miModelo = new DefaultTableModel(null, titulos);
            String sql = "select descripcion, count(descripcion) as Cantidad from Detalle_Factura group by descripcion FETCH FIRST 10 ROWS ONLY";
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               dts[0] = rs.getString("Descripcion");
               dts[1] = rs.getString("Cantidad");
               miModelo.addRow(dts);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return miModelo;
    }   
    
       
    
}
