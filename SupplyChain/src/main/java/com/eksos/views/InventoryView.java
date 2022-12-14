/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.eksos.views;

import com.eksos.EksosMenu;
import com.eksos.controllers.FactoryController;
import com.eksos.controllers.RawMaterialController;
import com.eksos.db.MongoDS;
import com.eksos.models.RawMaterials;
import dev.morphia.Datastore;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author ljrp3
 */
public class InventoryView extends javax.swing.JFrame {
    
    RawMaterialController rawmaterial;    
    FactoryController factoryorders;
    
    public InventoryView() {
        initComponents();
        this.setLocationRelativeTo(null);
        setUIProperties();
        rawmaterial = new RawMaterialController();
        factoryorders = new FactoryController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLeft = new javax.swing.JPanel();
        JButtonViewInventory = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        Jpanelinventario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableInventory = new javax.swing.JTable();
        PanelPedido = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablePedidos = new javax.swing.JTable();
        productopedido = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableInv = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        enviar = new javax.swing.JButton();
        cantidadpedido = new javax.swing.JTextField();
        anadir = new javax.swing.JButton();
        cantidadenviar = new javax.swing.JTextField();
        codigopedido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLeft.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 20));

        JButtonViewInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/box-search.png"))); // NOI18N
        JButtonViewInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonViewInventoryActionPerformed(evt);
            }
        });
        jPanelLeft.add(JButtonViewInventory);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/convert-3d-cube.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelLeft.add(jButton1);

        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home-2.png"))); // NOI18N
        jButtonHome.setDisabledIcon(null);
        jButtonHome.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonHome.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonHome.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        jPanelLeft.add(jButtonHome);

        getContentPane().add(jPanelLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 800));

        TableInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "C??digo", "Nombre", "Cantidad Existente", "Stock", "Descripci??n"
            }
        ));
        jScrollPane1.setViewportView(TableInventory);

        javax.swing.GroupLayout JpanelinventarioLayout = new javax.swing.GroupLayout(Jpanelinventario);
        Jpanelinventario.setLayout(JpanelinventarioLayout);
        JpanelinventarioLayout.setHorizontalGroup(
            JpanelinventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelinventarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        JpanelinventarioLayout.setVerticalGroup(
            JpanelinventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelinventarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(Jpanelinventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 1120, 800));

        TablePedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TablePedidos);

        productopedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productopedidoActionPerformed(evt);
            }
        });

        TableInv.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(TableInv);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("PEDIDO");

        enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/box-tick.png"))); // NOI18N
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        cantidadpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadpedidoActionPerformed(evt);
            }
        });

        anadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/box-add.png"))); // NOI18N
        anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirActionPerformed(evt);
            }
        });

        cantidadenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadenviarActionPerformed(evt);
            }
        });

        codigopedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigopedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPedidoLayout = new javax.swing.GroupLayout(PanelPedido);
        PanelPedido.setLayout(PanelPedidoLayout);
        PanelPedidoLayout.setHorizontalGroup(
            PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPedidoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(PanelPedidoLayout.createSequentialGroup()
                .addGap(496, 496, 496)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPedidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codigopedido, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(productopedido, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cantidadpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(216, 216, 216))
        );
        PanelPedidoLayout.setVerticalGroup(
            PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPedidoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cantidadpedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productopedido, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigopedido, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cantidadenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        getContentPane().add(PanelPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 1120, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonViewInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonViewInventoryActionPerformed
        
        PanelPedido.setVisible(false);
        Jpanelinventario.setVisible(true);
        TableInventory.setModel(rawmaterial.seeRawMaterialsInventory());
        TableInventory.setAutoCreateRowSorter(true);
        

    }//GEN-LAST:event_JButtonViewInventoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Jpanelinventario.setVisible(false);
        PanelPedido.setVisible(true);
        TableInv.setModel(rawmaterial.seeRawMaterialsInventory());
        TableInv.setAutoCreateRowSorter(true);
        TablePedidos.setModel(factoryorders.getOrders());
        TablePedidos.setAutoCreateRowSorter(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void productopedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productopedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productopedidoActionPerformed

    private void cantidadpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadpedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadpedidoActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviarActionPerformed

    private void anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirActionPerformed
        int filaseleccionada;
        String nombrep;
        try {
            //Guardamos en un entero la fila seleccionada.
            filaseleccionada = TablePedidos.getSelectedRow();
            if (filaseleccionada == -1) {
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila.");
            } else {

                //String ayuda = tabla.getValueAt(filaseleccionada, num_columna).toString()); 
//                String codigo = (String)TablePedidos.getValueAt(filaseleccionada, 0);
                String nombre = (String) TablePedidos.getValueAt(filaseleccionada, 0);
                String descripcion = (String) TablePedidos.getValueAt(filaseleccionada, 1);
                String inventariot = (String) TablePedidos.getValueAt(filaseleccionada, 2);
//                String stock = (String)TableInv.getValueAt(filaseleccionada, 3);
                
                cantidadpedido.setText(inventariot);
                cantidadpedido.setEnabled(false);
                productopedido.setText(nombre);
                productopedido.setEditable(false);
                
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInt??ntelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_anadirActionPerformed

    private void cantidadenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadenviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadenviarActionPerformed

    private void codigopedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigopedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigopedidoActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        dispose();
        EksosMenu menu = new EksosMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButtonHomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonViewInventory;
    private javax.swing.JPanel Jpanelinventario;
    private javax.swing.JPanel PanelPedido;
    private javax.swing.JTable TableInv;
    private javax.swing.JTable TableInventory;
    private javax.swing.JTable TablePedidos;
    private javax.swing.JButton anadir;
    private javax.swing.JTextField cantidadenviar;
    private javax.swing.JTextField cantidadpedido;
    private javax.swing.JTextField codigopedido;
    private javax.swing.JButton enviar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelLeft;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField productopedido;
    // End of variables declaration//GEN-END:variables

    private void setUIProperties() {
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        UIManager.put("ToolTip.background", new Color(0xF8FAFF));
        UIManager.put("ToolTip.foreground", new Color(0x56595F));
        JButtonViewInventory.setToolTipText("Ver Inventario");
        UIManager.put("ToolTip.font", new Font("Arial", Font.PLAIN, 14));
        Jpanelinventario.setBackground(Color.WHITE);
        Jpanelinventario.setVisible(false);
        PanelPedido.setBackground(Color.WHITE);
        PanelPedido.setVisible(false);
    }
    
}
