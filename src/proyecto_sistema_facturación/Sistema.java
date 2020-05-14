
package proyecto_sistema_facturación;
import java.awt.CardLayout;

/**
 *
 * @author tmx
 */
public class Sistema extends javax.swing.JFrame {

    Productos productos = new Productos();
    Clientes clientes = new Clientes();
    Usuarios usuarios = new Usuarios();
    Nueva_Factura NFactura = new Nueva_Factura();
    Administrar_Facturas AFacturas = new Administrar_Facturas();
    Reporte_Facturas RFacturas = new Reporte_Facturas();
    Grafica graficas = new Grafica();
    Confiuracion configuracion = new Confiuracion();
    
    CardLayout vista;
    public Sistema() {
        initComponents();
        vista = (CardLayout) jPanelVistas.getLayout();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        Clientes = new javax.swing.JLabel();
        Productos = new javax.swing.JLabel();
        Proveedores = new javax.swing.JLabel();
        NuevaFactura = new javax.swing.JLabel();
        AdministrarFacturas = new javax.swing.JLabel();
        Reportes = new javax.swing.JLabel();
        Configuración = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        Usuarios1 = new javax.swing.JLabel();
        Inicio = new javax.swing.JLabel();
        jPanelVistas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelPrincipal.setBackground(new java.awt.Color(234, 234, 234));

        jPanelMenu.setBackground(new java.awt.Color(0, 0, 0));
        jPanelMenu.setForeground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(160, 386));

        Clientes.setBackground(new java.awt.Color(51, 51, 51));
        Clientes.setForeground(new java.awt.Color(51, 51, 51));
        Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Usuario.png"))); // NOI18N
        Clientes.setText("    Clientes");
        Clientes.setEnabled(false);
        Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientesMouseClicked(evt);
            }
        });

        Productos.setForeground(new java.awt.Color(255, 255, 255));
        Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Producto.png"))); // NOI18N
        Productos.setText("    Productos");
        Productos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Productos.setEnabled(false);
        Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductosMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ProductosMouseReleased(evt);
            }
        });

        Proveedores.setForeground(new java.awt.Color(51, 51, 51));
        Proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Usuario.png"))); // NOI18N
        Proveedores.setText("    Proveedores");
        Proveedores.setEnabled(false);
        Proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveedoresMouseClicked(evt);
            }
        });

        NuevaFactura.setForeground(new java.awt.Color(51, 51, 51));
        NuevaFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo.png"))); // NOI18N
        NuevaFactura.setText("    Nueva factura");
        NuevaFactura.setEnabled(false);
        NuevaFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevaFacturaMouseClicked(evt);
            }
        });

        AdministrarFacturas.setForeground(new java.awt.Color(51, 51, 51));
        AdministrarFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Administrar.png"))); // NOI18N
        AdministrarFacturas.setText("    Administrar facturas");
        AdministrarFacturas.setEnabled(false);
        AdministrarFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdministrarFacturasMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AdministrarFacturasMouseReleased(evt);
            }
        });

        Reportes.setForeground(new java.awt.Color(51, 51, 51));
        Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Reporte.png"))); // NOI18N
        Reportes.setText("    Reportes");
        Reportes.setEnabled(false);
        Reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportesMouseClicked(evt);
            }
        });

        Configuración.setForeground(new java.awt.Color(51, 51, 51));
        Configuración.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Configuración_1.png"))); // NOI18N
        Configuración.setText("    Configuración");
        Configuración.setEnabled(false);
        Configuración.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfiguraciónMouseClicked(evt);
            }
        });

        Salir.setForeground(new java.awt.Color(51, 51, 51));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir.png"))); // NOI18N
        Salir.setText("     Salir");
        Salir.setEnabled(false);
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Menú.png"))); // NOI18N
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMenuMouseReleased(evt);
            }
        });
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        Usuarios1.setForeground(new java.awt.Color(51, 51, 51));
        Usuarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Usuario.png"))); // NOI18N
        Usuarios1.setText("    Usuarios");
        Usuarios1.setEnabled(false);
        Usuarios1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Usuarios1MouseClicked(evt);
            }
        });

        Inicio.setForeground(new java.awt.Color(51, 51, 51));
        Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Inicio.png"))); // NOI18N
        Inicio.setText("    Inicio");
        Inicio.setEnabled(false);
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Clientes)
                    .addComponent(Productos)
                    .addComponent(Proveedores)
                    .addComponent(NuevaFactura)
                    .addComponent(AdministrarFacturas)
                    .addComponent(Reportes)
                    .addComponent(Configuración)
                    .addComponent(Salir)
                    .addComponent(Usuarios1)
                    .addComponent(Inicio))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Inicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Productos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Clientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usuarios1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Proveedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NuevaFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdministrarFacturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reportes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Configuración)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir)
                .addGap(0, 122, Short.MAX_VALUE))
        );

        jPanelVistas.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVistas, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
            .addComponent(jPanelVistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
       
    }//GEN-LAST:event_btnMenuActionPerformed

    int x = 250;
    private void btnMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseReleased
       
        if (x==250){
               jPanelMenu.setSize(40, 550);
              btnMenu.setLocation(0, 0);
              jPanelVistas.setLocation(40, 0);
              jPanelVistas.setSize(850, 550);
               x=50;
       }else if (x==50){
           jPanelMenu.setSize(165, 550);
           btnMenu.setLocation(135, 0);
           jPanelVistas.setLocation(166, 0);
           x=250;
       }
      
    }//GEN-LAST:event_btnMenuMouseReleased

    private void ProductosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseReleased
       productos.productos();
       jPanelVistas.add(productos);
       vista.show(jPanelVistas,"");
    }//GEN-LAST:event_ProductosMouseReleased

    private void ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseClicked
       productos.productos();
       jPanelVistas.add(productos);
       vista.show(jPanelVistas,"");
    }//GEN-LAST:event_ProductosMouseClicked

    private void AdministrarFacturasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdministrarFacturasMouseReleased
       AFacturas.administrarFacturas();
        jPanelVistas.add(AFacturas);
        vista.show(jPanelVistas, "");
    }//GEN-LAST:event_AdministrarFacturasMouseReleased

    private void AdministrarFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdministrarFacturasMouseClicked
        AFacturas.administrarFacturas();
        jPanelVistas.add(AFacturas);
        vista.show(jPanelVistas, "");
    }//GEN-LAST:event_AdministrarFacturasMouseClicked

    private void ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesMouseClicked
        clientes.clientes();
        jPanelVistas.add(clientes);
        vista.show(jPanelVistas, "");
    }//GEN-LAST:event_ClientesMouseClicked

    private void ProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProveedoresMouseClicked
        usuarios.usuarios();
        jPanelVistas.add(usuarios);
        vista.show(jPanelVistas, "");
    }//GEN-LAST:event_ProveedoresMouseClicked

    private void NuevaFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaFacturaMouseClicked
        NFactura.nuevaFactura();
        jPanelVistas.add(NFactura);
        vista.show(jPanelVistas, "");
    }//GEN-LAST:event_NuevaFacturaMouseClicked

    private void ReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportesMouseClicked
       RFacturas.reportes();
        jPanelVistas.add(RFacturas);
        vista.show(jPanelVistas, "");
    }//GEN-LAST:event_ReportesMouseClicked

    private void ConfiguraciónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiguraciónMouseClicked
       configuracion.configuracion();
        jPanelVistas.add(configuracion);
        vista.show(jPanelVistas, "");
    }//GEN-LAST:event_ConfiguraciónMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void Usuarios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Usuarios1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Usuarios1MouseClicked

    private void InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_InicioMouseClicked

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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdministrarFacturas;
    private javax.swing.JLabel Clientes;
    private javax.swing.JLabel Configuración;
    private javax.swing.JLabel Inicio;
    private javax.swing.JLabel NuevaFactura;
    private javax.swing.JLabel Productos;
    private javax.swing.JLabel Proveedores;
    private javax.swing.JLabel Reportes;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel Usuarios1;
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelVistas;
    // End of variables declaration//GEN-END:variables
}
