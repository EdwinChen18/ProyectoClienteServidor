/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_cliente_servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CatPadres extends javax.swing.JFrame {

    CatalogoPadres catPadres = new CatalogoPadres();
    Catalogos catalogo ;
    
    /**
     * Creates new form CatPadres
     */
    public CatPadres(Catalogos catalogo) {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Catálogo de Padres");
        this.catalogo = catalogo;
    }
    public void agregar(){
//        
//        try{
//            catPadres.setNombreCompletoPadres(jTextField1.getText());
//            catPadres.setNinoCargo(jTextField1.getText());
//            catPadres.setCiudadP(jTextField1.getText());
//            catPadres.setDireccionP(jTextField1.getText());
//            catPadres.setTelefonoP(jTextField1.getText());
//            catPadres.setCorreoP(jTextField1.getText());
//            if(jCheckBox1.isSelected()){
//                catPadres.setEstadoP("Activo");
//            }else{
//                catPadres.setEstadoP("Inactivo");
//            }
//            DataOutputStream dos = new DataOutputStream(new FileOutputStream(
//            "catalogos.dat", true));
//            dos.writeUTF(catPadres.getNombreCompletoPadres());
//            dos.writeUTF(catPadres.getNinoCargo());
//            dos.writeUTF(catPadres.getCiudadP());
//            dos.writeUTF(catPadres.getDireccionP());
//            dos.writeUTF(catPadres.getTelefonoP());
//            dos.writeUTF(catPadres.getCorreoP());
//            dos.writeUTF(catPadres.getEstadoP());
//            JOptionPane.showMessageDialog(null, "Datos guardados correctamente",
//                    "Datos Guardados", JOptionPane.INFORMATION_MESSAGE);
//            limpiar();
//        }catch(IOException ex01){
//        JOptionPane.showMessageDialog(null, "¡Error al guardar, revise!", "Error",
//            JOptionPane.ERROR_MESSAGE);
//        }
    }
    public void editar(){
//        int encontrado = 0;
//        String idCatag = jTextField1.getText();
//        String nombreP = catPadres.getNombreCompletoPadres();
//        String nombreN = catPadres.getNinoCargo();
//        String ciudad = catPadres.getCiudadP();
//        String direccion = catPadres.getDireccionP();
//        String telefono = catPadres.getTelefonoP();
//        String correo = catPadres.getCorreoP();
//        String estado = catPadres.getEstadoP();
//        try{
//            DataInputStream dis = new DataInputStream(new FileInputStream(
//            "catalogos.dat"));
//            DataOutputStream dos = new DataOutputStream(new FileOutputStream(
//            "auxiliar.dat"));
//            try{
//                while(dis.available()>0){
//                    nombreP = dis.readUTF();
//                    nombreN = dis.readUTF();
//                    ciudad = dis.readUTF();
//                    direccion = dis.readUTF();
//                    telefono = dis.readUTF();
//                    correo = dis.readUTF();
//                    estado = dis.readUTF();
//                    if (idCatag.equals(nombreP)){
//                        encontrado = 1;
//                        nombreP = jTextField1.getText();
//                        nombreN = jTextField2.getText();
//                        ciudad = jTextField3.getText();
//                        direccion = jTextField4.getText();
//                        telefono = jTextField5.getText();
//                        correo = jTextField6.getText();
//                        if (jCheckBox1.isSelected()){
//                            estado="Activo";
//                        }else{
//                            estado="Inactivo";
//                        }
//                    }
//                    dos.writeUTF(nombreP);
//                    dos.writeUTF(nombreN);
//                    dos.writeUTF(ciudad);
//                    dos.writeUTF(direccion);
//                    dos.writeUTF(telefono);
//                    dos.writeUTF(correo);
//                    dos.writeUTF(estado);
//                }   if (encontrado == 1){
//                    JOptionPane.showMessageDialog(null,
//                        "¡Datos modificados correctamente!",
//                         "Dato modificados", JOptionPane.INFORMATION_MESSAGE);
//                    }else{
//                    JOptionPane.showMessageDialog(null,
//                     "¡El dato buscado no existe, revise!",
//                        "Dato no existe", JOptionPane.ERROR_MESSAGE);  
//                }
//                limpiar();
//            }catch(EOFException ex02){
//                dis.close();
//                dos.close();
//                intercambiar();
//            }
//        }catch(FileNotFoundException ex03){
//            JOptionPane.showMessageDialog(null,
//                 "¡El archivo no existe, revise!",
//                    "Archivo no existe", JOptionPane.ERROR_MESSAGE);
//        }catch(IOException ex04){
//            JOptionPane.showMessageDialog(null,
//                "¡Error general desconocido, revise!",
//                    "Archivo no existe", JOptionPane.ERROR_MESSAGE);  
//        }
    }
    public void inactivar(){
//    String idCatag = jTextField1.getText();
//    boolean encontrado = false;
//    try{
//        DataInputStream dis = new DataInputStream(new FileInputStream("catalogos.dat"));
//        DataOutputStream dos = new DataOutputStream(new FileOutputStream("auxiliar.dat"));
//        try{
//            while(dis.available()>0){
//                String nombreP = dis.readUTF();
//                String nombreN = dis.readUTF();
//                String ciudad = dis.readUTF();
//                String direccion = dis.readUTF();
//                String telefono = dis.readUTF();
//                String correo = dis.readUTF();
//                String estado = dis.readUTF();
//                if (idCatag.equals(nombreP)){
//                    encontrado = true;
//                    if (!estado.equals("Inactivo")){
//                        estado = "Inactivo";
//                        JOptionPane.showMessageDialog(null,
//                            "¡El dato ha sido inactivado exitosamente!",
//                            "Dato inactivado", JOptionPane.INFORMATION_MESSAGE);
//                    } else {
//                        JOptionPane.showMessageDialog(null,
//                            "¡El dato ya está inactivo!",
//                            "Dato inactivo", JOptionPane.WARNING_MESSAGE);
//                    }
//                }
//                dos.writeUTF(nombreP);
//                dos.writeUTF(nombreN);
//                dos.writeUTF(ciudad);
//                dos.writeUTF(direccion);
//                dos.writeUTF(telefono);
//                dos.writeUTF(correo);
//                dos.writeUTF(estado);
//            }
//            dis.close();
//            dos.close();
//            intercambiar();
//            if (!encontrado) {
//                JOptionPane.showMessageDialog(null,
//                    "¡El dato buscado no existe, revise!",
//                    "Dato no existe", JOptionPane.ERROR_MESSAGE); 
//            }
//        } catch(EOFException ex){
//            dis.close();
//            dos.close();
//            intercambiar();
//        }
//    } catch(IOException ex){
//        JOptionPane.showMessageDialog(null,
//            "¡Error general desconocido, revise!",
//            "Archivo no existe", JOptionPane.ERROR_MESSAGE);  
//    }
}
//    public void inactivar(){
//        if (jCheckBox1.isSelected()){
//            JOptionPane.showMessageDialog(null, "El deporte esta activo",
//                    "Estado: Activo", JOptionPane.INFORMATION_MESSAGE);
//        }else{
//        JOptionPane.showMessageDialog(null, "El deporte esta inactivo",
//            "Estado: Inactivo", JOptionPane.INFORMATION_MESSAGE);
//        }
//    }
    
    public void intercambiar(){
//        int encontrado =0;
//        String nombreP = catPadres.getNombreCompletoPadres();
//        String nombreN = catPadres.getNinoCargo();
//        String ciudad = catPadres.getCiudadP();
//        String direccion = catPadres.getDireccionP();
//        String telefono = catPadres.getTelefonoP();
//        String correo = catPadres.getCorreoP();
//        String estado = catPadres.getEstadoP();
//        try{
//            DataInputStream dis = new DataInputStream(new FileInputStream(
//            "auxiliar.dat"));
//            DataOutputStream dos = new DataOutputStream(new FileOutputStream(
//            "catalogos.dat"));
//            try{
//                while(true){
//                    nombreP = dis.readUTF();
//                    nombreN = dis.readUTF();
//                    ciudad = dis.readUTF();
//                    direccion = dis.readUTF();
//                    telefono = dis.readUTF();
//                    correo = dis.readUTF();
//                    estado = dis.readUTF();
//                    dos.writeUTF(nombreP);
//                    dos.writeUTF(nombreN);
//                    dos.writeUTF(ciudad);
//                    dos.writeUTF(direccion);
//                    dos.writeUTF(telefono);
//                    dos.writeUTF(correo);
//                    dos.writeUTF(estado);
//                }
//            }catch(EOFException ex03){
//                dis.close();
//                dos.close();
//            }
//        }catch(FileNotFoundException ex04){
//        JOptionPane.showMessageDialog(null,
//            "¡El archivo no existe, revise!",
//            "Archivo no existe", JOptionPane.ERROR_MESSAGE);
//        }catch(IOException ex05){
//            JOptionPane.showMessageDialog(null,
//                "¡Error general desconocido, revise!",
//                "Archivo no existe", JOptionPane.ERROR_MESSAGE);
//        }
    }
    public void limpiar(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jCheckBox1.setSelected(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Catálogo de Padres de Familia");

        jLabel2.setText("Nombre del Padre/Encargado");

        jLabel3.setText("Nombre del niño");

        jLabel4.setText("Ciudad");

        jLabel5.setText("Dirección");

        jLabel6.setText("Teléfono");

        jLabel7.setText("Correo electrónico");

        jCheckBox1.setText("Estado");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
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
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(36, 36, 36)
                                    .addComponent(jButton2)
                                    .addGap(37, 37, 37)
                                    .addComponent(jButton3))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7))
                                    .addGap(79, 79, 79)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        editar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        inactivar();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
