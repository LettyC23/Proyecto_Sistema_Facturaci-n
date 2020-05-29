/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_sistema_facturación;

import Conexion_BD.Conexion;
import java.awt.Color;
import javax.swing.border.LineBorder;
import Modelo.Cliente;
import Controlador.ClienteDAO;
import Controlador.ProductoDAO;
import Controlador.ProveedorDAO;
import Controlador.UsuarioDAO;
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
import java.awt.Component;
import java.sql.Connection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;
import static proyecto_sistema_facturación.Inicio.txtContadorClientes;
import static proyecto_sistema_facturación.Inicio.txtContadorProductos;
import static proyecto_sistema_facturación.Inicio.txtContadorProveedores;
import static proyecto_sistema_facturación.Inicio.txtContadorUsuarios;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.compilers.JavaScriptClassLoader;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author tmx
 */
public class Clientes extends javax.swing.JPanel {

    String nombreCliente;
    String direccion;
    String telefono;
    String correo;
    
    
    Conexion_BD.Conexion c = new Conexion_BD.Conexion();
    ValidarDatos validarDatos = new ValidarDatos();
    
    
    public void clientes(){
        pClientes.setVisible(true);
    }
    public Clientes() {
        initComponents();
        txtBuscarCliente.setText("Ingresa el nombre del cliente");
        DefaultTableModel modelo = c.clientes("SELECT * FROM Clientes"); 
        tablaClientes.setModel(modelo); 
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        pcerrarClientes = new javax.swing.JPanel();
        jCerrarClientes = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

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
        txtBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarClienteMousePressed(evt);
            }
        });
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

        pcerrarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pcerrarClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pcerrarClientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pcerrarClientesMousePressed(evt);
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

        tablaClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaClientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, "", null},
                {null, null, null, null, "", null},
                {null, null, null, null, "", null},
                {null, null, null, null, "", null}
            },
            new String [] {
                "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tablaClientes.setShowVerticalLines(false);
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaClientesMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(tablaClientes);

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
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                .addGap(0, 19, Short.MAX_VALUE))
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
        
    }//GEN-LAST:event_pBuscarClienteMouseEntered

    private void pBuscarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pBuscarClienteMouseExited
        
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
        DefaultTableModel modelo = c.clientes("SELECT * FROM Clientes WHERE NombreCliente LIKE '%" + txtBuscarCliente.getText()+"%'"); 
        tablaClientes.setModel(modelo); 
       
    }//GEN-LAST:event_txtBuscarClienteKeyReleased

    private void tablaClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMousePressed
        if(tablaClientes.getSelectedColumn()==5){
            EditarClientes ec = new EditarClientes();
            int fila = tablaClientes.getSelectedRow();
            ec.txtId.setText(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0).toString());
            ec.txtEditarNombreCliente.setText(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 1).toString());
            ec.txtEditarDireccionCliente.setText(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 2).toString());
            ec.txtEditarTelefonoCliente.setText(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 3).toString());
            ec.txtEditarCorreoCliente.setText(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 4).toString());
            ec.setVisible(true);
        }else if(tablaClientes.getSelectedColumn()==6){
            
              String botones [] ={"Si","No"};
        int eleccion=JOptionPane.showOptionDialog(this, "¿Estas seguro de eliminar el registro "+tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0).toString()+" ?", "Eliminar cliente", 0, 0, null, botones, this);
        
        if(eleccion==JOptionPane.YES_OPTION){
            String sql3 = "DELETE FROM Clientes WHERE id_Cliente="+tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0).toString()+"";
        
            
            new ClienteDAO().EliminarCliente(sql3);
        
                 DefaultTableModel modelo = c.clientes("SELECT * FROM Clientes"); 
                 tablaClientes.setModel(modelo); 
                  
        }else if(eleccion==JOptionPane.NO_OPTION){
            
        }
            
        }
        
    }//GEN-LAST:event_tablaClientesMousePressed

    private void txtBuscarClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarClienteMousePressed
        txtBuscarCliente.setText("");
    }//GEN-LAST:event_txtBuscarClienteMousePressed

    private void pcerrarClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcerrarClientesMousePressed
        this.setVisible(false);
        txtContadorClientes.setText(new ClienteDAO().ContadorCliente());
        txtContadorProveedores.setText(new ProveedorDAO().ContadorProveedor());
        txtContadorProductos.setText(new ProductoDAO().ContadorProducto());
        txtContadorUsuarios.setText(new UsuarioDAO().ContadorUsuarios());
    }//GEN-LAST:event_pcerrarClientesMousePressed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        try {
            Conexion con = new Conexion();
            Connection conn = con.conexion;

            JasperReport reporte = null;
            String path = "src\\Reporte\\report3.jasper";

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

    public void eliminar(){
      
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBuscarCliente;
    private javax.swing.JLabel jCerrarClientes;
    private javax.swing.JLabel jGuardarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel pBuscarCliente;
    private javax.swing.JPanel pClientes;
    private javax.swing.JPanel pGuardarCliente;
    private javax.swing.JPanel pcerrarClientes;
    public static javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
