/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_sistema_facturación;

import Controlador.DetalleFacturaDAO;
import Controlador.FacturaDAO;
import Controlador.ProductoDAO;
import Modelo.DetalleFactura;
import Modelo.Factura;
import Modelo.ValidarDatos;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import static proyecto_sistema_facturación.Administrar_Facturas.tablaAdministrarFacturas;
import static proyecto_sistema_facturación.Clientes.tablaClientes;

/**
 *
 * @author tmx
 */
public class EditarFactura extends javax.swing.JFrame {

    String fecha;
    String cliente;
    String vendedor;
    String estadoFactura;
    String formaPago;
    double totalFactura;
    
    Conexion_BD.Conexion c = new Conexion_BD.Conexion();
    ValidarDatos validarDatos = new ValidarDatos();
    
    
    public EditarFactura() {
        initComponents();
         txtBuscarProducto.setText("Descripción");
            DefaultTableModel modelo = c.adicionarProductos("SELECT DescripcionProducto, Precio FROM Productos"); 
            tablaAdicionarProductosEditar.setModel(modelo);
        
            
            System.out.println(txtIdFactura.getText());
            
        c.llenarComboBox(cboxEditarClienteFactura, "NombreCliente", "Cliente","SELECT NombreCliente FROM Clientes ORDER BY NombreCliente ASC");
        c.llenarComboBox(cboxEditarFormaPagoFactura, "Descripcion", "Forma de pago","SELECT Descripcion FROM Forma_Pago ORDER BY Descripcion ASC");
        c.llenarComboBox(cboxEditarVendedorFactura, "Usuario", "Vendedor","SELECT Usuario FROM RegistroDeUsuarios ORDER BY Usuario ASC");
   
        
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        pGuardarCambios = new javax.swing.JPanel();
        jGuardarCambios = new javax.swing.JLabel();
        pCancelar = new javax.swing.JPanel();
        jCancelar = new javax.swing.JLabel();
        pDatosFactura = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        cboxEditarFormaPagoFactura = new javax.swing.JComboBox<>();
        cboxEditarVendedorFactura = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarProducto = new javax.swing.JTextField();
        cboxEditarClienteFactura = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAdicionarProductosEditar = new javax.swing.JTable();
        cboxEditarEstadoFactura = new javax.swing.JComboBox<>();
        pBuscarCliente = new javax.swing.JPanel();
        jBuscarCliente = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDetalleFacturaEditar = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtEditarSubtotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEditarIva = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEditarTotal = new javax.swing.JTextField();
        txtIdFactura = new javax.swing.JTextField();
        pCerrar = new javax.swing.JPanel();
        jCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Editar Factura");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel35)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel35)
                .addGap(0, 1, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pGuardarCambiosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jGuardarCambios)
                .addContainerGap())
        );
        pGuardarCambiosLayout.setVerticalGroup(
            pGuardarCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pGuardarCambiosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jGuardarCambios)
                .addContainerGap())
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
            .addGroup(pCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pDatosFactura.setBackground(new java.awt.Color(255, 255, 255));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(102, 102, 255));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Datos Factura");

        cboxEditarFormaPagoFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxEditarFormaPagoFacturaActionPerformed(evt);
            }
        });

        cboxEditarVendedorFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxEditarVendedorFacturaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Adicionar Productos");

        txtBuscarProducto.setToolTipText("Buscar productos");
        txtBuscarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarProductoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBuscarProductoMouseReleased(evt);
            }
        });
        txtBuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarProductoKeyReleased(evt);
            }
        });

        tablaAdicionarProductosEditar.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaAdicionarProductosEditar.setEditingColumn(1);
        tablaAdicionarProductosEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaAdicionarProductosEditarMousePressed(evt);
            }
        });
        tablaAdicionarProductosEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaAdicionarProductosEditarKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAdicionarProductosEditar);

        cboxEditarEstadoFactura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Pagado", "Por pagar" }));

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
            .addGroup(pBuscarClienteLayout.createSequentialGroup()
                .addComponent(jBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        pBuscarClienteLayout.setVerticalGroup(
            pBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBuscarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pDatosFacturaLayout = new javax.swing.GroupLayout(pDatosFactura);
        pDatosFactura.setLayout(pDatosFacturaLayout);
        pDatosFacturaLayout.setHorizontalGroup(
            pDatosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2)
            .addGroup(pDatosFacturaLayout.createSequentialGroup()
                .addGroup(pDatosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pDatosFacturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cboxEditarClienteFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxEditarFormaPagoFactura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pDatosFacturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cboxEditarVendedorFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxEditarEstadoFactura, 0, 105, Short.MAX_VALUE))
                    .addGroup(pDatosFacturaLayout.createSequentialGroup()
                        .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatosFacturaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pDatosFacturaLayout.setVerticalGroup(
            pDatosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosFacturaLayout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxEditarFormaPagoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxEditarClienteFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDatosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxEditarVendedorFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxEditarEstadoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(102, 102, 255));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("Detalles Factura");

        tablaDetalleFacturaEditar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cantidad", "Descripción", "Precio Unit.", "Precio Total"
            }
        ));
        tablaDetalleFacturaEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaDetalleFacturaEditarMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaDetalleFacturaEditar);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField4)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel3.setText("SUBTOTAL $");

        txtEditarSubtotal.setEditable(false);
        txtEditarSubtotal.setBackground(new java.awt.Color(219, 219, 219));
        txtEditarSubtotal.setText("0.00");
        txtEditarSubtotal.setBorder(null);

        jLabel2.setText("IVA $");

        txtEditarIva.setEditable(false);
        txtEditarIva.setBackground(new java.awt.Color(219, 219, 219));
        txtEditarIva.setText("0.00");
        txtEditarIva.setBorder(null);

        jLabel5.setText("TOTAL $");

        txtEditarTotal.setEditable(false);
        txtEditarTotal.setBackground(new java.awt.Color(219, 219, 219));
        txtEditarTotal.setText("0.00");
        txtEditarTotal.setBorder(null);
        txtEditarTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditarTotalActionPerformed(evt);
            }
        });

        txtIdFactura.setEditable(false);
        txtIdFactura.setBorder(null);

        pCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pCerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pCerrarMousePressed(evt);
            }
        });

        jCerrar.setText("X");

        javax.swing.GroupLayout pCerrarLayout = new javax.swing.GroupLayout(pCerrar);
        pCerrar.setLayout(pCerrarLayout);
        pCerrarLayout.setHorizontalGroup(
            pCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCerrarLayout.setVerticalGroup(
            pCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCerrar)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEditarSubtotal)
                    .addComponent(txtEditarIva)
                    .addComponent(txtEditarTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(pDatosFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pDatosFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEditarSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEditarIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEditarTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxEditarFormaPagoFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxEditarFormaPagoFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxEditarFormaPagoFacturaActionPerformed

    private void tablaAdicionarProductosEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAdicionarProductosEditarMousePressed

        if(tablaAdicionarProductosEditar.getSelectedColumn()==3 ){
            if(tablaAdicionarProductosEditar.getValueAt(tablaAdicionarProductosEditar.getSelectedRow(), 1).equals("0")){
                JOptionPane.showMessageDialog(null, "Ingresa la cantidad de productos", "Error al registrar", JOptionPane.ERROR_MESSAGE);
            }else{
                System.out.println(new ProductoDAO().stockNoCero(tablaAdicionarProductosEditar.getValueAt(tablaAdicionarProductosEditar.getSelectedRow(), 0).toString()));
                if(new ProductoDAO().stockNoCero(tablaAdicionarProductosEditar.getValueAt(tablaAdicionarProductosEditar.getSelectedRow(), 0).toString())==true){
                    
                
                int fila = tablaAdicionarProductosEditar.getSelectedRow();
                String id = tablaAdicionarProductosEditar.getValueAt(fila, 0).toString();
                int cantidad = Integer.parseInt(tablaAdicionarProductosEditar.getValueAt(fila, 1).toString());
                String descripcion =tablaAdicionarProductosEditar.getValueAt(fila, 0).toString();
                double precio = Double.parseDouble(tablaAdicionarProductosEditar.getValueAt(fila, 2).toString());
                double total = precio*cantidad;

                DefaultTableModel modelo1 = (DefaultTableModel)tablaDetalleFacturaEditar.getModel();
                int seleccionar = tablaAdicionarProductosEditar.getSelectedRow();
                Object registros [] = new String[6];
                registros[0] = id;
                registros[1] = tablaAdicionarProductosEditar.getValueAt(fila, 1).toString();
                registros[2] = descripcion;
                registros[3] = tablaAdicionarProductosEditar.getValueAt(fila, 2).toString();
                registros[4] = total+"";
                registros[5] = "Quitar";
                
                modelo1.addRow(registros);
                tablaDetalleFacturaEditar.setModel(modelo1);

                double b = Double.parseDouble(subtotal())*0.5;
                txtEditarSubtotal.setText(subtotal());
                txtEditarIva.setText(iva());
                txtEditarTotal.setText(total());

                }else{
                    JOptionPane.showMessageDialog(null, "Producto sin existencias", "Error ", JOptionPane.ERROR_MESSAGE);
           
                }
            }
        }
    }//GEN-LAST:event_tablaAdicionarProductosEditarMousePressed

    private void tablaAdicionarProductosEditarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaAdicionarProductosEditarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaAdicionarProductosEditarKeyPressed

    private void cboxEditarVendedorFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxEditarVendedorFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxEditarVendedorFacturaActionPerformed

    private void txtEditarTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditarTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditarTotalActionPerformed

    private void pGuardarCambiosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pGuardarCambiosMousePressed
        vendedor = cboxEditarVendedorFactura.getSelectedItem().toString();
        fecha = "";
        totalFactura = Double.parseDouble(txtEditarTotal.getText());
        cliente = cboxEditarClienteFactura.getSelectedItem().toString();
        estadoFactura = cboxEditarEstadoFactura.getSelectedItem().toString();
        formaPago = cboxEditarFormaPagoFactura.getSelectedItem().toString();
        
        if(cboxEditarClienteFactura.getSelectedIndex()>0){
            
            if(cboxEditarFormaPagoFactura.getSelectedIndex()>0){
                
                if(cboxEditarVendedorFactura.getSelectedIndex()>0){
                    
                    if(cboxEditarEstadoFactura.getSelectedIndex()>0){
                        
                        if(tablaDetalleFacturaEditar.getRowCount()>0){
                            int id_FormaPago = Integer.parseInt(new FacturaDAO().buscaridTipoPago(formaPago, "id_FormaPago"));
                            Factura agregarFactura = new Factura(vendedor, estadoFactura, totalFactura,cliente,id_FormaPago);
                            new FacturaDAO().AgregarFactura(agregarFactura);

                            int id_Factura = Integer.parseInt(txtIdFactura.getText().toString());

                            new DetalleFacturaDAO().eliminar(txtIdFactura.getText());
                                for (int i = 0; i <tablaDetalleFacturaEditar.getRowCount(); i++) {
                                    int cantidad = Integer.parseInt(tablaDetalleFacturaEditar.getValueAt(i, 1).toString());
                                    String descripcion = tablaDetalleFacturaEditar.getValueAt(i, 2).toString();
                                    double precioUnit = Integer.parseInt(tablaDetalleFacturaEditar.getValueAt(i, 3).toString());
                                    double precioTotal = Double.parseDouble(tablaDetalleFacturaEditar.getValueAt(i, 4).toString());
                                    int id_Producto = Integer.parseInt(new ProductoDAO().buscarIdProducto(tablaDetalleFacturaEditar.getValueAt(i, 2).toString(), "id_Producto"));

                                    DetalleFactura agregarDetalle = new DetalleFactura(id_Factura,id_Producto, cantidad, descripcion, precioUnit, precioTotal);
                                    new DetalleFacturaDAO().AgregarDetalle(agregarDetalle);

                                }
                                JOptionPane.showMessageDialog(null, "Factura exitosa", "Factura", JOptionPane.WIDTH);
                                DefaultTableModel modeloF = c.administrarFacturas("SELECT * FROM Facturas"); 
                                tablaAdministrarFacturas.setModel(modeloF);
                                this.setVisible(false);
                                     
                                
           
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
        
                  
    }//GEN-LAST:event_pGuardarCambiosMousePressed

    private void tablaDetalleFacturaEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDetalleFacturaEditarMousePressed
        
        if(tablaDetalleFacturaEditar.getSelectedColumn()==5){
            DefaultTableModel modeloQuitar = (DefaultTableModel) tablaDetalleFacturaEditar.getModel();
            modeloQuitar.removeRow(tablaDetalleFacturaEditar.getSelectedRow());
           
            
        }
    }//GEN-LAST:event_tablaDetalleFacturaEditarMousePressed

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

    private void pCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCancelarMousePressed
        this.setVisible(false);
    }//GEN-LAST:event_pCancelarMousePressed

    private void pCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCerrarMouseEntered
        jCerrar.setForeground(Color.WHITE);
        pCerrar.setBackground(new Color(255,0,51));
        pCerrar.setBorder(new LineBorder(new Color(255,0,51),1,true));
    }//GEN-LAST:event_pCerrarMouseEntered

    private void pCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCerrarMouseExited
        jCerrar.setForeground(Color.BLACK);
        pCerrar.setBackground(new Color(220,220,220));
        pCerrar.setBorder(new LineBorder(new Color(220,220,220),1,true));
    }//GEN-LAST:event_pCerrarMouseExited

    private void pCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCerrarMousePressed
        this.setVisible(false);
        txtBuscarProducto.setText("Descripción");
    }//GEN-LAST:event_pCerrarMousePressed

    private void txtBuscarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductoKeyReleased
        DefaultTableModel modelo = c.adicionarProductos("SELECT DescripcionProducto, Precio FROM Productos WHERE DescripcionProducto LIKE '%" + txtBuscarProducto.getText()+"%'"); 
        tablaAdicionarProductosEditar.setModel(modelo);
    }//GEN-LAST:event_txtBuscarProductoKeyReleased

    private void txtBuscarProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarProductoMousePressed
         txtBuscarProducto.setText("");
    }//GEN-LAST:event_txtBuscarProductoMousePressed

    private void pBuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pBuscarClienteMouseEntered

    }//GEN-LAST:event_pBuscarClienteMouseEntered

    private void pBuscarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pBuscarClienteMouseExited

    }//GEN-LAST:event_pBuscarClienteMouseExited

    private void txtBuscarProductoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarProductoMouseReleased
        validarDatos.validarSoloLetras(txtBuscarProducto);
    }//GEN-LAST:event_txtBuscarProductoMouseReleased

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
            java.util.logging.Logger.getLogger(EditarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cboxEditarClienteFactura;
    public static javax.swing.JComboBox<String> cboxEditarEstadoFactura;
    public static javax.swing.JComboBox<String> cboxEditarFormaPagoFactura;
    public static javax.swing.JComboBox<String> cboxEditarVendedorFactura;
    private javax.swing.JLabel jBuscarCliente;
    private javax.swing.JLabel jCancelar;
    private javax.swing.JLabel jCerrar;
    private javax.swing.JLabel jGuardarCambios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel pBuscarCliente;
    private javax.swing.JPanel pCancelar;
    private javax.swing.JPanel pCerrar;
    private javax.swing.JPanel pDatosFactura;
    private javax.swing.JPanel pGuardarCambios;
    public static javax.swing.JTable tablaAdicionarProductosEditar;
    public static javax.swing.JTable tablaDetalleFacturaEditar;
    private javax.swing.JTextField txtBuscarProducto;
    public static javax.swing.JTextField txtEditarIva;
    public static javax.swing.JTextField txtEditarSubtotal;
    public static javax.swing.JTextField txtEditarTotal;
    public static javax.swing.JTextField txtIdFactura;
    // End of variables declaration//GEN-END:variables
}
