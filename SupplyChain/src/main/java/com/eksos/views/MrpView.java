/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.eksos.views;

import com.eksos.EksosMenu;
import com.eksos.controllers.ProductController;
import com.eksos.models.Product;
import com.eksos.models.Store;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author Allecan
 */
public class MrpView extends javax.swing.JFrame {

    /**
     * Creates new form MrpView
     */
    private List<JLabel> jLabelsList = new ArrayList<>();
    private List<JTextField> jTextFieldsList = new ArrayList<>();
    private final ProductController productController = new ProductController();

    public MrpView() {
        initComponents();
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

        jPanelLeft = new javax.swing.JPanel();
        jButtonMrpPlanning = new javax.swing.JButton();
        jButtonMrpSummary = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        jLayeredPane = new javax.swing.JLayeredPane();
        jPanelMrpPlanning = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabelWeek1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldWeek1 = new javax.swing.JTextField();
        jTextFieldWeek2 = new javax.swing.JTextField();
        jLabelWeek2 = new javax.swing.JLabel();
        jLabelWeek3 = new javax.swing.JLabel();
        jTextFieldWeek3 = new javax.swing.JTextField();
        jLabelWeek4 = new javax.swing.JLabel();
        jTextFieldWeek4 = new javax.swing.JTextField();
        jLabelWeek5 = new javax.swing.JLabel();
        jTextFieldWeek5 = new javax.swing.JTextField();
        jLabelWeek6 = new javax.swing.JLabel();
        jTextFieldWeek6 = new javax.swing.JTextField();
        jComboBoxWeeksPlan = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxProducts = new javax.swing.JComboBox<>();
        jButtonCancel = new javax.swing.JButton();
        jButtonCreateMRP = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jDateChooserStartDate = new com.toedter.calendar.JDateChooser();
        jPanelMrpSummary = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLeft.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 20));

        jButtonMrpPlanning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mrp-planning.png"))); // NOI18N
        jButtonMrpPlanning.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMrpPlanning.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMrpPlanning.setMaximumSize(new java.awt.Dimension(48, 48));
        jButtonMrpPlanning.setMinimumSize(new java.awt.Dimension(48, 48));
        jButtonMrpPlanning.setPreferredSize(new java.awt.Dimension(48, 48));
        jButtonMrpPlanning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMrpPlanningActionPerformed(evt);
            }
        });
        jPanelLeft.add(jButtonMrpPlanning);

        jButtonMrpSummary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mrp-summary.png"))); // NOI18N
        jButtonMrpSummary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMrpSummary.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMrpSummary.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonMrpSummary.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonMrpSummary.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonMrpSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMrpSummaryActionPerformed(evt);
            }
        });
        jPanelLeft.add(jButtonMrpSummary);

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

        jPanelMrpPlanning.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMrpPlanningMouseClicked(evt);
            }
        });
        jPanelMrpPlanning.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel5.setText("Planeación de MRP");
        jLabel5.setToolTipText("");
        jPanelMrpPlanning.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 50));

        jLabelWeek1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabelWeek1.setText("Demanda semana 1");
        jPanelMrpPlanning.add(jLabelWeek1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, 32));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel7.setText("Fecha Inicial");
        jPanelMrpPlanning.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 160, 32));

        jTextFieldWeek1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPanelMrpPlanning.add(jTextFieldWeek1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 200, 40));

        jTextFieldWeek2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPanelMrpPlanning.add(jTextFieldWeek2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 200, 40));

        jLabelWeek2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabelWeek2.setText("Demanda semana 2");
        jPanelMrpPlanning.add(jLabelWeek2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 160, 32));

        jLabelWeek3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabelWeek3.setText("Demanda semana 3");
        jPanelMrpPlanning.add(jLabelWeek3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 160, 32));

        jTextFieldWeek3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPanelMrpPlanning.add(jTextFieldWeek3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 200, 40));

        jLabelWeek4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabelWeek4.setText("Demanda semana 4");
        jPanelMrpPlanning.add(jLabelWeek4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 160, 32));

        jTextFieldWeek4.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPanelMrpPlanning.add(jTextFieldWeek4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 200, 40));

        jLabelWeek5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabelWeek5.setText("Demanda semana 5");
        jPanelMrpPlanning.add(jLabelWeek5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 160, 32));

        jTextFieldWeek5.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPanelMrpPlanning.add(jTextFieldWeek5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 200, 40));

        jLabelWeek6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabelWeek6.setText("Demanda semana 6");
        jPanelMrpPlanning.add(jLabelWeek6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 160, 32));

        jTextFieldWeek6.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPanelMrpPlanning.add(jTextFieldWeek6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 200, 40));

        jComboBoxWeeksPlan.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jComboBoxWeeksPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 semana", "2 semanas", "3 semanas", "4 semanas", "5 semanas", "6 semanas" }));
        jPanelMrpPlanning.add(jComboBoxWeeksPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, 40));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel8.setText("Semanas a planear");
        jPanelMrpPlanning.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 160, 32));

        jComboBoxProducts.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPanelMrpPlanning.add(jComboBoxProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 270, 40));

        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        jButtonCancel.setBorderPainted(false);
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanelMrpPlanning.add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 48, 48));

        jButtonCreateMRP.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButtonCreateMRP.setText("Crear MRP");
        jButtonCreateMRP.setBorderPainted(false);
        jButtonCreateMRP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCreateMRP.setIconTextGap(16);
        jButtonCreateMRP.setMargin(new java.awt.Insets(4, 8, 4, 8));
        jButtonCreateMRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateMRPActionPerformed(evt);
            }
        });
        jPanelMrpPlanning.add(jButtonCreateMRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 140, 48));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel9.setText("Producto a planear");
        jPanelMrpPlanning.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 160, 32));

        jDateChooserStartDate.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPanelMrpPlanning.add(jDateChooserStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 200, 40));

        jLayeredPane.add(jPanelMrpPlanning);
        jPanelMrpPlanning.setBounds(0, 0, 1120, 800);

        jPanelMrpSummary.setFocusCycleRoot(true);
        jPanelMrpSummary.setFocusTraversalPolicyProvider(true);
        jPanelMrpSummary.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel11.setText("Resumen de MRP");
        jPanelMrpSummary.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLayeredPane.add(jPanelMrpSummary);
        jPanelMrpSummary.setBounds(0, 0, 1120, 800);

        getContentPane().add(jLayeredPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 1120, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMrpPlanningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMrpPlanningActionPerformed
        resetComponentsState();
        jPanelMrpPlanning.setVisible(true);
    }//GEN-LAST:event_jButtonMrpPlanningActionPerformed

    private void jButtonMrpSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMrpSummaryActionPerformed
        resetComponentsState();
        jPanelMrpSummary.setVisible(true);
    }//GEN-LAST:event_jButtonMrpSummaryActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        dispose();
        EksosMenu menu = new EksosMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        resetComponentsState();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonCreateMRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateMRPActionPerformed
        resetComponentsState();
        DateFormat defaultLocalFormat = DateFormat.getDateInstance();
        String startDate = defaultLocalFormat.format(jDateChooserStartDate.getDate());
        Calendar cal = Calendar.getInstance();
        cal.setTime(jDateChooserStartDate.getDate());
        int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
        System.out.println(jDateChooserStartDate.getDate());
        System.out.println(startDate);
        System.out.println(weekOfYear);
        Object item = jComboBoxProducts.getSelectedItem();
        String SKU = ((ComboItem) item).getKey();
        String name = ((ComboItem) item).getValue();
        System.out.println(SKU);
        System.out.println(name);
    }//GEN-LAST:event_jButtonCreateMRPActionPerformed

    private void jPanelMrpPlanningMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMrpPlanningMouseClicked
        jPanelMrpPlanning.requestFocus();
    }//GEN-LAST:event_jPanelMrpPlanningMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCreateMRP;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonMrpPlanning;
    private javax.swing.JButton jButtonMrpSummary;
    private javax.swing.JComboBox<String> jComboBoxProducts;
    private javax.swing.JComboBox<String> jComboBoxWeeksPlan;
    private com.toedter.calendar.JDateChooser jDateChooserStartDate;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelWeek1;
    private javax.swing.JLabel jLabelWeek2;
    private javax.swing.JLabel jLabelWeek3;
    private javax.swing.JLabel jLabelWeek4;
    private javax.swing.JLabel jLabelWeek5;
    private javax.swing.JLabel jLabelWeek6;
    private javax.swing.JLayeredPane jLayeredPane;
    private javax.swing.JPanel jPanelLeft;
    private javax.swing.JPanel jPanelMrpPlanning;
    private javax.swing.JPanel jPanelMrpSummary;
    private javax.swing.JTextField jTextFieldWeek1;
    private javax.swing.JTextField jTextFieldWeek2;
    private javax.swing.JTextField jTextFieldWeek3;
    private javax.swing.JTextField jTextFieldWeek4;
    private javax.swing.JTextField jTextFieldWeek5;
    private javax.swing.JTextField jTextFieldWeek6;
    // End of variables declaration//GEN-END:variables

    private void initalComponentsState() {
        jPanelMrpPlanning.setVisible(false);
        jPanelMrpSummary.setVisible(false);
        jLabelWeek1.setVisible(false);
        jLabelWeek2.setVisible(false);
        jLabelWeek3.setVisible(false);
        jLabelWeek4.setVisible(false);
        jLabelWeek5.setVisible(false);
        jLabelWeek6.setVisible(false);
        jTextFieldWeek1.setVisible(false);
        jTextFieldWeek2.setVisible(false);
        jTextFieldWeek3.setVisible(false);
        jTextFieldWeek4.setVisible(false);
        jTextFieldWeek5.setVisible(false);
        jTextFieldWeek6.setVisible(false);
        jComboBoxWeeksPlan.addItemListener(new WeekChangeListener());
        jComboBoxWeeksPlan.setSelectedIndex(-1);
        jLabelsList.add(jLabelWeek1);
        jLabelsList.add(jLabelWeek2);
        jLabelsList.add(jLabelWeek3);
        jLabelsList.add(jLabelWeek4);
        jLabelsList.add(jLabelWeek5);
        jLabelsList.add(jLabelWeek6);
        jTextFieldsList.add(jTextFieldWeek1);
        jTextFieldsList.add(jTextFieldWeek2);
        jTextFieldsList.add(jTextFieldWeek3);
        jTextFieldsList.add(jTextFieldWeek4);
        jTextFieldsList.add(jTextFieldWeek5);
        jTextFieldsList.add(jTextFieldWeek6);
    }

    private void setUIProperties() {
        this.getContentPane().setBackground(Color.WHITE);
        jPanelMrpPlanning.setBackground(Color.WHITE);
        jPanelMrpSummary.setBackground(Color.WHITE);
        jButtonCreateMRP.setBackground(new Color(0x0C31A6));
        jButtonCreateMRP.setForeground(Color.WHITE);
        UIManager.put("ToolTip.background", new Color(0xF8FAFF));
        UIManager.put("ToolTip.foreground", new Color(0x56595F));
        UIManager.put("ToolTip.font", new Font("Arial", Font.PLAIN, 14));
        jButtonMrpPlanning.setToolTipText("Planificación MRP");
        jButtonMrpSummary.setToolTipText("Resumen MRP");
        jButtonHome.setToolTipText("Regresar al menu");
    }

    private void resetComponentsState() {
        jLabelWeek1.setVisible(false);
        jLabelWeek2.setVisible(false);
        jLabelWeek3.setVisible(false);
        jLabelWeek4.setVisible(false);
        jLabelWeek5.setVisible(false);
        jLabelWeek6.setVisible(false);
        jTextFieldWeek1.setVisible(false);
        jTextFieldWeek2.setVisible(false);
        jTextFieldWeek3.setVisible(false);
        jTextFieldWeek4.setVisible(false);
        jTextFieldWeek5.setVisible(false);
        jTextFieldWeek6.setVisible(false);
        jComboBoxWeeksPlan.setSelectedIndex(-1);
        jComboBoxProducts.removeAllItems();
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        for (Product product : productController.getAllFinalProducts()) {
            comboModel.addElement(new ComboItem(product.getSKU(),
                    product.getName()));
        }
        jComboBoxProducts.setModel(comboModel);
    }

    private class WeekChangeListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent event) {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                Object item = event.getItem();
                int value = Integer.valueOf(item.toString().substring(0, 1));
                for (int i = 0; i < jLabelsList.size(); i++) {
                    jLabelsList.get(i).setVisible(false);
                    jTextFieldsList.get(i).setVisible(false);
                }
                for (int i = 0; i < value; i++) {
                    jLabelsList.get(i).setVisible(true);
                    jTextFieldsList.get(i).setVisible(true);
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
