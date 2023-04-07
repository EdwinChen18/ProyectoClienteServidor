/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_cliente_servidor;

import javax.swing.JFrame;
import java.io.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class CatDeporte extends javax.swing.JFrame {

        //CatalogoDeportes catD= new CatalogoDeportes();
        Catalogos catalogo;
        
    public CatDeporte(Catalogos catalogo) {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Catalago de Deportes");
        this.catalogo =catalogo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Catálogo de Deportes");

        jLabel2.setText("Nombre del deporte");

        jLabel3.setText("Características");

        jCheckBox1.setText("Estado");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Inactivar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:]
        agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        editar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        inactivar();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void agregar(){
        CatalogoDeportes catD = new CatalogoDeportes();
        catD.setNombreDeporte(jTextField1.getText());
        catD.setCaracteristicasD(jTextField2.getText());
        if(jCheckBox1.isSelected()){
            catD.setEstadoD("Activo");
        }else{
            catD.setEstadoD("Inactivo");
        }
        LinkedList<CatalogoDeportes> registroDeportes = this.catalogo.getCatalogoDeportes();
        registroDeportes.add(catD);
        JOptionPane.showMessageDialog(null, "Datos guardados correctamente",
                "Datos Guardados", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
    }
    
    public void editar(){
        CatalogoDeportes deporteEncontrado = null;
        String nombDeporte= jTextField1.getText();
        for(CatalogoDeportes unDeporte : this.catalogo.getCatalogoDeportes()){
            if(nombDeporte.equals(unDeporte.getNombreDeporte())){
                JOptionPane.showMessageDialog(null, "Deporte encontrado");
                deporteEncontrado = unDeporte;
                
                System.out.println(unDeporte.getCaracteristicasD());
                break;
            }
        }
        if(deporteEncontrado !=null){ //Si lo encontró
            deporteEncontrado.setCaracteristicasD(jTextField2.getText());
            if(jCheckBox1.isSelected()){
                deporteEncontrado.setEstadoD("Activo");
            }else{
                 deporteEncontrado.setEstadoD("Inactivo");
            }
            JOptionPane.showMessageDialog(null,"Deporte actualizado");
        }else{
            JOptionPane.showMessageDialog(null,"El deporte no existe en la base de datos");
        }
       
       
    }
    public void inactivar(){

        CatalogoDeportes deporteEncontrado = null;
        String nomDeporte= jTextField1.getText();
        for(CatalogoDeportes unDeporte : this.catalogo.getCatalogoDeportes()){
            if(nomDeporte.equals(unDeporte.getNombreDeporte())){
                JOptionPane.showMessageDialog(null, "Deporte encontrado");
                deporteEncontrado = unDeporte;
                break;
            }
        }
        if(deporteEncontrado != null){
            if(deporteEncontrado.getEstadoD().equals("Activo")){
                deporteEncontrado.setEstadoD("Inactivo");
                JOptionPane.showMessageDialog(null, "El deporte ha sido inactivado");
            }else{
                JOptionPane.showMessageDialog(null, "El deporte esta inactivo");
            }
        }else{
           JOptionPane.showMessageDialog(null, "Deporte no existe en la base de datos"); 
        }
}

    
    public void limpiar(){
        jTextField1.setText("");
        jTextField2.setText("");
        jCheckBox1.setSelected(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
