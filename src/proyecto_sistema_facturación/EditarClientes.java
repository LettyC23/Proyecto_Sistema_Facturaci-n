/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_sistema_facturación;


import Controlador.ClienteDAO;
import Modelo.Cliente;
import Modelo.ValidarDatos;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import static proyecto_sistema_facturación.Clientes.tablaClientes;

/**
 *
 * @author tmx
 */
public class EditarClientes extends javax.swing.JFrame {

       String nombre;
       String direccion;
       String telefono;
       String correo;
   
    Conexion_BD.Conexion c = new Conexion_BD.Conexion();
    ValidarDatos validarDatos = new ValidarDatos();
    
    
    public EditarClientes() {
        initComponents();
        
      
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEditarNombreCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEditarDireccionCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEditarTelefonoCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEditarCorreoCliente = new javax.swing.JTextField();
        pGuardarCambios = new javax.swing.JPanel();
        jGuardarCambios = new javax.swing.JLabel();
        pCancelar = new javax.swing.JPanel();
        jCancelar = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Editar Clientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel3.setText("Nombre Completo");

        txtEditarNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEditarNombreClienteKeyReleased(evt);
            }
        });

        jLabel4.setText("Dirección");

        jLabel5.setText("Teléfono");

        txtEditarTelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEditarTelefonoClienteKeyReleased(evt);
            }
        });

        jLabel6.setText("Correo");

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

        jGuardarCambios.setText("Guardar Cambios");

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
                .addGap(0, 13, Short.MAX_VALUE))
        );
        pCancelarLayout.setVerticalGroup(
            pCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCancelar)
        );

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtEditarCorreoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addComponent(txtEditarTelefonoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEditarDireccionCliente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEditarNombreCliente, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditarNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditarDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditarTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditarCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void pGuardarCambiosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pGuardarCambiosMousePressed
        nombre = txtEditarNombreCliente.getText();
        direccion = txtEditarDireccionCliente.getText();
        telefono = txtEditarTelefonoCliente.getText();
        correo = txtEditarCorreoCliente.getText();
        
        
        if(telefono.length()==10){
            
             Pattern pattern = Pattern
                        .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
                        Matcher mather = pattern.matcher(correo);
                        
                if(mather.find()==true){
                    Cliente editarCliente = new Cliente(nombre, direccion, telefono, correo);
                    new ClienteDAO().ActualizarEmpleado(editarCliente, txtId.getText());
                    
                    DefaultTableModel modelo = c.clientes("SELECT * FROM Clientes"); 
                    tablaClientes.setModel(modelo); 
                    this.setVisible(false);
                    
                }else{
                       JOptionPane.showMessageDialog(null, "Correo ingresado no válido", "Correo electrónico no válido", JOptionPane.ERROR_MESSAGE); 
                }
            
        }else{
            JOptionPane.showMessageDialog(null, "El numéro de teléfono ingresado es incorrecto", "Número incorrecto", JOptionPane.ERROR_MESSAGE);
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

    private void txtEditarNombreClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditarNombreClienteKeyReleased
        validarDatos.validarSoloLetras(txtEditarNombreCliente);
    }//GEN-LAST:event_txtEditarNombreClienteKeyReleased

    private void txtEditarTelefonoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditarTelefonoClienteKeyReleased
        validarDatos.validarSoloNumeros(txtEditarTelefonoCliente);
    }//GEN-LAST:event_txtEditarTelefonoClienteKeyReleased

    
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
            java.util.logging.Logger.getLogger(EditarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCancelar;
    private javax.swing.JLabel jGuardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pCancelar;
    private javax.swing.JPanel pGuardarCambios;
    public static javax.swing.JTextField txtEditarCorreoCliente;
    public static javax.swing.JTextField txtEditarDireccionCliente;
    public static javax.swing.JTextField txtEditarNombreCliente;
    public static javax.swing.JTextField txtEditarTelefonoCliente;
    public static javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
