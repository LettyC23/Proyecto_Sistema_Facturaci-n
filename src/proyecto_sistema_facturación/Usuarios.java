/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_sistema_facturación;

import Modelo.ActualizarTablas;
import Modelo.ValidarDatos;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author tmx
 */
public class Usuarios extends javax.swing.JPanel {

    AgregarUsuario n = new AgregarUsuario();
    ValidarDatos validarDatos = new ValidarDatos();
    ActualizarTablas ac = new ActualizarTablas();
    
    public void usuarios(){
        pUsuarios.setVisible(true);
    }
    
            
    public Usuarios() {
        initComponents();
        ac.actualizarTabla(tablaAdministrarUsuarios, "SELECT * FROM Usuarios");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        pUsuarios = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreUsuarios = new javax.swing.JTextField();
        pNuevoUsuario = new javax.swing.JPanel();
        jNuevoUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAdministrarUsuarios = new javax.swing.JTable();
        pCerrarUsuarios = new javax.swing.JPanel();
        jCerrarUsuarios = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

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

        jLabel4.setText("#           Nombre              Usuario           Correo                  Fecha ");

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
        jScrollPane1.setViewportView(tablaAdministrarUsuarios);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNombreUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
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

        javax.swing.GroupLayout pUsuariosLayout = new javax.swing.GroupLayout(pUsuarios);
        pUsuarios.setLayout(pUsuariosLayout);
        pUsuariosLayout.setHorizontalGroup(
            pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuariosLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUsuariosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pCerrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pUsuariosLayout.setVerticalGroup(
            pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuariosLayout.createSequentialGroup()
                .addComponent(pCerrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }//GEN-LAST:event_txtNombreUsuariosKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCerrarUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jNuevoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pCerrarUsuarios;
    private javax.swing.JPanel pNuevoUsuario;
    private javax.swing.JPanel pUsuarios;
    private javax.swing.JTable tablaAdministrarUsuarios;
    private javax.swing.JTextField txtNombreUsuarios;
    // End of variables declaration//GEN-END:variables
}
