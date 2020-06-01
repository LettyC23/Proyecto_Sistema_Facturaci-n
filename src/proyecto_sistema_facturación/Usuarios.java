/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_sistema_facturación;

import Conexion_BD.Conexion;
import Controlador.ClienteDAO;
import Controlador.ProductoDAO;
import Controlador.ProveedorDAO;
import Controlador.UsuarioDAO;
import Gráficas.Graficas;
import Modelo.ActualizarTablas;
import Modelo.Cliente;
import Modelo.NuevoUsuario;
import Modelo.Usuario;
import Modelo.ValidarDatos;
import java.awt.Color;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import static proyecto_sistema_facturación.Inicio.tablaProductoMasVendido;
import static proyecto_sistema_facturación.Inicio.tablaSotckInicio;
import static proyecto_sistema_facturación.Inicio.tablaUltimosRegistros;
import static proyecto_sistema_facturación.Inicio.txtContadorClientes;
import static proyecto_sistema_facturación.Inicio.txtContadorProductos;
import static proyecto_sistema_facturación.Inicio.txtContadorProveedores;
import static proyecto_sistema_facturación.Inicio.txtContadorUsuarios;
import static proyecto_sistema_facturación.Productos.tablaProductos;

/**
 *
 * @author tmx
 */
public class Usuarios extends javax.swing.JPanel {

    AgregarUsuario n = new AgregarUsuario();
    ValidarDatos validarDatos = new ValidarDatos();
    Conexion_BD.Conexion c = new Conexion_BD.Conexion();
    
    public void usuarios(){
        pUsuarios.setVisible(true);
    }
    
            
    public Usuarios() {
        initComponents();
        
        
        DefaultTableModel modelo = c.usuarios("SELECT id_Usuario, Nombre, Usuario, Correo, Fecha FROM RegistroDeUsuarios");
        tablaAdministrarUsuarios.setModel(modelo); 
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pUsuarios = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreUsuarios = new javax.swing.JTextField();
        pNuevoUsuario = new javax.swing.JPanel();
        jNuevoUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAdministrarUsuarios = new javax.swing.JTable();
        pBuscarCliente = new javax.swing.JPanel();
        jBuscarCliente = new javax.swing.JLabel();
        pCerrarUsuarios = new javax.swing.JPanel();
        jCerrarUsuarios = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Administrar Usuarios");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nombre:");

        txtNombreUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreUsuariosKeyReleased(evt);
            }
        });

        pNuevoUsuario.setBackground(new java.awt.Color(204, 204, 255));
        pNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pNuevoUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pNuevoUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pNuevoUsuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pNuevoUsuarioMousePressed(evt);
            }
        });

        jNuevoUsuario.setText("Nuevo usuario");

        javax.swing.GroupLayout pNuevoUsuarioLayout = new javax.swing.GroupLayout(pNuevoUsuario);
        pNuevoUsuario.setLayout(pNuevoUsuarioLayout);
        pNuevoUsuarioLayout.setHorizontalGroup(
            pNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNuevoUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jNuevoUsuario)
                .addGap(26, 26, 26))
        );
        pNuevoUsuarioLayout.setVerticalGroup(
            pNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNuevoUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jNuevoUsuario)
                .addContainerGap())
        );

        tablaAdministrarUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaAdministrarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaAdministrarUsuariosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAdministrarUsuarios);

        pBuscarCliente.setBackground(new java.awt.Color(204, 204, 255));
        pBuscarCliente.setPreferredSize(new java.awt.Dimension(36, 25));
        pBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pBuscarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pBuscarClienteMouseExited(evt);
            }
        });

        jBuscarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icon.png"))); // NOI18N

        javax.swing.GroupLayout pBuscarClienteLayout = new javax.swing.GroupLayout(pBuscarCliente);
        pBuscarCliente.setLayout(pBuscarClienteLayout);
        pBuscarClienteLayout.setHorizontalGroup(
            pBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pBuscarClienteLayout.setVerticalGroup(
            pBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBuscarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(pNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNombreUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pCerrarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pCerrarUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pCerrarUsuariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pCerrarUsuariosMousePressed(evt);
            }
        });

        jCerrarUsuarios.setText("x");

        javax.swing.GroupLayout pCerrarUsuariosLayout = new javax.swing.GroupLayout(pCerrarUsuarios);
        pCerrarUsuarios.setLayout(pCerrarUsuariosLayout);
        pCerrarUsuariosLayout.setHorizontalGroup(
            pCerrarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCerrarUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCerrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pCerrarUsuariosLayout.setVerticalGroup(
            pCerrarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCerrarUsuariosLayout.createSequentialGroup()
                .addComponent(jCerrarUsuarios)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 102, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Generar Reporte");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout pUsuariosLayout = new javax.swing.GroupLayout(pUsuarios);
        pUsuarios.setLayout(pUsuariosLayout);
        pUsuariosLayout.setHorizontalGroup(
            pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuariosLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUsuariosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUsuariosLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUsuariosLayout.createSequentialGroup()
                        .addComponent(pCerrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        pUsuariosLayout.setVerticalGroup(
            pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuariosLayout.createSequentialGroup()
                .addComponent(pCerrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pCerrarUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCerrarUsuariosMouseEntered
        jCerrarUsuarios.setForeground(Color.WHITE);
        pCerrarUsuarios.setBackground(new Color(255,0,51));
        pCerrarUsuarios.setBorder(new LineBorder(new Color(255,0,51),1,true));
    }//GEN-LAST:event_pCerrarUsuariosMouseEntered

    private void pCerrarUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCerrarUsuariosMouseExited
        jCerrarUsuarios.setForeground(Color.BLACK);
        pCerrarUsuarios.setBackground(new Color(220,220,220));
        pCerrarUsuarios.setBorder(new LineBorder(new Color(220,220,220),1,true));
    }//GEN-LAST:event_pCerrarUsuariosMouseExited

    private void pNuevoUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pNuevoUsuarioMouseEntered
        jNuevoUsuario.setForeground(Color.WHITE);
        pNuevoUsuario.setBackground(new Color(51,0,255));
        pNuevoUsuario.setBorder(new LineBorder(new Color(51,0,255),1,true));
    }//GEN-LAST:event_pNuevoUsuarioMouseEntered

    private void pNuevoUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pNuevoUsuarioMouseExited
        jNuevoUsuario.setForeground(Color.BLACK);
        pNuevoUsuario.setBackground(new Color(204,204,255));
        pNuevoUsuario.setBorder(new LineBorder(new Color(204,204,255),1,true));
    }//GEN-LAST:event_pNuevoUsuarioMouseExited

    private void pNuevoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pNuevoUsuarioMousePressed
        n.setVisible(true);
        
    }//GEN-LAST:event_pNuevoUsuarioMousePressed

    private void pNuevoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pNuevoUsuarioMouseClicked
      
    }//GEN-LAST:event_pNuevoUsuarioMouseClicked

    private void txtNombreUsuariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUsuariosKeyReleased
        validarDatos.validarSoloLetras(txtNombreUsuarios);
        DefaultTableModel modelo = c.usuarios("SELECT * FROM RegistroDeUsuarios WHERE Nombre LIKE ' %" + txtNombreUsuarios.getText()+"%'");
        tablaAdministrarUsuarios.setModel(modelo); 
    }//GEN-LAST:event_txtNombreUsuariosKeyReleased

    private void tablaAdministrarUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAdministrarUsuariosMousePressed
        if(tablaAdministrarUsuarios.getSelectedColumn()==5){
            String cont = JOptionPane.showInputDialog(null, "Ingresa la contraseña");
            int fila = tablaAdministrarUsuarios.getSelectedRow();
            String contraseña = new UsuarioDAO().buscarContraseña(tablaAdministrarUsuarios.getValueAt(fila, 0).toString());
                if(cont.equals(contraseña)){
            
                    EditarUsuario eu = new EditarUsuario();
                    eu.txtIdEditarUsuario.setText(tablaAdministrarUsuarios.getValueAt(fila, 0).toString());
                    eu.txtEditarNombreUsuario.setText(tablaAdministrarUsuarios.getValueAt(fila, 1).toString());
                    eu.txtEditarUsuario.setText(tablaAdministrarUsuarios.getValueAt(fila, 2).toString());
                    eu.txtEditarCorreoUsuario.setText(tablaAdministrarUsuarios.getValueAt(fila, 3).toString());
                    eu.txtEditarContraseñaUsuario.setText(contraseña);
                    eu.txtEditarConfirmarContraseña.setText(contraseña);
                    eu.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "", JOptionPane.ERROR_MESSAGE);
            }
        }else if(tablaAdministrarUsuarios.getSelectedColumn()==6){
              String botones [] ={"Si","No"};
              int eleccion=JOptionPane.showOptionDialog(this, "¿Estas seguro de eliminar el registro "+tablaAdministrarUsuarios.getValueAt(tablaAdministrarUsuarios.getSelectedRow(), 0).toString()+" ?", "Eliminar producto", 0, 0, null, botones, this);
        
            if(eleccion==JOptionPane.YES_OPTION){
                String sql3 = "DELETE FROM RegistroDeUsuarios WHERE id_Usuario="+tablaAdministrarUsuarios.getValueAt(tablaAdministrarUsuarios.getSelectedRow(), 0).toString()+"";
        
                new UsuarioDAO().EliminarUsuario(sql3);
        
                DefaultTableModel modelo = c.usuarios("SELECT * FROM RegistroDeUsuarios"); 
                tablaAdministrarUsuarios.setModel(modelo); 
            }
        }
    }//GEN-LAST:event_tablaAdministrarUsuariosMousePressed

    private void pBuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pBuscarClienteMouseEntered

    }//GEN-LAST:event_pBuscarClienteMouseEntered

    private void pBuscarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pBuscarClienteMouseExited

    }//GEN-LAST:event_pBuscarClienteMouseExited

    private void pCerrarUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCerrarUsuariosMousePressed
        this.setVisible(false);
        txtContadorClientes.setText(new ClienteDAO().ContadorCliente());
        txtContadorProveedores.setText(new ProveedorDAO().ContadorProveedor());
        txtContadorProductos.setText(new ProductoDAO().ContadorProducto());
        txtContadorUsuarios.setText(new UsuarioDAO().ContadorUsuarios());

         DefaultTableModel miModelo;
            Graficas miGrafica = new Graficas();
       
            miModelo = miGrafica.agruparProductos();
            tablaProductoMasVendido.setModel(miModelo);
            
            
            DefaultPieDataset dtsc = new DefaultPieDataset();
            
            for(int i = 0; i < tablaProductoMasVendido.getRowCount(); i++){
                dtsc.setValue(tablaProductoMasVendido.getValueAt(i, 0).toString(), Integer.parseInt(tablaProductoMasVendido.getValueAt(i, 1).toString()));
            }
            JFreeChart ch = ChartFactory.createPieChart("Productos más vendidos", dtsc,true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(0,245,390,300);
            cp.setVisible(true);
            
            txtContadorClientes.setText(new ClienteDAO().ContadorCliente());
            txtContadorProveedores.setText(new ProveedorDAO().ContadorProveedor());
            txtContadorProductos.setText(new ProductoDAO().ContadorProducto());
            txtContadorUsuarios.setText(new UsuarioDAO().ContadorUsuarios());

            DefaultTableModel modelo = c.UltimosUsuariosRegistrados("SELECT Usuario, Correo, Fecha FROM RegistroDeUsuarios ORDER BY id_Usuario DESC FETCH FIRST 8 ROWS ONLY");
            tablaUltimosRegistros.setModel(modelo);

             DefaultTableModel modelo1 = c.StockProductos("select DescripcionProducto from Productos WHERE Stock<6");
            tablaSotckInicio.setModel(modelo1);
    }//GEN-LAST:event_pCerrarUsuariosMousePressed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        try {
            Conexion con = new Conexion();
            Connection conn = con.conexion;
            
            JasperReport reporte = null;
            String path = "src\\Reporte\\ReporteUsuarios.jasper";
            
            Map parametro = new HashMap();
            //parametro.put("id_cliente", 1);
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conn);
            
            JasperViewer view = new JasperViewer(jprint,false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
            
        } catch (JRException ex) {
            Logger.getLogger(Administrar_Facturas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jPanel4MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBuscarCliente;
    private javax.swing.JLabel jCerrarUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jNuevoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pBuscarCliente;
    private javax.swing.JPanel pCerrarUsuarios;
    private javax.swing.JPanel pNuevoUsuario;
    private javax.swing.JPanel pUsuarios;
    public static javax.swing.JTable tablaAdministrarUsuarios;
    private javax.swing.JTextField txtNombreUsuarios;
    // End of variables declaration//GEN-END:variables
}
