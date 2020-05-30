/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_sistema_facturación;

import Conexion_BD.Conexion;
import Controlador.ClienteDAO;
import Controlador.FacturaDAO;
import Controlador.ProductoDAO;
import Controlador.ProveedorDAO;
import Controlador.UsuarioDAO;
import Modelo.ActualizarTablas;
import Modelo.ValidarDatos;
import java.awt.Color;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.text.DecimalFormat;
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
import static proyecto_sistema_facturación.Clientes.tablaClientes;
import static proyecto_sistema_facturación.EditarFactura.cboxEditarClienteFactura;
import static proyecto_sistema_facturación.EditarFactura.tablaDetalleFacturaEditar;
import static proyecto_sistema_facturación.EditarFactura.txtIdFactura;
import static proyecto_sistema_facturación.Inicio.txtContadorClientes;
import static proyecto_sistema_facturación.Inicio.txtContadorProductos;
import static proyecto_sistema_facturación.Inicio.txtContadorProveedores;
import static proyecto_sistema_facturación.Inicio.txtContadorUsuarios;
import static proyecto_sistema_facturación.Usuarios.tablaAdministrarUsuarios;

/**
 *
 * @author tmx
 */
public class Administrar_Facturas extends javax.swing.JPanel {

    Conexion_BD.Conexion c = new Conexion_BD.Conexion();
    ValidarDatos validarDato = new ValidarDatos();
    
    public void administrarFacturas(){
        pAdminFacturas.setVisible(true);
    }
    public Administrar_Facturas() {
        initComponents();
        
        DefaultTableModel modelo = c.administrarFacturas("SELECT * FROM Facturas"); 
        tablaAdministrarFacturas.setModel(modelo);
    }

    public String subtotal(){
        DecimalFormat c = new DecimalFormat(".00");
        int contar = tablaDetalleFacturaEditar.getRowCount();
        double suma = 0.00;
        for (int i = 0; i <contar; i++) {
            suma = suma+Double.parseDouble(tablaDetalleFacturaEditar.getValueAt(i, 4).toString()); 
        }
        return c.format(suma);
    }
    
    public String iva(){
        DecimalFormat c = new DecimalFormat(".00");
        int contar = tablaDetalleFacturaEditar.getRowCount();
        double suma = 0.00;
        for (int i = 0; i <contar; i++) {
            suma = suma+Double.parseDouble(tablaDetalleFacturaEditar.getValueAt(i, 4).toString()); 
        }
        return c.format(suma*0.15);
    }
    
    public String total(){
        DecimalFormat c = new DecimalFormat(".00");
        int contar = tablaDetalleFacturaEditar.getRowCount();
        double suma = 0.00;
        for (int i = 0; i <contar; i++) {
            suma = suma+Double.parseDouble(tablaDetalleFacturaEditar.getValueAt(i, 4).toString()); 
        }
        return c.format(suma*1.15);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pAdminFacturas = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtAdministrarFacturas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAdministrarFacturas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pCerrarAdmin = new javax.swing.JPanel();
        jCerrarAdmin = new javax.swing.JLabel();

        pAdminFacturas.setBackground(new java.awt.Color(204, 204, 204));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setText("Administrar Facturas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(235, 235, 235));
        jTextField2.setText("Administrar Facturas");
        jTextField2.setToolTipText("");

        jLabel1.setText("Número de factura o cliente");

        txtAdministrarFacturas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdministrarFacturasKeyReleased(evt);
            }
        });

        tablaAdministrarFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Fecha", "Cliente", "Vendedor", "Estado Factura", "Total Factura", "Editar", "Imprimir", "Eliminar"
            }
        ));
        tablaAdministrarFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaAdministrarFacturasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAdministrarFacturas);

        jPanel4.setBackground(new java.awt.Color(51, 102, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Generar Reporte");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pagar factura ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAdministrarFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAdministrarFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pCerrarAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pCerrarAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pCerrarAdminMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pCerrarAdminMousePressed(evt);
            }
        });

        jCerrarAdmin.setText("X");

        javax.swing.GroupLayout pCerrarAdminLayout = new javax.swing.GroupLayout(pCerrarAdmin);
        pCerrarAdmin.setLayout(pCerrarAdminLayout);
        pCerrarAdminLayout.setHorizontalGroup(
            pCerrarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCerrarAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCerrarAdmin)
                .addContainerGap())
        );
        pCerrarAdminLayout.setVerticalGroup(
            pCerrarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCerrarAdminLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jCerrarAdmin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pAdminFacturasLayout = new javax.swing.GroupLayout(pAdminFacturas);
        pAdminFacturas.setLayout(pAdminFacturasLayout);
        pAdminFacturasLayout.setHorizontalGroup(
            pAdminFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAdminFacturasLayout.createSequentialGroup()
                .addGroup(pAdminFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pAdminFacturasLayout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pCerrarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pAdminFacturasLayout.setVerticalGroup(
            pAdminFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAdminFacturasLayout.createSequentialGroup()
                .addGroup(pAdminFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCerrarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pAdminFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pAdminFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pCerrarAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCerrarAdminMouseEntered
        jCerrarAdmin.setForeground(Color.WHITE);
        pCerrarAdmin.setBackground(new Color(255,0,51));
        pCerrarAdmin.setBorder(new LineBorder(new Color(255,0,51),1,true));
    }//GEN-LAST:event_pCerrarAdminMouseEntered

    private void pCerrarAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCerrarAdminMouseExited
        jCerrarAdmin.setForeground(Color.BLACK);
        pCerrarAdmin.setBackground(new Color(220,220,220));
        pCerrarAdmin.setBorder(new LineBorder(new Color(220,220,220),1,true));
    }//GEN-LAST:event_pCerrarAdminMouseExited

    private void pCerrarAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCerrarAdminMousePressed
        this.setVisible(false);
        txtContadorClientes.setText(new ClienteDAO().ContadorCliente());
        txtContadorProveedores.setText(new ProveedorDAO().ContadorProveedor());
        txtContadorProductos.setText(new ProductoDAO().ContadorProducto());
        txtContadorUsuarios.setText(new UsuarioDAO().ContadorUsuarios());
    }//GEN-LAST:event_pCerrarAdminMousePressed

    private void txtAdministrarFacturasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdministrarFacturasKeyReleased
         validarDato.validarSoloNumerosLetras(txtAdministrarFacturas);
         DefaultTableModel modelo = c.administrarFacturas("SELECT * FROM Facturas WHERE id_Factura LIKE '%" + txtAdministrarFacturas.getText()+"%' or NombreCliente LIKE '%"+txtAdministrarFacturas.getText()+"%'"); 
         tablaAdministrarFacturas.setModel(modelo);
    }//GEN-LAST:event_txtAdministrarFacturasKeyReleased

    private void tablaAdministrarFacturasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAdministrarFacturasMousePressed
        if(tablaAdministrarFacturas.getSelectedColumn()==6){
            String id = tablaAdministrarFacturas.getValueAt(tablaAdministrarFacturas.getSelectedRow(), 0).toString();
            EditarFactura ef = new EditarFactura();
            ef.txtIdFactura.setText(tablaAdministrarFacturas.getValueAt(tablaAdministrarFacturas.getSelectedRow(), 0).toString());
            DefaultTableModel modelo = c.editarDetalle("select FK_IdProducto, descripcion, cantidad, precioUnitario, preciototal from detalle_factura where fk_idfactura="+id); 
            tablaDetalleFacturaEditar.setModel(modelo);
            ef.txtEditarSubtotal.setText(subtotal());
            ef.txtEditarIva.setText(iva());
            ef.txtEditarTotal.setText(total());
            ef.setVisible(true);
            
            
            
        }
        
        if(tablaAdministrarFacturas.getSelectedColumn()==8){
              String botones [] ={"Si","No"};
        int eleccion=JOptionPane.showOptionDialog(this, "¿Estas seguro de eliminar el registro "+tablaAdministrarFacturas.getValueAt(tablaAdministrarFacturas.getSelectedRow(), 0).toString()+" ?", "Eliminar Factura", 0, 0, null, botones, this);
        
        if(eleccion==JOptionPane.YES_OPTION){
            String sql3 = "DELETE FROM Facturas WHERE id_Factura="+tablaAdministrarFacturas.getValueAt(tablaAdministrarFacturas.getSelectedRow(), 0).toString()+"";
            String sql4 = "DELETE FROM Detalle_Factura WHERE FK_IdFactura="+tablaAdministrarFacturas.getValueAt(tablaAdministrarFacturas.getSelectedRow(), 0).toString()+"";
            new FacturaDAO().EliminarFactura(sql3);
            new FacturaDAO().EliminarFactura(sql4);
            DefaultTableModel modelo = c.administrarFacturas("SELECT * FROM Facturas"); 
            tablaAdministrarFacturas.setModel(modelo);
        }
        
    }//GEN-LAST:event_tablaAdministrarFacturasMousePressed
    }
    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        try {
            Conexion con = new Conexion();
            Connection conn = con.conexion;

            JasperReport reporte = null;
            String path = "src\\Reporte\\ReporteFacturas.jasper";

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

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        
        String cont = JOptionPane.showInputDialog(null, "Ingresa No. de Factura");
        
            if(new FacturaDAO().buscaridFacturaProcedimiento(cont, "id_Factura").equals(cont)){
              DefaultTableModel modelo = c.administrarFacturas("SELECT * FROM Facturas"); 
            tablaAdministrarFacturas.setModel(modelo);
            JOptionPane.showMessageDialog(null, "Pago exitoso", "Pagar factura", JOptionPane.WIDTH);  
            }else{
              JOptionPane.showMessageDialog(null, "Número de factura no válido", "Error", JOptionPane.ERROR_MESSAGE);
  
            }
            

            
        
        
            
        
        
                
    }//GEN-LAST:event_jPanel2MousePressed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCerrarAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel pAdminFacturas;
    private javax.swing.JPanel pCerrarAdmin;
    public static javax.swing.JTable tablaAdministrarFacturas;
    private javax.swing.JTextField txtAdministrarFacturas;
    // End of variables declaration//GEN-END:variables
}
