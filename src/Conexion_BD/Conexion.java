/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion_BD;

import Modelo.Cliente;
import Modelo.DetalleFactura;
import Modelo.Factura;
import Modelo.NuevoUsuario;
import Modelo.Producto;
import Modelo.Proveedor;
import java.awt.Component;
import proyecto_sistema_facturación.Clientes;
//import Modelo.Factura;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import oracle.security.o5logon.d;

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
			Class.forName("oracle.jdbc.OracleDriver");
									 //127.0.0.1 
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			conexion = DriverManager.getConnection(url, "SYSTEM", "EStrell25");
			System.out.println("Conexion establecida");
		} catch (ClassNotFoundException e) {
			System.out.println("No se encontro el controlador");
		
		}catch(SQLException e) {
			System.out.println("No se pudo conectar al servidor");
			
		}finally {
			
		}
	}
	
	public void cerrarConexion() {
		try {
			stm.close();
			conexion.close();
		} catch (SQLException e) {
			System.out.println("No se pudo cerrar la conexion");
		}
        }
        
        
        public DefaultTableModel Productos(String sql){
            
        Object []  nombresColumnas = {"ID","Descripcion","Precio","Existencias","Editar","Eliminar"};
        Object [] registros = {"","","","","",""};
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        try {        
            pstm = conexion.prepareStatement(sql);                         
            rs = pstm.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("id_Producto");
                registros[1] = rs.getString("DescripcionProducto");
                registros[2] = rs.getString("Precio");
                registros[3] = rs.getString("Stock");
                registros[4] = "Editar";
                registros[5] = "Eliminar"; 
                modelo.addRow(registros);        
            }   
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al conectar");    
        }
        finally{   
        }
         return modelo;
    }
        
        
        
        public DefaultTableModel clientes(String sql){
            JButton btnEditar = new JButton();
            btnEditar.setName("Editar");
            
            JButton btnEliminar = new JButton();
            btnEliminar.setName("Eliminar");
            
        Object []  nombresColumnas = {"id_Cliente","NombreCliente","Direccion","Telefono","Correo","Editar","Eliminar"};
        Object [] registros = {"","","","","",btnEditar,btnEliminar};
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
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
    
        
        
        
    public DefaultTableModel usuarios(String sql){
            
        Object []  nombresColumnas = {"ID","Nombres","Usuario","Correo","Fecha","Editar","Eliminar"};
        Object [] registros = {"","","","","","",""};
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        try {        
            pstm = conexion.prepareStatement(sql);                         
            rs = pstm.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("id_Usuario");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Usuario");
                registros[3] = rs.getString("Correo");
                registros[4] = rs.getString("Fecha");
                registros[5] = "Editar";
                registros[6] = "Eliminar"; 
                modelo.addRow(registros);        
            }   
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al conectar");    
        }
        finally{   
        }
         return modelo;
    }
    
   
     
    public DefaultTableModel proveedores(String sql){
            JButton btnEditar = new JButton();
            btnEditar.setName("Editar"); 
            JButton btnEliminar = new JButton();
            btnEliminar.setName("Eliminar");
            
        Object []  nombresColumnas = {"ID","Nombre","Empresa","Dirección","Teléfono","Editar","Eliminar"};
        Object [] registros = {"","","","","",btnEditar,btnEliminar};
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        try {        
            pstm = conexion.prepareStatement(sql);                         
            rs = pstm.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("id_Proveedor");
                registros[1] = rs.getString("NombreProveedor");
                registros[2] = rs.getString("NombreEmpresa");
                registros[3] = rs.getString("Direccion");
                registros[4] = rs.getString("Telefono");
                registros[5] = btnEditar.getName();
                registros[6] =btnEliminar.getName(); 
                modelo.addRow(registros);        
            }   
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al conectar");    
        }
        finally{   
        }
         return modelo;
    }
 
    
    
    public DefaultTableModel adicionarProductos(String sql){
            
        Object []  nombresColumnas = {"Producto","Cantidad","Precio"," "};
        Object [] registros = {"","","",""};
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        try {        
            pstm = conexion.prepareStatement(sql);                         
            rs = pstm.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("DescripcionProducto");
                registros[1] ="0";
                registros[2] = rs.getString("Precio");
                registros[3] = " Agregar";
                modelo.addRow(registros);        
            }   
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al conectar");    
        }
        finally{   
        }
         return modelo;
    }
    
    public DefaultTableModel detalleFactura(String sql){
            
        Object []  nombresColumnas = {"id_Producto","Cantidad","Descripcion","Precio Unit.", "Precio Total"};
        Object [] registros = {"","","","",""};
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        try {        
            pstm = conexion.prepareStatement(sql);                         
            rs = pstm.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("x");
                registros[1] = rs.getString("x");
                registros[2] = rs.getString("x");
                registros[3] = rs.getString("x");
                registros[4] = rs.getString("x");
                modelo.addRow(registros);        
               
         }   
        }
        catch(SQLException e){   
        }
        finally{   
        }
         return modelo;
    }
    
    
    public DefaultTableModel administrarFacturas(String sql){
            
        Object []  nombresColumnas = {"No","Vendedor","Estado de Factura","Total","Cliente","Fecha","Editar","Imprimir","Eliminar"};
        Object [] registros = {"","","","","","","","",""};
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        try { 
            pstm = conexion.prepareStatement(sql);                         
            rs = pstm.executeQuery();
            while(rs.next())
            {
                registros[0] = rs.getString("id_Factura");
                registros[1] = rs.getString("NombreEmpleado");
                registros[2] = rs.getString("EstadoFactura");
                registros[3] = rs.getString("Total");
                registros[4] = rs.getString("NombreCliente");
                registros[5] = rs.getString("Fecha");
                registros[6] = "Editar";
                registros[7] = "Imprimir";
                registros[8] ="Eliminar"; 
                
                modelo.addRow(registros);             
            }   
        } catch(SQLException e){    
            JOptionPane.showMessageDialog(null,"Error al conectar");    
        }
        finally{
            
        }
         return modelo;
    }
    
    public boolean ejecutarInstruccionLogin(String sql) {
		try{
                stm = conexion.prepareStatement(sql);
		rs = stm.executeQuery(sql);
                if( rs.next() ) { 
                    return true;      
		}else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
            return false;        
		}       
    } catch (Exception e){
        e.printStackTrace();
        return false;
    }	
	}
    
     public String buscarIdExistenteProveedor(String sql) {
		try{
                stm = conexion.prepareStatement(sql);
		rs = stm.executeQuery(sql);
                if( rs.next() ) { 
                    return rs.getString("id_Proveedor");      
		}else {
            return "";        
		}       
    } catch (Exception e){
        e.printStackTrace();
        return "";
    }	
	}
     
      public String buscarIdExistenteTipoProducto(String sql) {
		try{
                stm = conexion.prepareStatement(sql);
		rs = stm.executeQuery(sql);
                if( rs.next() ) { 
                    return rs.getString("id_TipoProducto");      
		}else {
            return "";        
		}       
    } catch (Exception e){
        e.printStackTrace();
        return "";
    }	
	}
      
     public String buscarIdExistente(String sql, String columna) {
		try{
                stm = conexion.prepareStatement(sql);
		rs = stm.executeQuery(sql);
                if( rs.next() ) { 
                    return rs.getString(columna);      
		}else {
            return "";        
		}       
    } catch (Exception e){
        e.printStackTrace();
        return "";
    }	
	}
      
      
    public String contadorRegistros(String sql) {
		try{
                stm = conexion.prepareStatement(sql);
		rs = stm.executeQuery(sql);
                if( rs.next() ) { 
                    return rs.getString("Contador");      
		}else {
            return "";        
		}       
    } catch (Exception e){
        e.printStackTrace();
        return "";
    }	
	}
    
      public String buscarContraseña(String sql) {
		try{
                stm = conexion.prepareStatement(sql);
		rs = stm.executeQuery(sql);
                if( rs.next() ) { 
                    return rs.getString("Contrasenia");      
		}else {
            return "";        
		}       
    } catch (Exception e){
        e.printStackTrace();
        System.out.println("No se pudo ejecutar la instruccion SQL"+ e);
        return "";
    }	
	}
        
    public boolean ejecutarInstruccionAgregarUsuario(NuevoUsuario u) {
		try {
			String sql =  "INSERT INTO RegistroDeUsuarios (Nombre,Usuario,Correo,Contrasenia,Fecha)VALUES(?,?,?,?,SYSDATE)";
			PreparedStatement pstm = conexion.prepareStatement(sql);
                        
			pstm.setString(1, u.getNombre());
			pstm.setString(2, u.getUsuario());
                        pstm.setString(3, u.getCorreo());
                        pstm.setString(4, u.getContraseña());
		
			String sql1= "SELECT * FROM RegistroDeUsuarios WHERE Nombre = ?; ";
			PreparedStatement pstm1 = conexion.prepareStatement(sql1);
			int ejecucion;
                        
			ejecucion = pstm.executeUpdate();
			return ejecucion==1?true:false;
  	
		} catch (SQLException e1) {
                System.out.println("No se pudo ejecutar la instruccion SQL"+ e1);
		return false;
		}
	}
	
    public boolean ejecutarInstruccion(Cliente e) {
		try {
			String sql =  "INSERT INTO Clientes (NombreCliente,Direccion,Telefono,Correo)VALUES(?,?,?,?)";
			PreparedStatement pstm = conexion.prepareStatement(sql);
                         
			pstm.setString(1, e.getNombre());
			pstm.setString(2, e.getDireccion());
                        pstm.setString(3, e.getTelefono());
                        pstm.setString(4, e.getCorreo());

			String sql1= "SELECT * FROM Clientes WHERE Nombres = ?; ";
			PreparedStatement pstm1 = conexion.prepareStatement(sql1);
                        
			int ejecucion;
                        
			ejecucion = pstm.executeUpdate();
			return ejecucion==1?true:false;
	
		} catch (SQLException e1) {
               System.out.println("No se pudo ejecutar la instruccion SQL"+ e1);
		return false;
		}
	}
    
    public boolean ejecutarInstruccionProductos(Producto p) {
		try {
			String sql =  "INSERT INTO Productos (DescripcionProducto,Precio,Stock,FK_TipoProducto,FK_Proveedor)VALUES(?,?,?,?,?)";
			PreparedStatement pstm = conexion.prepareStatement(sql);
                        
			pstm.setString(1, p.getDescripcionProducto());
			pstm.setDouble(2, p.getPrecio());
                        pstm.setInt(3, p.getStock());
                        pstm.setString(4, p.getId_Producto());
                        pstm.setString(5, p.getId_Proveedor());
			
			String sql1= "SELECT * FROM Productos WHERE Descripcion = ?; ";
			PreparedStatement pstm1 = conexion.prepareStatement(sql1);

			int ejecucion;
                        
			ejecucion = pstm.executeUpdate();
			return ejecucion==1?true:false;
                        
		} catch (SQLException e1) {
                    System.out.println("No se pudo ejecutar la instruccion SQL"+ e1);
                    return false;
		}
	}
        
    public boolean ejecutarInstruccionProveedores(Proveedor proveedor) {
		try {
			String sql =  "INSERT INTO Proveedores (NombreProveedor,NombreEmpresa,Direccion,Telefono)VALUES(?,?,?,?)";
			PreparedStatement pstm = conexion.prepareStatement(sql);
                        
			pstm.setString(1, proveedor.getNombreProveedor());
			pstm.setString(2, proveedor.getNombreEmpresa());
                        pstm.setString(3, proveedor.getDireccion());
                        pstm.setString(4, proveedor.getTelefono());
			
		
			String sql1= "SELECT * FROM Productos WHERE Descripcion = ?; ";
			PreparedStatement pstm1 = conexion.prepareStatement(sql1);

			int ejecucion;
                        
			ejecucion = pstm.executeUpdate();
			return ejecucion==1?true:false;
                        
		} catch (SQLException e1) {
                    System.out.println("No se pudo ejecutar la instruccion SQL"+ e1);
                    return false;
		}
	}
     
    
    public boolean ejecutarInstruccionFactura(Factura f) {
		try {
			String sql =  "insert into facturas (nombreempleado, estadofactura,total,nombrecliente,id_formapago, fecha) values (?,?,?,?,?,SYSDATE)";
			PreparedStatement pstm = conexion.prepareStatement(sql);
                         
			pstm.setString(1, f.getVendedor());
                        pstm.setString(2, f.getEstadoFactura());
                        pstm.setDouble(3, f.getTotalFactura());
                        pstm.setString(4, f.getCliente());
                        pstm.setInt(5, f.getFormaPago());

			String sql1= "SELECT * FROM Facturas WHERE NombreEmpleado = ?; ";
			PreparedStatement pstm1 = conexion.prepareStatement(sql1);
                        
			int ejecucion;
                        
			ejecucion = pstm.executeUpdate();
			return ejecucion==1?true:false;
	
		} catch (SQLException e1) {
               System.out.println("No se pudo ejecutar la instruccion SQL"+ e1);
		return false;
		}
	}
    
    
        public boolean ejecutarInstruccionDetalleFactura(DetalleFactura df) {
		try {
			String sql =  "insert into Detalle_Factura (FK_IdFactura, FK_IdProducto,Cantidad,Descripcion,PrecioUnitario,PrecioTotal) values (?,?,?,?,?,?)";
			PreparedStatement pstm = conexion.prepareStatement(sql);
                         
			pstm.setInt(1, df.getFk_Factura());
                        pstm.setInt(2, df.getFk_idProducto());
                        pstm.setInt(3, df.getCantiddad());
                        pstm.setString(4, df.getDescripcion());
                        pstm.setDouble(5, df.getPrecioUnitario());
                        pstm.setDouble(6, df.getPrecioTotal());

			String sql1= "SELECT * FROM Detalle_Factura WHERE FK_IdFactura = ?; ";
			PreparedStatement pstm1 = conexion.prepareStatement(sql1);
                        
			int ejecucion;
                        
			ejecucion = pstm.executeUpdate();
			return ejecucion==1?true:false;
	
		} catch (SQLException e1) {
               System.out.println("No se pudo ejecutar la instruccion SQL"+ e1);
		return false;
		}
	}
        
        
    public void llenarComboBox(JComboBox cBoxProveedor, String columna, String item, String consulta){
        
        try {
          PreparedStatement pstm = conexion.prepareStatement(consulta); 
          ResultSet result = pstm.executeQuery();
          cBoxProveedor.addItem(item);
          
          while(result.next()){
              cBoxProveedor.addItem(result.getString(columna));
          }
      } catch (SQLException ex) {
          Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    
    public void ComboBoxProveedores(JComboBox cBoxProveedor){
        String consulta ="SELECT NombreProveedor FROM Proveedores ORDER BY NombreProveedor ASC";
        try {
          PreparedStatement pstm = conexion.prepareStatement(consulta); 
          ResultSet result = pstm.executeQuery();
          cBoxProveedor.addItem("Proveedor");
          
          while(result.next()){
              cBoxProveedor.addItem(result.getString("NombreProveedor"));
          }
      } catch (SQLException ex) {
          Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
        
    public void ComboBoxTipoProducto(JComboBox cBoxProveedor){
        String consulta ="SELECT Descripcion FROM Tipo_Producto ORDER BY Descripcion ASC";
      try {
          PreparedStatement pstm = conexion.prepareStatement(consulta); 
          ResultSet result = pstm.executeQuery();
          cBoxProveedor.addItem("Tipo de producto");
          
          while(result.next()){
              cBoxProveedor.addItem(result.getString("Descripcion"));
          }
      } catch (SQLException ex) {
          Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
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
	
     

         public boolean ejecutarInstruccionEliminar ( String sql3) {
		try {
			PreparedStatement pstm1 = conexion.prepareStatement(sql3);
			 
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
                
    public boolean ejecutarInstruccionModificarCliente(Cliente e, String s) {
	try {	
        	String sql2="UPDATE Clientes SET NombreCliente=?, Direccion=?, Telefono=?, Correo=? WHERE id_Cliente='"+s+"'"; 
                               
			PreparedStatement pstm = conexion.prepareStatement(sql2);
                        
                        String a = e.getNombre();
			String b = e.getDireccion();
			String c = e.getTelefono();
			String d = e.getCorreo();
			
			pstm.setString(1, a);
			pstm.setString(2, b);
			pstm.setString(3, c);
			pstm.setString(4, d);
			
		int ejecucion;
		ejecucion = pstm.executeUpdate();
		return ejecucion==1?true:false;
	} catch (SQLException e1) {
	System.out.println("No se pudo ejecutar la instruccion SQL" + e1);
	return false;
	}
	}
    
    public boolean ejecutarInstruccionModificarUsuario(NuevoUsuario nu, String s) {
	try {	
        	String sql2="UPDATE RegistroDeUsuarios SET Nombre=?, Usuario=?, Correo=?, Contrasenia=?, Fecha=SYSDATE WHERE id_Usuario='"+s+"'"; 
                               
			PreparedStatement pstm = conexion.prepareStatement(sql2);
                        
                        String a = nu.getNombre();
			String b = nu.getUsuario();
			String c = nu.getCorreo();
			String d = nu.getContraseña();
			
			pstm.setString(1, a);
			pstm.setString(2, b);
			pstm.setString(3, c);
			pstm.setString(4, d);
			
		int ejecucion;
		ejecucion = pstm.executeUpdate();
		return ejecucion==1?true:false;
	} catch (SQLException e1) {
	System.out.println("No se pudo ejecutar la instruccion SQL" + e1);
	return false;
	}
	}
    
    
     public boolean ejecutarInstruccionModificarProveedor(Proveedor p, String s) {
	try {	
        	String sql2="UPDATE Proveedores SET NombreProveedor=?, NombreEmpresa=?, Direccion=?, Telefono=? WHERE id_Proveedor='"+s+"'"; 
                               
			PreparedStatement pstm = conexion.prepareStatement(sql2);
                        
                        String a = p.getNombreProveedor();
			String b = p.getNombreEmpresa();
			String c = p.getDireccion();
			String d = p.getTelefono();
			
			pstm.setString(1, a);
			pstm.setString(2, b);
			pstm.setString(3, c);
			pstm.setString(4, d);
			
		int ejecucion;
		ejecucion = pstm.executeUpdate();
		return ejecucion==1?true:false;
	} catch (SQLException e1) {
	System.out.println("No se pudo ejecutar la instruccion SQL" + e1);
	return false;
	}
	}
     
     
     
        public boolean ejecutarInstruccionModificarProducto(Producto p, String s) {
	try {	
        	String sql2="UPDATE Productos SET DescripcionProducto=?, Precio=?, Stock=?, FK_TipoProducto=?, FK_Proveedor=? WHERE id_Producto='"+s+"'"; 
                               
			PreparedStatement pstm = conexion.prepareStatement(sql2);
                        
                        String a = p.getDescripcionProducto();
			Double b = p.getPrecio();
			int c = p.getStock();
			String d = p.getId_Producto();
                        String e = p.getId_Proveedor();
			
			pstm.setString(1, a);
			pstm.setDouble(2, b);
			pstm.setInt(3, c);
			pstm.setString(4, d);
                        pstm.setString(5, e);
			
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
	
	
        
        
      
}
