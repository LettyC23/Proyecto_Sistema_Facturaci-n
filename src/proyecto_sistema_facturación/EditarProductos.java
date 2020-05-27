/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_sistema_facturación;

import Controlador.ProductoDAO;
import Modelo.Producto;
import Modelo.ValidarDatos;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import static proyecto_sistema_facturación.Productos.tablaProductos;

/**
 *
 * @author tmx
 */
public class EditarProductos extends javax.swing.JFrame {
    
    String Descripcion;
    double precio;
    int existencias;
    int id_Proveedor;
    int id_TipoProducto;

    Conexion_BD.Conexion c = new Conexion_BD.Conexion();
    ValidarDatos validarDatos = new ValidarDatos();
    
    
    public EditarProductos() {
        initComponents();
        c.ComboBoxProveedores(cboxEditarProveedor);
        c.ComboBoxTipoProducto(cboxEditarTipoProducto);
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtEditarDescripcionProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEditarPrecioProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEditarStockProducto = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pGuardarCambios = new javax.swing.JPanel();
        jGuardarCambios = new javax.swing.JLabel();
        pCancelar = new javax.swing.JPanel();
        jCancelar = new javax.swing.JLabel();
        cboxEditarTipoProducto = new javax.swing.JComboBox<>();
        cboxEditarProveedor = new javax.swing.JComboBox<>();
        txtIdEditarProducto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Descripción");

        txtEditarDescripcionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditarDescripcionProductoActionPerformed(evt);
            }
        });
        txtEditarDescripcionProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEditarDescripcionProductoKeyReleased(evt);
            }
        });

        jLabel4.setText("Precio");

        txtEditarPrecioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEditarPrecioProductoKeyReleased(evt);
            }
        });

        jLabel5.setText("Existencias");

        txtEditarStockProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEditarStockProductoKeyReleased(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Editar Productos ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pGuardarCambios.setBackground(new java.awt.Color(204, 204, 255));
        pGuardarCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pGuardarCambiosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pGuardarCambiosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pGuardarCambiosMousePressed(evt);
            }
        });

        jGuardarCambios.setText("Guardar cambios");

        javax.swing.GroupLayout pGuardarCambiosLayout = new javax.swing.GroupLayout(pGuardarCambios);
        pGuardarCambios.setLayout(pGuardarCambiosLayout);
        pGuardarCambiosLayout.setHorizontalGroup(
            pGuardarCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGuardarCambiosLayout.createSequentialGroup()
                .addComponent(jGuardarCambios)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        pGuardarCambiosLayout.setVerticalGroup(
            pGuardarCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jGuardarCambios)
        );

        pCancelar.setBackground(new java.awt.Color(204, 204, 255));
        pCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pCancelarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pCancelarMousePressed(evt);
            }
        });

        jCancelar.setText("Cancelar");

        javax.swing.GroupLayout pCancelarLayout = new javax.swing.GroupLayout(pCancelar);
        pCancelar.setLayout(pCancelarLayout);
        pCancelarLayout.setHorizontalGroup(
            pCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCancelarLayout.createSequentialGroup()
                .addComponent(jCancelar)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        pCancelarLayout.setVerticalGroup(
            pCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCancelar)
        );

        cboxEditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxEditarProveedorActionPerformed(evt);
            }
        });

        txtIdEditarProducto.setEditable(false);
        txtIdEditarProducto.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtIdEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtEditarDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEditarStockProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                .addComponent(txtEditarPrecioProducto, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cboxEditarProveedor, javax.swing.GroupLayout.Alignment.LEADING, 0, 125, Short.MAX_VALUE)
                                .addComponent(cboxEditarTipoProducto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditarDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditarPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditarStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxEditarTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pGuardarCambios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEditarDescripcionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditarDescripcionProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditarDescripcionProductoActionPerformed

    private void cboxEditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxEditarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxEditarProveedorActionPerformed

    private void pGuardarCambiosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pGuardarCambiosMousePressed
        Descripcion = txtEditarDescripcionProducto.getText();
        String a = new ProductoDAO().buscaridProveedor(cboxEditarProveedor.getSelectedItem().toString());
        String b = new ProductoDAO().buscaridTipoProducto(cboxEditarTipoProducto.getSelectedItem().toString());
        String x = txtEditarPrecioProducto.getText();
        String y = txtEditarStockProducto.getText();
        
         if(!Descripcion.isEmpty() && !x.isEmpty() && !y.isEmpty()){
            precio = Double.parseDouble(txtEditarPrecioProducto.getText());
            existencias = Integer.parseInt(txtEditarStockProducto.getText());
            if(cboxEditarProveedor.getSelectedIndex()>0){
                if(cboxEditarTipoProducto.getSelectedIndex()>0){
                    
                    Producto editarProducto = new Producto(Descripcion,precio,existencias,b,a);
                    new ProductoDAO().ActualizarProducto(editarProducto, txtIdEditarProducto.getText());
                    this.setVisible(false);
                    DefaultTableModel modelo = c.Productos("SELECT * FROM PRODUCTOS");
                    tablaProductos.setModel(modelo); 
                    
                    
                }else{
                     JOptionPane.showMessageDialog(null, "Ningun Tipo de producto seleccionado", "Error al registrar", JOptionPane.ERROR_MESSAGE);   
                }
              
            }else{
                JOptionPane.showMessageDialog(null, "Ningun proveedor seleccionado", "Error al registrar", JOptionPane.ERROR_MESSAGE);
           
            }
           
        }else{
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos", "Error al registrar", JOptionPane.ERROR_MESSAGE);
           
        }
    }//GEN-LAST:event_pGuardarCambiosMousePressed

    private void pCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCancelarMousePressed
        this.setVisible(false);
    }//GEN-LAST:event_pCancelarMousePressed

    private void pGuardarCambiosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pGuardarCambiosMouseEntered
        jGuardarCambios.setForeground(Color.WHITE);
        pGuardarCambios.setBackground(new Color(51,0,255));
        pGuardarCambios.setBorder(new LineBorder(new Color(51,0,255),1,true));
    }//GEN-LAST:event_pGuardarCambiosMouseEntered

    private void pGuardarCambiosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pGuardarCambiosMouseExited
        jGuardarCambios.setForeground(Color.BLACK);
        pGuardarCambios.setBackground(new Color(204,204,255));
        pGuardarCambios.setBorder(new LineBorder(new Color(204,204,255),1,true));
    }//GEN-LAST:event_pGuardarCambiosMouseExited

    private void pCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCancelarMouseEntered
        jCancelar.setForeground(Color.WHITE);
        pCancelar.setBackground(new Color(51,0,255));
        pCancelar.setBorder(new LineBorder(new Color(51,0,255),1,true));
    }//GEN-LAST:event_pCancelarMouseEntered

    private void pCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCancelarMouseExited
        jCancelar.setForeground(Color.BLACK);
        pCancelar.setBackground(new Color(204,204,255));
        pCancelar.setBorder(new LineBorder(new Color(204,204,255),1,true));
    }//GEN-LAST:event_pCancelarMouseExited

    private void txtEditarDescripcionProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditarDescripcionProductoKeyReleased
        validarDatos.validarSoloLetras(txtEditarDescripcionProducto);
    }//GEN-LAST:event_txtEditarDescripcionProductoKeyReleased

    private void txtEditarPrecioProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditarPrecioProductoKeyReleased
        validarDatos.validarSoloNumerosDecimales(txtEditarPrecioProducto);
    }//GEN-LAST:event_txtEditarPrecioProductoKeyReleased

    private void txtEditarStockProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditarStockProductoKeyReleased
        validarDatos.validarSoloNumeros(txtEditarStockProducto);
    }//GEN-LAST:event_txtEditarStockProductoKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cboxEditarProveedor;
    public static javax.swing.JComboBox<String> cboxEditarTipoProducto;
    private javax.swing.JLabel jCancelar;
    private javax.swing.JLabel jGuardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel pCancelar;
    private javax.swing.JPanel pGuardarCambios;
    public static javax.swing.JTextField txtEditarDescripcionProducto;
    public static javax.swing.JTextField txtEditarPrecioProducto;
    public static javax.swing.JTextField txtEditarStockProducto;
    public static javax.swing.JTextField txtIdEditarProducto;
    // End of variables declaration//GEN-END:variables
}
