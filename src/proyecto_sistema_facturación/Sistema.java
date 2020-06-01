
package proyecto_sistema_facturación;
import Gráficas.Graficas;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import static proyecto_sistema_facturación.Proveedores.tablaProveedores;

/**
 *
 * @author tmx
 */
public class Sistema extends javax.swing.JFrame {

    Inicio inicio = new Inicio();
    Proveedores proveedores = new Proveedores();
    Productos productos = new Productos();
    Clientes clientes = new Clientes();
    Usuarios usuarios = new Usuarios();
    Nueva_Factura NFactura = new Nueva_Factura();
    Administrar_Facturas AFacturas = new Administrar_Facturas();
    Confiuracion configuracion = new Confiuracion();
    
    CardLayout vista;
    public Sistema() {
        initComponents();
        vista = (CardLayout) jPanelVistas.getLayout();
        inicio.inicio();
        jPanelVistas.add(inicio);
        vista.show(jPanelVistas,"");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        pInicio = new javax.swing.JPanel();
        Inicio = new javax.swing.JLabel();
        pProductos = new javax.swing.JPanel();
        Productos = new javax.swing.JLabel();
        pClientes = new javax.swing.JPanel();
        Clientes = new javax.swing.JLabel();
        pUsuarios = new javax.swing.JPanel();
        Usuarios = new javax.swing.JLabel();
        pProveedores = new javax.swing.JPanel();
        Proveedores = new javax.swing.JLabel();
        pNuevaFactura = new javax.swing.JPanel();
        NuevaFactura = new javax.swing.JLabel();
        pAdminFacturas = new javax.swing.JPanel();
        AdministrarFacturas = new javax.swing.JLabel();
        pSalir = new javax.swing.JPanel();
        Salir = new javax.swing.JLabel();
        pConfiguracion = new javax.swing.JPanel();
        Configuración = new javax.swing.JLabel();
        jPanelVistas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelPrincipal.setBackground(new java.awt.Color(234, 234, 234));

        jPanelMenu.setBackground(new java.awt.Color(0, 0, 0));
        jPanelMenu.setForeground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(160, 386));

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

        pInicio.setBackground(new java.awt.Color(0, 0, 0));
        pInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pInicioMousePressed(evt);
            }
        });

        Inicio.setBackground(new java.awt.Color(255, 255, 255));
        Inicio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Inicio.png"))); // NOI18N
        Inicio.setText("    Inicio");
        Inicio.setEnabled(false);
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pInicioLayout = new javax.swing.GroupLayout(pInicio);
        pInicio.setLayout(pInicioLayout);
        pInicioLayout.setHorizontalGroup(
            pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInicioLayout.createSequentialGroup()
                .addComponent(Inicio)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pInicioLayout.setVerticalGroup(
            pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInicioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Inicio))
        );

        pProductos.setBackground(new java.awt.Color(0, 0, 0));
        pProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pProductosMousePressed(evt);
            }
        });

        Productos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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

        javax.swing.GroupLayout pProductosLayout = new javax.swing.GroupLayout(pProductos);
        pProductos.setLayout(pProductosLayout);
        pProductosLayout.setHorizontalGroup(
            pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProductosLayout.createSequentialGroup()
                .addComponent(Productos)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pProductosLayout.setVerticalGroup(
            pProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Productos, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pClientes.setBackground(new java.awt.Color(0, 0, 0));
        pClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pClientesMousePressed(evt);
            }
        });

        Clientes.setBackground(new java.awt.Color(51, 51, 51));
        Clientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Clientes.setForeground(new java.awt.Color(51, 51, 51));
        Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Usuario.png"))); // NOI18N
        Clientes.setText("    Clientes");
        Clientes.setEnabled(false);
        Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pClientesLayout = new javax.swing.GroupLayout(pClientes);
        pClientes.setLayout(pClientesLayout);
        pClientesLayout.setHorizontalGroup(
            pClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pClientesLayout.createSequentialGroup()
                .addComponent(Clientes)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pClientesLayout.setVerticalGroup(
            pClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Clientes)
        );

        pUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        pUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pUsuariosMousePressed(evt);
            }
        });

        Usuarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Usuarios.setForeground(new java.awt.Color(51, 51, 51));
        Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Usuario.png"))); // NOI18N
        Usuarios.setText("    Usuarios");
        Usuarios.setEnabled(false);
        Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuariosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pUsuariosLayout = new javax.swing.GroupLayout(pUsuarios);
        pUsuarios.setLayout(pUsuariosLayout);
        pUsuariosLayout.setHorizontalGroup(
            pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuariosLayout.createSequentialGroup()
                .addComponent(Usuarios)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pUsuariosLayout.setVerticalGroup(
            pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Usuarios)
        );

        pProveedores.setBackground(new java.awt.Color(0, 0, 0));
        pProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pProveedoresMousePressed(evt);
            }
        });

        Proveedores.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Proveedores.setForeground(new java.awt.Color(51, 51, 51));
        Proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Usuario.png"))); // NOI18N
        Proveedores.setText("    Proveedores");
        Proveedores.setEnabled(false);
        Proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveedoresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pProveedoresLayout = new javax.swing.GroupLayout(pProveedores);
        pProveedores.setLayout(pProveedoresLayout);
        pProveedoresLayout.setHorizontalGroup(
            pProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProveedoresLayout.createSequentialGroup()
                .addComponent(Proveedores)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pProveedoresLayout.setVerticalGroup(
            pProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Proveedores)
        );

        pNuevaFactura.setBackground(new java.awt.Color(0, 0, 0));
        pNuevaFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pNuevaFacturaMousePressed(evt);
            }
        });

        NuevaFactura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NuevaFactura.setForeground(new java.awt.Color(51, 51, 51));
        NuevaFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo.png"))); // NOI18N
        NuevaFactura.setText("    Nueva factura");
        NuevaFactura.setEnabled(false);
        NuevaFactura.setInheritsPopupMenu(false);
        NuevaFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevaFacturaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pNuevaFacturaLayout = new javax.swing.GroupLayout(pNuevaFactura);
        pNuevaFactura.setLayout(pNuevaFacturaLayout);
        pNuevaFacturaLayout.setHorizontalGroup(
            pNuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNuevaFacturaLayout.createSequentialGroup()
                .addComponent(NuevaFactura)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pNuevaFacturaLayout.setVerticalGroup(
            pNuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NuevaFactura)
        );

        pAdminFacturas.setBackground(new java.awt.Color(0, 0, 0));

        AdministrarFacturas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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

        javax.swing.GroupLayout pAdminFacturasLayout = new javax.swing.GroupLayout(pAdminFacturas);
        pAdminFacturas.setLayout(pAdminFacturasLayout);
        pAdminFacturasLayout.setHorizontalGroup(
            pAdminFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAdminFacturasLayout.createSequentialGroup()
                .addComponent(AdministrarFacturas)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        pAdminFacturasLayout.setVerticalGroup(
            pAdminFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdministrarFacturas)
        );

        pSalir.setBackground(new java.awt.Color(0, 0, 0));
        pSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pSalirMousePressed(evt);
            }
        });

        Salir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(51, 51, 51));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir.png"))); // NOI18N
        Salir.setText("     Salir");
        Salir.setEnabled(false);
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pSalirLayout = new javax.swing.GroupLayout(pSalir);
        pSalir.setLayout(pSalirLayout);
        pSalirLayout.setHorizontalGroup(
            pSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSalirLayout.createSequentialGroup()
                .addComponent(Salir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pSalirLayout.setVerticalGroup(
            pSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salir)
        );

        pConfiguracion.setBackground(new java.awt.Color(0, 0, 0));
        pConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pConfiguracionMousePressed(evt);
            }
        });

        Configuración.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Configuración.setForeground(new java.awt.Color(51, 51, 51));
        Configuración.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Configuración_1.png"))); // NOI18N
        Configuración.setText("    Configuración");
        Configuración.setEnabled(false);
        Configuración.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfiguraciónMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pConfiguracionLayout = new javax.swing.GroupLayout(pConfiguracion);
        pConfiguracion.setLayout(pConfiguracionLayout);
        pConfiguracionLayout.setHorizontalGroup(
            pConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConfiguracionLayout.createSequentialGroup()
                .addComponent(Configuración)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pConfiguracionLayout.setVerticalGroup(
            pConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Configuración)
        );

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pNuevaFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pAdminFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(pInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pNuevaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pAdminFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 165, Short.MAX_VALUE))
        );

        jPanelVistas.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVistas, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        proveedores.proveedores();
        jPanelVistas.add(proveedores);
        vista.show(jPanelVistas, "");
    }//GEN-LAST:event_ProveedoresMouseClicked

    private void NuevaFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaFacturaMouseClicked
        NFactura.nuevaFactura();
        jPanelVistas.add(NFactura);
        vista.show(jPanelVistas, "");
    }//GEN-LAST:event_NuevaFacturaMouseClicked

    private void ConfiguraciónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiguraciónMouseClicked
        configuracion.configuracion();
        jPanelVistas.add(configuracion);
        vista.show(jPanelVistas, "");
    }//GEN-LAST:event_ConfiguraciónMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
    
                    String botones [] ={"Si","No"};
                    int eleccion=JOptionPane.showOptionDialog(this, "¿Estas seguro cerrar sesion", "Eliminar cliente", 0, 0, null, botones, this);

                    if(eleccion==JOptionPane.YES_OPTION){
                        System.exit(0);
                    }
    }//GEN-LAST:event_SalirMouseClicked

    private void UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosMouseClicked
        usuarios.usuarios();
        jPanelVistas.add(usuarios);
        vista.show(jPanelVistas, "");
    }//GEN-LAST:event_UsuariosMouseClicked

    private void InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_InicioMouseClicked

    private void pInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pInicioMousePressed
       
    }//GEN-LAST:event_pInicioMousePressed

    private void pProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pProductosMousePressed
       productos.productos();
       jPanelVistas.add(productos);
       vista.show(jPanelVistas,"");
    }//GEN-LAST:event_pProductosMousePressed

    private void pClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pClientesMousePressed
        clientes.clientes();
        jPanelVistas.add(clientes);
        vista.show(jPanelVistas, "");
    }//GEN-LAST:event_pClientesMousePressed

    private void pUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUsuariosMousePressed
        usuarios.usuarios();
        jPanelVistas.add(usuarios);
        vista.show(jPanelVistas, "");
    }//GEN-LAST:event_pUsuariosMousePressed

    private void pProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pProveedoresMousePressed
        proveedores.proveedores();
        jPanelVistas.add(proveedores);
        vista.show(jPanelVistas, "");
    }//GEN-LAST:event_pProveedoresMousePressed

    private void pNuevaFacturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pNuevaFacturaMousePressed
        NFactura.nuevaFactura();
        jPanelVistas.add(NFactura);
        vista.show(jPanelVistas, "");
    }//GEN-LAST:event_pNuevaFacturaMousePressed

    private void pConfiguracionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConfiguracionMousePressed
        configuracion.configuracion();
        jPanelVistas.add(configuracion);
        vista.show(jPanelVistas, "");
    }//GEN-LAST:event_pConfiguracionMousePressed

    private void pSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSalirMousePressed
        String registro =tablaProveedores.getValueAt(tablaProveedores.getSelectedRow(), 0).toString();

                    String botones [] ={"Si","No"};
                    int eleccion=JOptionPane.showOptionDialog(this, "¿Estas seguro de eliminar el registro "+tablaProveedores.getValueAt(tablaProveedores.getSelectedRow(), 0)+" ?", "Eliminar cliente", 0, 0, null, botones, this);

                    if(eleccion==JOptionPane.YES_OPTION){
        System.exit(0);
                    }
    }//GEN-LAST:event_pSalirMousePressed

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
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel Usuarios;
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelVistas;
    private javax.swing.JPanel pAdminFacturas;
    private javax.swing.JPanel pClientes;
    private javax.swing.JPanel pConfiguracion;
    private javax.swing.JPanel pInicio;
    private javax.swing.JPanel pNuevaFactura;
    private javax.swing.JPanel pProductos;
    private javax.swing.JPanel pProveedores;
    private javax.swing.JPanel pSalir;
    private javax.swing.JPanel pUsuarios;
    // End of variables declaration//GEN-END:variables
}
