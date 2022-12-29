/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package kmeans3d;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author tania
 */
public class MedidasPlano extends javax.swing.JDialog {

    /**
     * Creates new form MedidasPlano
     */
    public MedidasPlano(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
    }

    public double getXmin(){
      return this.xmin;
    }
    
    public double getXmax(){
      return this.xmax;
    }
    
    public double getYmin(){
      return this.ymin;
    }
    
    public double getYmax(){
      return this.ymax;
    }
    public double getZmin(){
      return this.zmin;
    }
    
    public double getZmax(){
      return this.zmax;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfXmin = new javax.swing.JTextField();
        jtfXmax = new javax.swing.JTextField();
        jtfYmin = new javax.swing.JTextField();
        jtfYmax = new javax.swing.JTextField();
        jtfZmin = new javax.swing.JTextField();
        jtfZmax = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblTitulo.setText("Seleccione medidas para el plano");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel1.setText("Xmin:");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel2.setText("Xmax:");

        btnAceptar.setText("Aceptar");
        btnAceptar.setEnabled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel3.setText("Ymin:");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel4.setText("Ymax:");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel5.setText("Zmin:");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel6.setText("Zmax:");

        jtfXmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfXminKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfXminKeyTyped(evt);
            }
        });

        jtfXmax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfXmaxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfXmaxKeyTyped(evt);
            }
        });

        jtfYmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfYminKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfYminKeyTyped(evt);
            }
        });

        jtfYmax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfYmaxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfYmaxKeyTyped(evt);
            }
        });

        jtfZmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfZminKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfZminKeyTyped(evt);
            }
        });

        jtfZmax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfZmaxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfZmaxKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfXmax, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jtfXmin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfYmin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfYmax, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfZmin, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jtfZmax))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(161, 161, 161))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jtfXmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfYmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfZmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jtfXmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfYmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfZmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        xmin = Double.parseDouble(jtfXmin.getText());
        xmax = Double.parseDouble(jtfXmax.getText());
        ymin = Double.parseDouble(jtfYmin.getText());
        ymax = Double.parseDouble(jtfYmax.getText());
        zmin = Double.parseDouble(jtfZmin.getText());
        zmax = Double.parseDouble(jtfZmax.getText());
      //Si la persona no ingresa
        if(xmin > xmax || ymin > ymax || zmin > zmax){
            JOptionPane.showMessageDialog(null, "Verifique que los campos sean correctos", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(xmin == xmax || ymin == ymax || zmin == zmax){
            JOptionPane.showMessageDialog(null, "Los minimos y maximos no deben ser iguales", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            Interfaz.xmin = xmin;
            Interfaz.xmax = xmax;
            Interfaz.ymin = ymin;
            Interfaz.ymax = ymax;
            Interfaz.zmin = zmin;
            Interfaz.zmax = zmax;            
            setVisible(false);

        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jtfXminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfXminKeyReleased
        // TODO add your handling code here:
        boolean ver = false;
        if(jtfXmin.getText().equals("") || jtfXmax.getText().equals("") || jtfYmin.getText().equals("") || jtfYmax.getText().equals("")|| jtfZmin.getText().equals("") || jtfZmax.getText().equals("")){
            ver = false;
        }else{
            ver = true;
        }
        btnAceptar.setEnabled(ver);
    }//GEN-LAST:event_jtfXminKeyReleased

    private void jtfXmaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfXmaxKeyReleased
        // TODO add your handling code here:
        boolean ver = false;
        if(jtfXmin.getText().equals("") || jtfXmax.getText().equals("") || jtfYmin.getText().equals("") || jtfYmax.getText().equals("")|| jtfZmin.getText().equals("") || jtfZmax.getText().equals("")){
            ver = false;
        }else{
            ver = true;
        }
        btnAceptar.setEnabled(ver);
    }//GEN-LAST:event_jtfXmaxKeyReleased

    private void jtfYminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfYminKeyReleased
        // TODO add your handling code here:
        boolean ver = false;
        if(jtfXmin.getText().equals("") || jtfXmax.getText().equals("") || jtfYmin.getText().equals("") || jtfYmax.getText().equals("")|| jtfZmin.getText().equals("") || jtfZmax.getText().equals("")){
            ver = false;
        }else{
            ver = true;
        }
        btnAceptar.setEnabled(ver);
    }//GEN-LAST:event_jtfYminKeyReleased

    private void jtfYmaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfYmaxKeyReleased
        // TODO add your handling code here:
        boolean ver = false;
        if(jtfXmin.getText().equals("") || jtfXmax.getText().equals("") || jtfYmin.getText().equals("") || jtfYmax.getText().equals("")|| jtfZmin.getText().equals("") || jtfZmax.getText().equals("")){
            ver = false;
        }else{
            ver = true;
        }
        btnAceptar.setEnabled(ver);
    }//GEN-LAST:event_jtfYmaxKeyReleased

    private void jtfZminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfZminKeyReleased
        // TODO add your handling code here:
        boolean ver = false;
        if(jtfXmin.getText().equals("") || jtfXmax.getText().equals("") || jtfYmin.getText().equals("") || jtfYmax.getText().equals("")|| jtfZmin.getText().equals("") || jtfZmax.getText().equals("")){
            ver = false;
        }else{
            ver = true;
        }
        btnAceptar.setEnabled(ver);
    }//GEN-LAST:event_jtfZminKeyReleased

    private void jtfZmaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfZmaxKeyReleased
        // TODO add your handling code here:
        boolean ver = false;
        if(jtfXmin.getText().equals("") || jtfXmax.getText().equals("") || jtfYmin.getText().equals("") || jtfYmax.getText().equals("")|| jtfZmin.getText().equals("") || jtfZmax.getText().equals("")){
            ver = false;
        }else{
            ver = true;
        }
        btnAceptar.setEnabled(ver);
    }//GEN-LAST:event_jtfZmaxKeyReleased

    private void jtfXminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfXminKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.' && c!='-') {
            evt.consume();
        }
        if(c == '.' && jtfXmin.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_jtfXminKeyTyped

    private void jtfXmaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfXmaxKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.' && c!='-') {
            evt.consume();
        }
        if(c == '.' && jtfXmax.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_jtfXmaxKeyTyped

    private void jtfYminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfYminKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.' && c!='-') {
            evt.consume();
        }
        if(c == '.' && jtfYmin.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_jtfYminKeyTyped

    private void jtfYmaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfYmaxKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.' && c!='-') {
            evt.consume();
        }
        if(c == '.' && jtfYmax.getText().contains(".") && c!='-'){
            evt.consume();
        }
    }//GEN-LAST:event_jtfYmaxKeyTyped

    private void jtfZminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfZminKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.' && c!='-') {
            evt.consume();
        }
        if(c == '.' && jtfZmin.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_jtfZminKeyTyped

    private void jtfZmaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfZmaxKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.' && c!='-') {
            evt.consume();
        }
        if(c == '.' && jtfZmax.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_jtfZmaxKeyTyped

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtfXmax;
    private javax.swing.JTextField jtfXmin;
    private javax.swing.JTextField jtfYmax;
    private javax.swing.JTextField jtfYmin;
    private javax.swing.JTextField jtfZmax;
    private javax.swing.JTextField jtfZmin;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
    public double xmin,xmax, ymin, ymax, zmin,zmax;

}
