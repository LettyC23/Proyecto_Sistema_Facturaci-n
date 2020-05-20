/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_sistema_facturación;

import java.awt.Color;
import javax.swing.border.LineBorder;
import Modelo.Cliente;
import Controlador.ClienteDAO;
import Modelo.ActualizarTablas;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import java.util.ArrayList;
import Modelo.ValidarDatos;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

/**
 *
 * @author tmx
 */
public class Clientes extends javax.swing.JPanel {

    String nombreCliente;
    String direccion;
    String telefono;
    String correo;
    
    
    ActualizarTablas ac = new ActualizarTablas();
    ValidarDatos validarDatos = new ValidarDatos();
    
     public void pb(){
       
        pClientes.setVisible(true);
        
    }
    public void clientes(){
        pClientes.setVisible(true);
    }
    public Clientes() {
        initComponents();
        ac.actualizarTabla(tablaClientes, "SELECT * FROM Clientes");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        pClientes = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        pGuardarCliente = new javax.swing.JPanel();
        jGuardarCliente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtBuscarCliente = new javax.swing.JTextField();
        pBuscarCliente = new javax.swing.JPanel();
        jBuscarCliente = new javax.swing.JLabel();
        tablaClientes = new javax.swing.JTable();
        pcerrarClientes = new javax.swing.JPanel();
        jCerrarClientes = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

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

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        pClientes.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setText("                                                                                     Registrar Cliente");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(235, 235, 235));
        jTextField2.setText("Registrar Clientes");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("Nombre Completo");

        txtNombreCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtNombreClienteMouseReleased(evt);
            }
        });
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Dirección");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Teléfono");

        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtTelefonoMouseReleased(evt);
            }
        });
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Correo electrónico");

        pGuardarCliente.setBackground(new java.awt.Color(204, 204, 255));
        pGuardarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pGuardarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pGuardarClienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pGuardarClienteMousePressed(evt);
            }
        });

        jGuardarCliente.setText("Guardar");

        javax.swing.GroupLayout pGuardarClienteLayout = new javax.swing.GroupLayout(pGuardarCliente);
        pGuardarCliente.setLayout(pGuardarClienteLayout);
        pGuardarClienteLayout.setHorizontalGroup(
            pGuardarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGuardarClienteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jGuardarCliente)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pGuardarClienteLayout.setVerticalGroup(
            pGuardarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGuardarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jGuardarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(235, 235, 235));

        txtBuscarCliente.setToolTipText("");
        txtBuscarCliente.setName(""); // NOI18N
        txtBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarClienteKeyReleased(evt);
            }
        });

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
                .addContainerGap()
                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        txtBuscarCliente.getAccessibleContext().setAccessibleName("");

        tablaClientes.setAutoCreateRowSorter(true);
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", ""},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));

        pcerrarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pcerrarClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pcerrarClientesMouseExited(evt);
            }
        });

        jCerrarClientes.setText("x");

        javax.swing.GroupLayout pcerrarClientesLayout = new javax.swing.GroupLayout(pcerrarClientes);
        pcerrarClientes.setLayout(pcerrarClientesLayout);
        pcerrarClientesLayout.setHorizontalGroup(
            pcerrarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcerrarClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCerrarClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pcerrarClientesLayout.setVerticalGroup(
            pcerrarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcerrarClientesLayout.createSequentialGroup()
                .addComponent(jCerrarClientes)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel5.setText("Identificación         Nombres                    Dirección                    Teléfono                Correo                   ");

        javax.swing.GroupLayout pClientesLayout = new javax.swing.GroupLayout(pClientes);
        pClientes.setLayout(pClientesLayout);
        pClientesLayout.setHorizontalGroup(
            pClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pClientesLayout.createSequentialGroup()
                .addComponent(jTextField1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pcerrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pClientesLayout.createSequentialGroup()
                .addGroup(pClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pClientesLayout.createSequentialGroup()
                        .addGroup(pClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pClientesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tablaClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pClientesLayout.setVerticalGroup(
            pClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pClientesLayout.createSequentialGroup()
                .addGroup(pClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcerrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaClientes.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void pGuardarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pGuardarClienteMouseEntered
        jGuardarCliente.setForeground(Color.WHITE);
        pGuardarCliente.setBackground(new Color(51,0,255));
        pGuardarCliente.setBorder(new LineBorder(new Color(51,0,255),1,true));
    }//GEN-LAST:event_pGuardarClienteMouseEntered

    private void pGuardarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pGuardarClienteMouseExited
        jGuardarCliente.setForeground(Color.BLACK);
        pGuardarCliente.setBackground(new Color(204,204,255));
        pGuardarCliente.setBorder(new LineBorder(new Color(204,204,255),1,true));
    }//GEN-LAST:event_pGuardarClienteMouseExited

    private void pBuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pBuscarClienteMouseEntered
        jBuscarCliente.setForeground(Color.WHITE);
        pBuscarCliente.setBackground(new Color(51,0,255));
        pBuscarCliente.setBorder(new LineBorder(new Color(51,0,255),1,true));
    }//GEN-LAST:event_pBuscarClienteMouseEntered

    private void pBuscarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pBuscarClienteMouseExited
        jBuscarCliente.setForeground(Color.BLACK);
        pBuscarCliente.setBackground(new Color(204,204,255));
        pBuscarCliente.setBorder(new LineBorder(new Color(204,204,255),1,true));
    }//GEN-LAST:event_pBuscarClienteMouseExited

    private void pcerrarClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcerrarClientesMouseEntered
        jCerrarClientes.setForeground(Color.WHITE);
        pcerrarClientes.setBackground(new Color(255,0,51));
        pcerrarClientes.setBorder(new LineBorder(new Color(255,0,51),1,true));
    }//GEN-LAST:event_pcerrarClientesMouseEntered

    private void pcerrarClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcerrarClientesMouseExited
        jCerrarClientes.setForeground(Color.BLACK);
        pcerrarClientes.setBackground(new Color(220,220,220));
        pcerrarClientes.setBorder(new LineBorder(new Color(220,220,220),1,true));
        
    }//GEN-LAST:event_pcerrarClientesMouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void pGuardarClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pGuardarClienteMousePressed
       
        validarDatos.validarSoloLetras(txtNombreCliente);
        validarDatos.validarSoloNumeros(txtTelefono);
        
        nombreCliente = txtNombreCliente.getText();
        direccion = txtDireccion.getText();
        telefono = txtTelefono.getText();
        correo = txtCorreo.getText();
        
        
        if(!nombreCliente.isEmpty() && !direccion.isEmpty() && !telefono.isEmpty() && !correo.isEmpty()){
            
            if(telefono.length()==10){
                
                        Pattern pattern = Pattern
                        .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
                        Matcher mather = pattern.matcher(correo);
                        
                if(mather.find()==true){
                    Cliente agregarCliente = new Cliente(nombreCliente, direccion,telefono,correo);
                    new ClienteDAO().AgregarCliente(agregarCliente);
                    ac.actualizarTabla(tablaClientes, "SELECT * FROM Clientes"); 
                    
                    txtNombreCliente.setText("");
                    txtDireccion.setText("");
                    txtTelefono.setText("");
                    txtCorreo.setText("");
                    
                }else{
                   JOptionPane.showMessageDialog(null, "Correo ingresado no válido", "Error al registrar", JOptionPane.ERROR_MESSAGE); 
                }
                
            }else{
             JOptionPane.showMessageDialog(null, "El numéro de teléfono ingresado es incorrecto", "Error al registrar", JOptionPane.ERROR_MESSAGE);   
            }
        }else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos", "Error al registrar", JOptionPane.ERROR_MESSAGE);
           
        }
        
        
        
        
    
      
    }//GEN-LAST:event_pGuardarClienteMousePressed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtNombreClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreClienteMouseReleased
       validarDatos.validarSoloLetras(txtNombreCliente);
    }//GEN-LAST:event_txtNombreClienteMouseReleased

    private void txtTelefonoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMouseReleased
        validarDatos.validarSoloNumeros(txtTelefono);
    }//GEN-LAST:event_txtTelefonoMouseReleased

    private void txtBuscarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarClienteKeyReleased
        ac.actualizarTabla(tablaClientes, "SELECT * FROM Clientes WHERE NombreCliente LIKE '%" + txtBuscarCliente.getText()+"%'");
    }//GEN-LAST:event_txtBuscarClienteKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBuscarCliente;
    private javax.swing.JLabel jCerrarClientes;
    private javax.swing.JLabel jGuardarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel pBuscarCliente;
    private javax.swing.JPanel pClientes;
    private javax.swing.JPanel pGuardarCliente;
    private javax.swing.JPanel pcerrarClientes;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
