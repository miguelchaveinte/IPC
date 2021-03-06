/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.termostatoVista;

import javax.swing.BorderFactory;
import my.termostatoModelo.Modelo;

/**
 *
 * @author migchav,jhocaba,ernperi
 */
public class VistaConf extends javax.swing.JFrame {

    private Modelo modelo;
    private ControladorConf controlador;
    /**
     * Creates new form VistaConf
     */
    public VistaConf(Modelo model) {
        initComponents();
        modelo=model;
        controlador=new ControladorConf(this,modelo);
        comboHora();
        comboDia.setModel(new javax.swing.DefaultComboBoxModel<>(modelo.getMes31()));
        setFecha();       
        panelConfir.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30)); 
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
        panelFecha = new javax.swing.JPanel();
        comboDia = new javax.swing.JComboBox<>();
        comboMes = new javax.swing.JComboBox<>();
        comboAnnio = new javax.swing.JComboBox<>();
        panelHora = new javax.swing.JPanel();
        comboHora = new javax.swing.JComboBox<>();
        comboMin = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        panelConfir = new javax.swing.JPanel();
        vacio1 = new javax.swing.JButton();
        vacio2 = new javax.swing.JButton();
        vacio3 = new javax.swing.JButton();
        btCambiar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTotal.setBackground(new java.awt.Color(255, 255, 255));
        panelTotal.setLayout(new java.awt.GridLayout(3, 0));

        panelFecha.setBackground(new java.awt.Color(255, 255, 255));
        panelFecha.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Set Fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24)), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)))); // NOI18N
        panelFecha.setLayout(new java.awt.GridLayout(1, 3, 15, 0));

        comboDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelFecha.add(comboDia);

        comboMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        comboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMesActionPerformed(evt);
            }
        });
        panelFecha.add(comboMes);

        comboAnnio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboAnnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990" }));
        comboAnnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAnnioActionPerformed(evt);
            }
        });
        panelFecha.add(comboAnnio);

        panelTotal.add(panelFecha);

        panelHora.setBackground(new java.awt.Color(255, 255, 255));
        panelHora.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Set Hora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24)), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)))); // NOI18N
        panelHora.setLayout(new java.awt.GridLayout(1, 3, 15, 0));

        comboHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        comboHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHoraActionPerformed(evt);
            }
        });
        panelHora.add(comboHora);

        comboMin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboMin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        panelHora.add(comboMin);
        panelHora.add(jLabel1);

        panelTotal.add(panelHora);

        panelConfir.setBackground(new java.awt.Color(255, 255, 255));
        panelConfir.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        vacio1.setBackground(new java.awt.Color(255, 255, 255));
        vacio1.setBorderPainted(false);
        vacio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacio1ActionPerformed(evt);
            }
        });
        panelConfir.add(vacio1);

        vacio2.setBackground(new java.awt.Color(255, 255, 255));
        vacio2.setBorderPainted(false);
        vacio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacio2ActionPerformed(evt);
            }
        });
        panelConfir.add(vacio2);

        vacio3.setBackground(new java.awt.Color(255, 255, 255));
        vacio3.setBorderPainted(false);
        vacio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacio3ActionPerformed(evt);
            }
        });
        panelConfir.add(vacio3);

        btCambiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCambiar.setText("Cambiar");
        btCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCambiarActionPerformed(evt);
            }
        });
        panelConfir.add(btCambiar);

        btCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        panelConfir.add(btCancelar);

        panelTotal.add(panelConfir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMesActionPerformed
        controlador.cambioMes();
    }//GEN-LAST:event_comboMesActionPerformed

    private void comboAnnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAnnioActionPerformed
       controlador.cambioAnnio();
    }//GEN-LAST:event_comboAnnioActionPerformed

    private void comboHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHoraActionPerformed
       
    }//GEN-LAST:event_comboHoraActionPerformed

    private void btCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCambiarActionPerformed
        controlador.setHora();
        controlador.setMinutos();
        controlador.setFecha();
        controlador.procesaNavegaInicio();
    }//GEN-LAST:event_btCambiarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
       controlador.procesaNavegaInicio();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void vacio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vacio1ActionPerformed

    private void vacio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vacio2ActionPerformed

    private void vacio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vacio3ActionPerformed

    public int getHora(){
        return Integer.valueOf((String)comboHora.getSelectedItem());
    }
    public int getMinutos(){
        return Integer.valueOf((String)comboMin.getSelectedItem());
    }
    public String getMes(){
        return (String)comboMes.getSelectedItem();
    }
    
    public int getAnnio(){
        return Integer.valueOf((String)comboAnnio.getSelectedItem());
    }
    
    public int getDias(){
         return Integer.valueOf((String)comboDia.getSelectedItem());
    }

    public  void setDias31(){
        comboDia.setModel(new javax.swing.DefaultComboBoxModel<>(modelo.getMes31()));
    }
    
    public  void setDias30(){
        comboDia.setModel(new javax.swing.DefaultComboBoxModel<>(modelo.getMes30()));
    }
    
    public  void setDias29(){
        comboDia.setModel(new javax.swing.DefaultComboBoxModel<>(modelo.getFebreroBis()));
    }
    public  void setDias28(){
        comboDia.setModel(new javax.swing.DefaultComboBoxModel<>(modelo.getFebreroNormal()));
    }
    

    
    public void comboHora(){
       /**String hora= controlador.obtenerHora();
       System.out.println(hora);
       String array []=hora.split(":");
       jComboBox7.setSelectedIndex(Integer.valueOf(array[0]));
       jComboBox8.setSelectedIndex(Integer.valueOf(array[1]));
       **/
       comboHora.setSelectedIndex(modelo.getHora());
       comboMin.setSelectedIndex(modelo.getMinutos());
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCambiar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JComboBox<String> comboAnnio;
    private javax.swing.JComboBox<String> comboDia;
    private javax.swing.JComboBox<String> comboHora;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JComboBox<String> comboMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelConfir;
    private javax.swing.JPanel panelFecha;
    private javax.swing.JPanel panelHora;
    private javax.swing.JPanel panelTotal;
    private javax.swing.JButton vacio1;
    private javax.swing.JButton vacio2;
    private javax.swing.JButton vacio3;
    // End of variables declaration//GEN-END:variables

    public void setFecha() {
        comboAnnio.setSelectedItem(modelo.getAnnio());
        comboMes.setSelectedItem(modelo.getMesString());
        controlador.cambioMes();       
       comboDia.setSelectedItem(String.valueOf(modelo.getDia()));
   
    }

    public void seleccionarDia(int diaSeleccionado) {
        comboDia.setSelectedItem(String.valueOf(diaSeleccionado));
    }

    
}
