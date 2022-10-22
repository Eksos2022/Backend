package com.eksos.views;

import com.eksos.EksosMenu;
import com.eksos.controllers.ProductController;
import com.eksos.controllers.StoreController;
import com.eksos.models.Ingredient;
import com.eksos.models.Product;
import com.eksos.models.Store;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Allecan
 */
public class ProductsView extends javax.swing.JFrame {

    private final ProductController productController = new ProductController();
    private final StoreController storeController = new StoreController();

    /**
     * Creates new form ProductsView
     */
    public ProductsView() {
        initComponents();
        this.setTitle("Producto");
        this.setLocationRelativeTo(null);
        setUIProperties();
        initalComponentsState();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        jPanelLeft = new javax.swing.JPanel();
        jButtonNewProduct = new javax.swing.JButton();
        jButtonProducts = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        jLayeredPane = new javax.swing.JLayeredPane();
        jPanelNewProduct = new javax.swing.JPanel();
        jTextFieldProductName = new javax.swing.JTextField();
        Title = new javax.swing.JLabel();
        jLabelSKU = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldAmount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxType = new javax.swing.JComboBox<>();
        jButtonCancel = new javax.swing.JButton();
        jButtonSaveProduct = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxIngredients = new javax.swing.JComboBox<>();
        jTextFieldSKU = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButtonStoreProduct = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProducts = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldBatch = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldDeliveryTime = new javax.swing.JTextField();
        jPanelProducts = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLeft.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 20));

        jButtonNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/product-newproduct.png"))); // NOI18N
        jButtonNewProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNewProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNewProduct.setMaximumSize(new java.awt.Dimension(48, 48));
        jButtonNewProduct.setMinimumSize(new java.awt.Dimension(48, 48));
        jButtonNewProduct.setPreferredSize(new java.awt.Dimension(48, 48));
        jButtonNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewProductActionPerformed(evt);
            }
        });
        jPanelLeft.add(jButtonNewProduct);

        jButtonProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/product-getproducts.png"))); // NOI18N
        jButtonProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonProducts.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonProducts.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonProducts.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonProducts.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductsActionPerformed(evt);
            }
        });
        jPanelLeft.add(jButtonProducts);

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

        jPanelNewProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelNewProductMouseClicked(evt);
            }
        });
        jPanelNewProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldProductName.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPanelNewProduct.add(jTextFieldProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 400, 40));

        Title.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        Title.setText("Nuevo Producto");
        jPanelNewProduct.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabelSKU.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabelSKU.setText("PF-");
        jPanelNewProduct.add(jLabelSKU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 30, 40));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel8.setText("Ingredientes");
        jPanelNewProduct.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 200, 32));

        jTextFieldAmount.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPanelNewProduct.add(jTextFieldAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 180, 40));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel9.setText("Tipo de producto");
        jPanelNewProduct.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 180, 32));

        jComboBoxType.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jComboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Producto Final", "Sub Producto" }));
        jPanelNewProduct.add(jComboBoxType, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 180, 40));

        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        jButtonCancel.setBorderPainted(false);
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanelNewProduct.add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 48, 48));

        jButtonSaveProduct.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonSaveProduct.setText("Guardar");
        jButtonSaveProduct.setBorderPainted(false);
        jButtonSaveProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSaveProduct.setIconTextGap(16);
        jButtonSaveProduct.setMargin(new java.awt.Insets(4, 8, 4, 8));
        jButtonSaveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveProductActionPerformed(evt);
            }
        });
        jPanelNewProduct.add(jButtonSaveProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 140, 48));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel10.setText("Lote (Unidades)");
        jPanelNewProduct.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 130, 32));

        jComboBoxIngredients.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jComboBoxIngredients.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Ingrediente" }));
        jPanelNewProduct.add(jComboBoxIngredients, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 400, 40));

        jTextFieldSKU.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPanelNewProduct.add(jTextFieldSKU, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 95, 40));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel12.setText("SKU");
        jPanelNewProduct.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, 32));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel13.setText("Cantidad");
        jPanelNewProduct.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 160, 32));

        jButtonStoreProduct.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jButtonStoreProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow-right.png"))); // NOI18N
        jButtonStoreProduct.setText("Agregar");
        jButtonStoreProduct.setBorderPainted(false);
        jButtonStoreProduct.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButtonStoreProduct.setIconTextGap(5);
        jButtonStoreProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStoreProductActionPerformed(evt);
            }
        });
        jPanelNewProduct.add(jButtonStoreProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 130, 40));

        jTableProducts.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jTableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SKU", "Nombre", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableProducts.setShowGrid(false);
        jTableProducts.setShowHorizontalLines(true);
        jTableProducts.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableProducts);

        jPanelNewProduct.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 1040, 310));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel14.setText("Nombre del producto");
        jPanelNewProduct.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 200, 32));

        jTextFieldBatch.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPanelNewProduct.add(jTextFieldBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 120, 40));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel15.setText("TS (Semanas)");
        jPanelNewProduct.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 120, 32));

        jTextFieldDeliveryTime.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPanelNewProduct.add(jTextFieldDeliveryTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 120, 40));

        jLayeredPane.add(jPanelNewProduct);
        jPanelNewProduct.setBounds(0, 0, 1120, 800);

        jPanelProducts.setFocusCycleRoot(true);
        jPanelProducts.setFocusTraversalPolicyProvider(true);
        jPanelProducts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel11.setText("Resumen de MRP");
        jPanelProducts.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLayeredPane.add(jPanelProducts);
        jPanelProducts.setBounds(0, 0, 1120, 800);

        getContentPane().add(jLayeredPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 1120, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewProductActionPerformed
        resetComponentsState();
        jPanelNewProduct.setVisible(true);
        jPanelProducts.setVisible(false);
    }//GEN-LAST:event_jButtonNewProductActionPerformed

    private void jButtonProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductsActionPerformed
        resetComponentsState();
        jPanelProducts.setVisible(true);
        jPanelNewProduct.setVisible(false);
    }//GEN-LAST:event_jButtonProductsActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        dispose();
        EksosMenu menu = new EksosMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        resetComponentsState();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSaveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveProductActionPerformed
        Product product = new Product();
        product.setSKU(jLabelSKU.getText() + jTextFieldSKU.getText());
        product.setName(jTextFieldProductName.getText());
        int DT = Integer.valueOf(jTextFieldDeliveryTime.getText());
        int batch = Integer.valueOf(jTextFieldBatch.getText());

        List<Ingredient> ingredients = new ArrayList<>();
        DefaultTableModel tableModel = (DefaultTableModel) jTableProducts.getModel();
        if (tableModel.getRowCount() != 0) {
            for (int row = 0; row < tableModel.getRowCount(); row++) {
                Ingredient ingredient = new Ingredient();
                ingredient.setStoreProduct(storeController
                        .getStoreProductBySKU(tableModel.getValueAt(row, 0).toString()));
                ingredient.setAmount(Integer.valueOf(tableModel.getValueAt(row, 2).toString()));
                ingredients.add(ingredient);
            }
            product.setIngredients(ingredients);
        }

        if (productController.createProduct(product, DT, batch)) {
            System.out.println("Si se ingreso");
        } else {
            System.out.println("No se ingreso");
        }
        resetComponentsState();
    }//GEN-LAST:event_jButtonSaveProductActionPerformed

    private void jButtonStoreProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStoreProductActionPerformed
        Object item = jComboBoxIngredients.getSelectedItem();
        String SKU = ((ComboItem) item).getKey();
        String name = ((ComboItem) item).getValue();
        String data[] = {SKU, name, jTextFieldAmount.getText()};
        DefaultTableModel tableModel = (DefaultTableModel) jTableProducts.getModel();
        tableModel.addRow(data);
        jTextFieldAmount.setText("");
    }//GEN-LAST:event_jButtonStoreProductActionPerformed

    private void jPanelNewProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelNewProductMouseClicked
        jPanelNewProduct.requestFocus();
    }//GEN-LAST:event_jPanelNewProductMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonNewProduct;
    private javax.swing.JButton jButtonProducts;
    private javax.swing.JButton jButtonSaveProduct;
    private javax.swing.JButton jButtonStoreProduct;
    private javax.swing.JComboBox<String> jComboBoxIngredients;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSKU;
    private javax.swing.JLayeredPane jLayeredPane;
    private javax.swing.JPanel jPanelLeft;
    private javax.swing.JPanel jPanelNewProduct;
    private javax.swing.JPanel jPanelProducts;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProducts;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldBatch;
    private javax.swing.JTextField jTextFieldDeliveryTime;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextFieldSKU;
    // End of variables declaration//GEN-END:variables

    private void initalComponentsState() {
        jPanelNewProduct.setVisible(false);
        jPanelProducts.setVisible(false);
        jComboBoxType.addItemListener(new TypeChangeListener());
    }

    private void resetComponentsState() {
        jTextFieldAmount.setText("");
        jTextFieldBatch.setText("");
        jTextFieldDeliveryTime.setText("");
        jTextFieldProductName.setText("");
        jTextFieldSKU.setText("");
        jLabelSKU.setText("PF-");
        jComboBoxIngredients.setSelectedIndex(0);
        jComboBoxType.setSelectedIndex(0);
        DefaultTableModel tableModelProducts = (DefaultTableModel) jTableProducts.getModel();
        tableModelProducts.setRowCount(0);
        jComboBoxIngredients.removeAllItems();
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        for (Store storeProduct : storeController.getAllStoreProducts()) {
            comboModel.addElement(new ComboItem(storeProduct.getSKU(),
                    storeProduct.getName()));
        }
        jComboBoxIngredients.setModel(comboModel);
    }

    private void setUIProperties() {
        this.getContentPane().setBackground(Color.WHITE);
        jPanelNewProduct.setBackground(Color.WHITE);
        jPanelProducts.setBackground(Color.WHITE);
        jButtonSaveProduct.setBackground(new Color(0x0C31A6));
        jButtonSaveProduct.setForeground(Color.WHITE);
        UIManager.put("ToolTip.background", new Color(0xF8FAFF));
        UIManager.put("ToolTip.foreground", new Color(0x56595F));
        UIManager.put("ToolTip.font", new Font("Arial", Font.PLAIN, 14));
        jButtonNewProduct.setToolTipText("Nuevo Producto");
        jButtonProducts.setToolTipText("Ver productos");
        jButtonHome.setToolTipText("Regresar al menu");
        jTableProducts.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 18));
                createMenuHabilitar(jPopupMenu);
        jTableProducts.setComponentPopupMenu(jPopupMenu);
    }
    
            private void createMenuHabilitar(JPopupMenu jPopupMenu) {
        JMenuItem disable = new JMenuItem("Eliminar Ingrediente");
        disable.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object[] botones = {"Aceptar", "Cancelar"};
                int opcionElegida = JOptionPane.showOptionDialog(null, "Desea elminiar este ingrediente?", "Alerta",
                        JOptionPane.YES_NO_CANCEL_OPTION, 2, null, botones, null);
                if (opcionElegida == 0) {
                    DefaultTableModel tblModel = (DefaultTableModel) jTableProducts.getModel();

if(jTableProducts.getSelectedRowCount() == 1){

    tblModel.removeRow(jTableProducts.getSelectedRow());
    
    
}else{
    if(jTableProducts.getRowCount()==0){
        System.out.println("Seleccione una opcion válida");
    }
}
                } else {
                    System.out.println("Cancela cancelItem");
                }
            }
        });
        jPopupMenu.add(disable);
    }
            
            private void DeleteSelectedItem (){
                
DefaultTableModel tblModel = (DefaultTableModel) jTableProducts.getModel();

if(jTableProducts.getSelectedRowCount() == 1){

    tblModel.removeRow(jTableProducts.getSelectedRow());
    
    
}else{
    if(jTableProducts.getRowCount()==0){
        System.out.println("Seleccione una opcion válida");
    }
}
}

    private class TypeChangeListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent event) {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                Object item = event.getItem();
                if (item.toString().equals("Producto Final")) {
                    jLabelSKU.setText("PF-");
                } else if (item.toString().equals("Sub Producto")) {
                    jLabelSKU.setText("SP-");
                } else {
                    jLabelSKU.setText("");
                }
            }
        }
    }

    private class ComboItem {

        private String key;
        private String value;

        public ComboItem(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
}
