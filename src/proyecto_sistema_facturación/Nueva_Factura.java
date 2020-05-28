/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_sistema_facturación;

import Conexion_BD.Conexion;
import Controlador.ClienteDAO;
import Controlador.DetalleFacturaDAO;
import Controlador.FacturaDAO;
import Controlador.ProductoDAO;
import Controlador.ProveedorDAO;
import Controlador.UsuarioDAO;
import Modelo.DetalleFactura;
import Modelo.Factura;
import Modelo.ValidarDatos;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import static proyecto_sistema_facturación.Clientes.tablaClientes;
import static proyecto_sistema_facturación.Inicio.txtContadorClientes;
import static proyecto_sistema_facturación.Inicio.txtContadorProductos;
import static proyecto_sistema_facturación.Inicio.txtContadorProveedores;
import static proyecto_sistema_facturación.Inicio.txtContadorUsuarios;

/**
 *
 * @author tmx
 */
public class Nueva_Factura extends javax.swing.JPanel {

    String fecha;
    String cliente;
    String vendedor;
    String estadoFactura;
    String formaPago;
    double totalFactura;
    
    Conexion_BD.Conexion c = new Conexion_BD.Conexion();
    ValidarDatos validarDatos = new ValidarDatos();
    
    public void nuevaFactura(){
        pNuevaFactura.setVisible(true);
        
    }
    public Nueva_Factura() {
        initComponents();
        DefaultTableModel modelo = c.adicionarProductos("SELECT DescripcionProducto, Precio FROM Productos"); 
        tablaAdicionarProductos.setModel(modelo);
        c.llenarComboBox(cboxClienteFactura, "NombreCliente", "Cliente","SELECT NombreCliente FROM Clientes ORDER BY NombreCliente ASC");
        c.llenarComboBox(cboxFormaPagoFactura, "Descripcion", "Forma de pago","SELECT Descripcion FROM Forma_Pago ORDER BY Descripcion ASC");
        c.llenarComboBox(cboxVendedorFactura, "Usuario", "Vendedor","SELECT Usuario FROM RegistroDeUsuarios ORDER BY Usuario ASC");
    }

    
    public String subtotal(){
        DecimalFormat c = new DecimalFormat(".00");
        int contar = tablaDetalleFactura.getRowCount();
        double suma = 0.00;
        for (int i = 0; i <contar; i++) {
            suma = suma+Double.parseDouble(tablaDetalleFactura.getValueAt(i, 4).toString()); 
        }
        return c.format(suma);
    }
    
    public String iva(){
        DecimalFormat c = new DecimalFormat(".00");
        int contar = tablaDetalleFactura.getRowCount();
        double suma = 0.00;
        for (int i = 0; i <contar; i++) {
            suma = suma+Double.parseDouble(tablaDetalleFactura.getValueAt(i, 4).toString()); 
        }
        return c.format(suma*0.15);
    }
    
    public String total(){
        DecimalFormat c = new DecimalFormat(".00");
        int contar = tablaDetalleFactura.getRowCount();
        double suma = 0.00;
        for (int i = 0; i <contar; i++) {
            suma = suma+Double.parseDouble(tablaDetalleFactura.getValueAt(i, 4).toString()); 
        }
        return c.format(suma*1.15);
    }
    
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pNuevaFactura = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        pDatosFactura = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        cboxFormaPagoFactura = new javax.swing.JComboBox<>();
        cboxVendedorFactura = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        cboxClienteFactura = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAdicionarProductos = new javax.swing.JTable();
        cboxEstadoFactura = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDetalleFactura = new javax.swing.JTable();
        pCerrarFacturas = new javax.swing.JPanel();
        jCerrarFacturas = new javax.swing.JLabel();
        pGuardar = new javax.swing.JPanel();
        jGuardar = new javax.swing.JLabel();
        pCancelar = new javax.swing.JPanel();
        jCancelar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setText("Registrar Factura");

        pDatosFactura.setBackground(new java.awt.Color(255, 255, 255));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(102, 102, 255));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Datos Factura");

        cboxFormaPagoFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxFormaPagoFacturaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Adicionar Productos");

        jTextField5.setToolTipText("Buscar productos");

        tablaAdicionarProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio", "Agregar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAdicionarProductos.setEditingColumn(1);
        tablaAdicionarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaAdicionarProductosMousePressed(evt);
            }
        });
        tablaAdicionarProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaAdicionarProductosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAdicionarProductos);

        cboxEstadoFactura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Pagado", "Por pagar" }));

        javax.swing.GroupLayout pDatosFacturaLayout = new javax.swing.GroupLayout(pDatosFactura);
        pDatosFactura.setLayout(pDatosFacturaLayout);
        pDatosFacturaLayout.setHorizontalGroup(
            pDatosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2)
            .addGroup(pDatosFacturaLayout.createSequentialGroup()
                .addGroup(pDatosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pDatosFacturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cboxClienteFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxFormaPagoFactura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pDatosFacturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cboxVendedorFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxEstadoFactura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pDatosFacturaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pDatosFacturaLayout.setVerticalGroup(
            pDatosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosFacturaLayout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxFormaPagoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxClienteFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDatosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxVendedorFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxEstadoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(102, 102, 255));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("Detalles Factura");

        tablaDetalleFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cantidad", "Descripción", "Precio Unit.", "Precio Total"
            }
        ));
        jScrollPane2.setViewportView(tablaDetalleFactura);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField4)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pCerrarFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pCerrarFacturasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pCerrarFacturasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pCerrarFacturasMousePressed(evt);
            }
        });

        jCerrarFacturas.setText("X");

        javax.swing.GroupLayout pCerrarFacturasLayout = new javax.swing.GroupLayout(pCerrarFacturas);
        pCerrarFacturas.setLayout(pCerrarFacturasLayout);
        pCerrarFacturasLayout.setHorizontalGroup(
            pCerrarFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCerrarFacturasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCerrarFacturas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCerrarFacturasLayout.setVerticalGroup(
            pCerrarFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCerrarFacturasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jCerrarFacturas))
        );

        pGuardar.setBackground(new java.awt.Color(204, 204, 255));
        pGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pGuardarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pGuardarMousePressed(evt);
            }
        });

        jGuardar.setText("Guardar");

        javax.swing.GroupLayout pGuardarLayout = new javax.swing.GroupLayout(pGuardar);
        pGuardar.setLayout(pGuardarLayout);
        pGuardarLayout.setHorizontalGroup(
            pGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jGuardar)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pGuardarLayout.setVerticalGroup(
            pGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(jCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCancelarLayout.setVerticalGroup(
            pCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCancelarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCancelar)
                .addContainerGap())
        );

        jLabel1.setText("TOTAL $");

        jLabel2.setText("IVA $");

        jLabel3.setText("SUBTOTAL $");

        txtSubtotal.setEditable(false);
        txtSubtotal.setBackground(new java.awt.Color(219, 219, 219));
        txtSubtotal.setText("0.00");
        txtSubtotal.setBorder(null);

        txtIva.setEditable(false);
        txtIva.setBackground(new java.awt.Color(219, 219, 219));
        txtIva.setText("0.00");
        txtIva.setBorder(null);

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(219, 219, 219));
        txtTotal.setText("0.00");
        txtTotal.setBorder(null);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pNuevaFacturaLayout = new javax.swing.GroupLayout(pNuevaFactura);
        pNuevaFactura.setLayout(pNuevaFacturaLayout);
        pNuevaFacturaLayout.setHorizontalGroup(
            pNuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNuevaFacturaLayout.createSequentialGroup()
                .addGroup(pNuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pNuevaFacturaLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pCerrarFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pNuevaFacturaLayout.createSequentialGroup()
                        .addGroup(pNuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pNuevaFacturaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(pGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pDatosFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pNuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pNuevaFacturaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pNuevaFacturaLayout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addGroup(pNuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pNuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(txtIva)
                                    .addComponent(txtTotal))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pNuevaFacturaLayout.setVerticalGroup(
            pNuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNuevaFacturaLayout.createSequentialGroup()
                .addGroup(pNuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(pCerrarFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pNuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pNuevaFacturaLayout.createSequentialGroup()
                        .addComponent(pDatosFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pNuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pNuevaFacturaLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pNuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pNuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pNuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pNuevaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pNuevaFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaAdicionarProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAdicionarProductosMousePressed
       
        if(tablaAdicionarProductos.getSelectedColumn()==3 ){
            if(tablaAdicionarProductos.getValueAt(tablaAdicionarProductos.getSelectedRow(), 1).equals("0")){
                JOptionPane.showMessageDialog(null, "Ingresa la cantidad de productos", "Error al registrar", JOptionPane.ERROR_MESSAGE);
            }else{
                int fila = tablaAdicionarProductos.getSelectedRow();
                String id = tablaAdicionarProductos.getValueAt(fila, 0).toString();
                int cantidad = Integer.parseInt(tablaAdicionarProductos.getValueAt(fila, 1).toString());
                String descripcion =tablaAdicionarProductos.getValueAt(fila, 0).toString();
                double precio = Double.parseDouble(tablaAdicionarProductos.getValueAt(fila, 2).toString());
                double total = precio*cantidad;
                
                
                DefaultTableModel modelo = (DefaultTableModel)tablaDetalleFactura.getModel();
                int seleccionar = tablaAdicionarProductos.getSelectedRow();
                Object registros [] = new String[6];
                registros[0] = id;
                registros[1] = tablaAdicionarProductos.getValueAt(fila, 1).toString();
                registros[2] = descripcion;
                registros[3] = tablaAdicionarProductos.getValueAt(fila, 2).toString();
                registros[4] = total+"";
                registros[5] = "Quitar";
                modelo.addRow(registros);
                tablaDetalleFactura.setModel(modelo);
                
                double b = Double.parseDouble(subtotal())*0.5;
                txtSubtotal.setText(subtotal());
                txtIva.setText(iva());
                txtTotal.setText(total());
                
                
                if(tablaDetalleFactura.getRowCount()>=1){
                    
                }
            }
        }
    }//GEN-LAST:event_tablaAdicionarProductosMousePressed

    private void pCerrarFacturasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCerrarFacturasMousePressed
        this.setVisible(false);
        txtContadorClientes.setText(new ClienteDAO().ContadorCliente());
        txtContadorProveedores.setText(new ProveedorDAO().ContadorProveedor());
        txtContadorProductos.setText(new ProductoDAO().ContadorProducto());
        txtContadorUsuarios.setText(new UsuarioDAO().ContadorUsuarios());
        DefaultTableModel modelo = c.adicionarProductos("SELECT DescripcionProducto, Precio FROM Productos"); 
            
        cboxClienteFactura.setSelectedIndex(0);
        cboxEstadoFactura.setSelectedIndex(0);
        cboxFormaPagoFactura.setSelectedIndex(0);
        cboxVendedorFactura.setSelectedIndex(0);
        txtIva.setText("0.00");
        txtTotal.setText("0.00");
        txtSubtotal.setText("0.00");
        tablaAdicionarProductos.setModel(modelo);
        DefaultTableModel modeloD = c.detalleFactura("");
        tablaDetalleFactura.setModel(modeloD);

    }//GEN-LAST:event_pCerrarFacturasMousePressed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void tablaAdicionarProductosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaAdicionarProductosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaAdicionarProductosKeyPressed

    private void cboxFormaPagoFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxFormaPagoFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxFormaPagoFacturaActionPerformed

    private void pGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pGuardarMouseEntered
        jGuardar.setForeground(Color.WHITE);
        pGuardar.setBackground(new Color(51,0,255));
        pGuardar.setBorder(new LineBorder(new Color(51,0,255),1,true));
    }//GEN-LAST:event_pGuardarMouseEntered

    private void pGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pGuardarMouseExited
        jGuardar.setForeground(Color.BLACK);
        pGuardar.setBackground(new Color(204,204,255));
        pGuardar.setBorder(new LineBorder(new Color(204,204,255),1,true));
    }//GEN-LAST:event_pGuardarMouseExited

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

    private void pCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCancelarMousePressed
        this.setVisible(false);
        DefaultTableModel modelo = c.adicionarProductos("SELECT DescripcionProducto, Precio FROM Productos"); 
            
        cboxClienteFactura.setSelectedIndex(0);
        cboxEstadoFactura.setSelectedIndex(0);
        cboxFormaPagoFactura.setSelectedIndex(0);
        cboxVendedorFactura.setSelectedIndex(0);
        txtIva.setText("0.00");
        txtTotal.setText("0.00");
        txtSubtotal.setText("0.00");
        tablaAdicionarProductos.setModel(modelo);
        DefaultTableModel modeloD = c.detalleFactura("");
        tablaDetalleFactura.setModel(modeloD);
    }//GEN-LAST:event_pCancelarMousePressed

    private void pGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pGuardarMousePressed
        vendedor = cboxVendedorFactura.getSelectedItem().toString();
        fecha = "";
        totalFactura = Double.parseDouble(txtTotal.getText());
        cliente = cboxClienteFactura.getSelectedItem().toString();
        estadoFactura = cboxEstadoFactura.getSelectedItem().toString();
        formaPago = cboxFormaPagoFactura.getSelectedItem().toString();
        
        if(cboxClienteFactura.getSelectedIndex()>0){
            
            if(cboxFormaPagoFactura.getSelectedIndex()>0){
                
                if(cboxVendedorFactura.getSelectedIndex()>0){
                    
                    if(cboxEstadoFactura.getSelectedIndex()>0){
                        
                        if(tablaDetalleFactura.getRowCount()>0){
                            int id_FormaPago = Integer.parseInt(new FacturaDAO().buscaridTipoPago(formaPago, "id_FormaPago"));
                            Factura agregarFactura = new Factura(vendedor, estadoFactura, totalFactura,cliente,id_FormaPago);
                            new FacturaDAO().AgregarFactura(agregarFactura);

                            int id_Factura = Integer.parseInt( new FacturaDAO().buscaridIdFactura("", "id_Factura"));


                                for (int i = 0; i <tablaDetalleFactura.getRowCount(); i++) {
                                    int cantidad = Integer.parseInt(tablaDetalleFactura.getValueAt(i, 1).toString());
                                    String descripcion = tablaDetalleFactura.getValueAt(i, 2).toString();
                                    double precioUnit = Integer.parseInt(tablaDetalleFactura.getValueAt(i, 3).toString());
                                    double precioTotal = Double.parseDouble(tablaDetalleFactura.getValueAt(i, 4).toString());
                                    int id_Producto = Integer.parseInt(new ProductoDAO().buscarIdProducto(tablaDetalleFactura.getValueAt(i, 2).toString(), "id_Producto"));

                                    DetalleFactura agregarDetalle = new DetalleFactura(id_Factura,id_Producto, cantidad, descripcion, precioUnit, precioTotal);
                                    new DetalleFacturaDAO().AgregarDetalle(agregarDetalle);

                                }
                                JOptionPane.showMessageDialog(null, "Factura exitosa", "Factura", JOptionPane.WIDTH);
                                DefaultTableModel modelo = c.adicionarProductos("SELECT DescripcionProducto, Precio FROM Productos"); 
            
                                     cboxClienteFactura.setSelectedIndex(0);
                                     cboxEstadoFactura.setSelectedIndex(0);
                                     cboxFormaPagoFactura.setSelectedIndex(0);
                                     cboxVendedorFactura.setSelectedIndex(0);
                                     txtIva.setText("0.00");
                                     txtTotal.setText("0.00");
                                     txtSubtotal.setText("0.00");
                                     tablaAdicionarProductos.setModel(modelo);
                                     DefaultTableModel modeloD = c.detalleFactura("");
                                     tablaDetalleFactura.setModel(modeloD);
                                
           
                        }else{
                            JOptionPane.showMessageDialog(null, "Debes Agregar productos", "Error al guardar", JOptionPane.ERROR_MESSAGE);
           
                        }
                        
    
                    }else{
                        JOptionPane.showMessageDialog(null, "Debes seleccionar el estado de la factura", "Error al guardar", JOptionPane.ERROR_MESSAGE);
           
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Debes seleccionar el nombre del vendedor", "Error al guardar", JOptionPane.ERROR_MESSAGE);
           
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Debes seleccionar la forma de pago", "Error al guardar", JOptionPane.ERROR_MESSAGE);
           
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debes seleccionar el cliente", "Error al guardar", JOptionPane.ERROR_MESSAGE);
           
 
        }
        
    }//GEN-LAST:event_pGuardarMousePressed

    private void pCerrarFacturasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCerrarFacturasMouseEntered
         pCerrarFacturas.setForeground(Color.WHITE);
        jCerrarFacturas.setBackground(new Color(255,0,51));
        jCerrarFacturas.setBorder(new LineBorder(new Color(255,0,51),1,true));
    }//GEN-LAST:event_pCerrarFacturasMouseEntered

    private void pCerrarFacturasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCerrarFacturasMouseExited
        pCerrarFacturas.setForeground(Color.BLACK);
        jCerrarFacturas.setBackground(new Color(220,220,220));
        jCerrarFacturas.setBorder(new LineBorder(new Color(220,220,220),1,true));
    }//GEN-LAST:event_pCerrarFacturasMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboxClienteFactura;
    private javax.swing.JComboBox<String> cboxEstadoFactura;
    private javax.swing.JComboBox<String> cboxFormaPagoFactura;
    private javax.swing.JComboBox<String> cboxVendedorFactura;
    private javax.swing.JLabel jCancelar;
    private javax.swing.JLabel jCerrarFacturas;
    private javax.swing.JLabel jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel pCancelar;
    private javax.swing.JPanel pCerrarFacturas;
    private javax.swing.JPanel pDatosFactura;
    private javax.swing.JPanel pGuardar;
    private javax.swing.JPanel pNuevaFactura;
    private javax.swing.JTable tablaAdicionarProductos;
    private javax.swing.JTable tablaDetalleFactura;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
