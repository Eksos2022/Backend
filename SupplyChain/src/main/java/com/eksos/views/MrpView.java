/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.eksos.views;

import com.eksos.EksosMenu;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

/**
 *
 * @author Allecan
 */
public class MrpView extends javax.swing.JFrame {

    /**
     * Creates new form MrpView
     */
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
        jTextFieldSupplier = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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

        jPanelMrpPlanning.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldSupplier.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jPanelMrpPlanning.add(jTextFieldSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 400, 40));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel5.setText("Planeación de MRP");
        jPanelMrpPlanning.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel6.setText("Nombre del proveedor");
        jPanelMrpPlanning.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 200, 32));

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
        initalComponentsState();
        jPanelMrpPlanning.setVisible(true);
    }//GEN-LAST:event_jButtonMrpPlanningActionPerformed

    private void jButtonMrpSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMrpSummaryActionPerformed
        initalComponentsState();
        jPanelMrpSummary.setVisible(true);
    }//GEN-LAST:event_jButtonMrpSummaryActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        dispose();
        EksosMenu menu = new EksosMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonMrpPlanning;
    private javax.swing.JButton jButtonMrpSummary;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane;
    private javax.swing.JPanel jPanelLeft;
    private javax.swing.JPanel jPanelMrpPlanning;
    private javax.swing.JPanel jPanelMrpSummary;
    private javax.swing.JTextField jTextFieldSupplier;
    // End of variables declaration//GEN-END:variables

    private void initalComponentsState() {
        jPanelMrpPlanning.setVisible(false);
        jPanelMrpSummary.setVisible(false);
    }

    private void setUIProperties() {
        this.getContentPane().setBackground(Color.WHITE);
        jPanelMrpPlanning.setBackground(Color.WHITE);
        jPanelMrpSummary.setBackground(Color.WHITE);
        UIManager.put("ToolTip.background", new Color(0xF8FAFF));
        UIManager.put("ToolTip.foreground", new Color(0x56595F));
        UIManager.put("ToolTip.font", new Font("Arial", Font.PLAIN, 14));
        jButtonMrpPlanning.setToolTipText("Planificación MRP");
        jButtonMrpSummary.setToolTipText("Resumen MRP");
        jButtonHome.setToolTipText("Regresar al menu");
    }
}
