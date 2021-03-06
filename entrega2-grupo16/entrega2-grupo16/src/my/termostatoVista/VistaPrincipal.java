/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termostatoVista;

import java.awt.Color;
import my.termostatoModelo.Modelo;

/**
 *
 * @author migchav,jhocaba,ernperi
 */
public class VistaPrincipal extends javax.swing.JFrame {

    private Modelo modelo;
    private ControladorPrincipal control;
    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal(Modelo model) {
        initComponents();
        modelo=model;
        control=new ControladorPrincipal(this,modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTotal = new javax.swing.JPanel();
        panelConf = new javax.swing.JPanel();
        btConf = new javax.swing.JButton();
        panelGestion = new javax.swing.JPanel();
        btGest = new javax.swing.JButton();
        panelTermostato = new javax.swing.JPanel();
        btTerm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTotal.setBackground(new java.awt.Color(255, 255, 255));
        panelTotal.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "INICIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 32)), javax.swing.BorderFactory.createEmptyBorder(8, 12, 0, 0)))); // NOI18N
        panelTotal.setLayout(new java.awt.GridLayout(1, 3, 16, 16));

        panelConf.setBackground(new java.awt.Color(255, 255, 255));
        panelConf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Configuraci??n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)))); // NOI18N
        panelConf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelConfMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelConfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelConfMouseExited(evt);
            }
        });
        panelConf.setLayout(new java.awt.GridLayout(1, 0));

        btConf.setBackground(new java.awt.Color(204, 204, 204));
        btConf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/settings.png"))); // NOI18N
        btConf.setToolTipText("");
        btConf.setBorderPainted(false);
        btConf.setContentAreaFilled(false);
        btConf.setFocusable(false);
        btConf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btConfMouseEntered(evt);
            }
        });
        btConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfActionPerformed(evt);
            }
        });
        panelConf.add(btConf);

        panelTotal.add(panelConf);

        panelGestion.setBackground(new java.awt.Color(255, 255, 255));
        panelGestion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Gesti??n Programas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)))); // NOI18N
        panelGestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelGestionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelGestionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelGestionMouseExited(evt);
            }
        });
        panelGestion.setLayout(new java.awt.GridLayout(1, 0));

        btGest.setBackground(new java.awt.Color(204, 204, 204));
        btGest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/gestion.png"))); // NOI18N
        btGest.setToolTipText("");
        btGest.setBorderPainted(false);
        btGest.setContentAreaFilled(false);
        btGest.setFocusable(false);
        btGest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btGestpanelLuminariaMouseEntered(evt);
            }
        });
        btGest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGestActionPerformed(evt);
            }
        });
        panelGestion.add(btGest);

        panelTotal.add(panelGestion);

        panelTermostato.setBackground(new java.awt.Color(255, 255, 255));
        panelTermostato.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Termostato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)))); // NOI18N
        panelTermostato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelTermostatoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelTermostatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelTermostatoMouseExited(evt);
            }
        });
        panelTermostato.setLayout(new java.awt.GridLayout(1, 0));

        btTerm.setBackground(new java.awt.Color(204, 204, 204));
        btTerm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/thermostat.png"))); // NOI18N
        btTerm.setToolTipText("");
        btTerm.setBorderPainted(false);
        btTerm.setContentAreaFilled(false);
        btTerm.setFocusable(false);
        btTerm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btTermpanelLuminariaMouseEntered(evt);
            }
        });
        btTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTermActionPerformed(evt);
            }
        });
        panelTermostato.add(btTerm);

        panelTotal.add(panelTermostato);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConfMouseEntered
        Color c = new Color(234, 234, 234);
        panelConf.setBackground(c);
        panelConf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), "Configuraci??n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 0, 4))));
    }//GEN-LAST:event_btConfMouseEntered

    private void btConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfActionPerformed
            control.procesaNavegaConf();       
    }//GEN-LAST:event_btConfActionPerformed

    private void btGestpanelLuminariaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btGestpanelLuminariaMouseEntered
        Color c = new Color(234, 234, 234);
        panelGestion.setBackground(c);
        panelGestion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), "Gesti??n Programas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 0, 4))));
    }//GEN-LAST:event_btGestpanelLuminariaMouseEntered

    private void btGestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGestActionPerformed
         control.procesaNavegaGest();
    }//GEN-LAST:event_btGestActionPerformed

    private void panelConfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelConfMouseEntered
        Color c = new Color(234, 234, 234);
        panelConf.setBackground(c);
        panelConf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), "Configuraci??n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 0, 4))));
    }//GEN-LAST:event_panelConfMouseEntered

    private void btTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTermActionPerformed
        control.procesaNavegaTer();
    }//GEN-LAST:event_btTermActionPerformed

    private void btTermpanelLuminariaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTermpanelLuminariaMouseEntered
        Color c = new Color(234, 234, 234);
        panelTermostato.setBackground(c);
        panelTermostato.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), "Termostato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 0, 4))));
    }//GEN-LAST:event_btTermpanelLuminariaMouseEntered

    private void panelConfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelConfMouseExited
        Color c = new Color(255, 255, 255);
        panelConf.setBackground(c);
        panelConf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), "Configuraci??n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 0, 4))));
    }//GEN-LAST:event_panelConfMouseExited

    private void panelConfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelConfMouseClicked
        control.procesaNavegaConf();
    }//GEN-LAST:event_panelConfMouseClicked

    private void panelGestionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGestionMouseEntered

        Color c = new Color(234, 234, 234);
        panelGestion.setBackground(c);
        panelGestion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), "Gesti??n Programas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 0, 4))));
    }//GEN-LAST:event_panelGestionMouseEntered

    private void panelTermostatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTermostatoMouseEntered
        Color c = new Color(234, 234, 234);
        panelTermostato.setBackground(c);
        panelTermostato.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), "Termostato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 0, 4))));
    }//GEN-LAST:event_panelTermostatoMouseEntered

    private void panelGestionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGestionMouseExited
        Color c = new Color(255, 255, 255);
        panelGestion.setBackground(c);
        panelGestion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), "Gesti??n Programas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 0, 4))));
    }//GEN-LAST:event_panelGestionMouseExited

    private void panelTermostatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTermostatoMouseExited
        Color c = new Color(255, 255, 255);
        panelTermostato.setBackground(c);
        panelTermostato.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), "Termostato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 0, 4))));
    }//GEN-LAST:event_panelTermostatoMouseExited

    private void panelGestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGestionMouseClicked
        control.procesaNavegaGest();
    }//GEN-LAST:event_panelGestionMouseClicked

    private void panelTermostatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTermostatoMouseClicked
        control.procesaNavegaTer();
    }//GEN-LAST:event_panelTermostatoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConf;
    private javax.swing.JButton btGest;
    private javax.swing.JButton btTerm;
    private javax.swing.JPanel panelConf;
    private javax.swing.JPanel panelGestion;
    private javax.swing.JPanel panelTermostato;
    private javax.swing.JPanel panelTotal;
    // End of variables declaration//GEN-END:variables
}
