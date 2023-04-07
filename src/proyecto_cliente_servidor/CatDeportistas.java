
package proyecto_cliente_servidor;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.LinkedList;

public class CatDeportistas extends javax.swing.JFrame {

    LinkedList<CatalogoDeportistas> catalogoDeportistas ;
        
    public CatDeportistas(Catalogos catalogo) {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Catalago de Deportistas");
        catalogoDeportistas = catalogo.getCatalogoDeportistas();
    }
    
        public void agregar(){
        
        CatalogoDeportistas deportista = new CatalogoDeportistas();
        try{
            deportista.setNombreCompletoN(jTextField2.getText());
            deportista.setCiudad(jTextField2.getText());
            deportista.setDireccion(jTextField2.getText());
            deportista.setTelefono(jTextField2.getText());
            deportista.setCorreo(jTextField2.getText());
            if(jCheckBox1.isSelected()){
                deportista.setEstadoN("Activo");
            }else{
                deportista.setEstadoN("Inactivo");
            }
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(
            "catalogos.dat", true));
            dos.writeInt(deportista.getIdentificacion());
            dos.writeUTF(deportista.getNombreCompletoN());
            dos.writeUTF(deportista.getCiudad());
            dos.writeUTF(deportista.getDireccion());
            dos.writeUTF(deportista.getTelefono());
            dos.writeUTF(deportista.getCorreo());
            dos.writeUTF(deportista.getEstadoN());
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente",
                    "Datos Guardados", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }catch(IOException ex01){
        JOptionPane.showMessageDialog(null, "¡Error al guardar, revise!", "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }
    public void editar(){
        int encontrado = 0;
        int idCatag = Integer.parseInt(jTextField1.getText());
        //int idDepor = deportista.getIdentificacion();
        //String nombreD = deportista.getNombreCompletoN();
        //String ciudad = deportista.getCiudad();
        //String direccion = deportista.getDireccion();
        //String telefono = deportista.getTelefono();
        //String correo = deportista.getCorreo();
        //String estado = deportista.getEstadoN();
//        try{
//            DataInputStream dis = new DataInputStream(new FileInputStream(
//            "catalogos.dat"));
//            DataOutputStream dos = new DataOutputStream(new FileOutputStream(
//            "auxiliar.dat"));
//            try{
//                while(dis.available()>0){
//                    idDepor = dis.readInt();
//                    nombreD = dis.readUTF();
//                    ciudad = dis.readUTF();
//                    direccion = dis.readUTF();
//                    telefono = dis.readUTF();
//                    correo = dis.readUTF();
//                    estado = dis.readUTF();
//                    if (idCatag==idDepor){
//                        encontrado = 1;
//                        nombreD = jTextField2.getText();
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
//                    dos.writeInt(idDepor);
//                    dos.writeUTF(nombreD);
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
//        int idCatag = Integer.parseInt(jTextField1.getText());
//        int encontrado = 0;
//        int idDepor = catDeportistas.getIdentificacion();
//        String nombreD = catDeportistas.getNombreCompletoN();
//        String ciudad = catDeportistas.getCiudad();
//        String direccion = catDeportistas.getDireccion();
//        String telefono = catDeportistas.getTelefono();
//        String correo = catDeportistas.getCorreo();
//        String estado = catDeportistas.getEstadoN();
//        try{
//            DataInputStream dis = new DataInputStream(new FileInputStream(
//            "catalogos.dat"));
//            DataOutputStream dos = new DataOutputStream(new FileOutputStream(
//            "auxiliar.dat"));
//            try{
//                while(dis.available()>0){
//                    idDepor = dis.readInt();
//                    nombreD = dis.readUTF();
//                    ciudad = dis.readUTF();
//                    direccion = dis.readUTF();
//                    telefono = dis.readUTF();
//                    correo = dis.readUTF();
//                    estado = dis.readUTF();
//                    if(idCatag == idDepor){
//                        encontrado = 1;
//                   if (!estado.equals("Inactivo")){
//                        estado = "Inactivo";
//                        JOptionPane.showMessageDialog(null,
//                            "¡El dato ha sido inactivado exitosamente!",
//                            "Dato inactivado", JOptionPane.INFORMATION_MESSAGE);
//                    } else {
//                        JOptionPane.showMessageDialog(null,
//                            "¡El dato ya está inactivo!",
//                            "Dato inactivo", JOptionPane.WARNING_MESSAGE);
//                        }
//                    }
//                    dos.writeInt(idDepor);
//                    dos.writeUTF(nombreD);
//                    dos.writeUTF(ciudad);
//                    dos.writeUTF(direccion);
//                    dos.writeUTF(telefono);
//                    dos.writeUTF(correo);
//                    dos.writeUTF(estado);
//                }
//            dis.close();
//            dos.close();
//            intercambiar();
//           if (encontrado==0) {
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
//        }
    }
        
    public void intercambiar(){
//        int encontrado =0;
//        int idDepor = catDeportistas.getIdentificacion();
//        String nombreD = catDeportistas.getNombreCompletoN();
//        String ciudad = catDeportistas.getCiudad();
//        String direccion = catDeportistas.getDireccion();
//        String telefono = catDeportistas.getTelefono();
//        String correo = catDeportistas.getCorreo();
//        String estado = catDeportistas.getEstadoN();
//        try{
//            DataInputStream dis = new DataInputStream(new FileInputStream(
//            "auxiliar.dat"));
//            DataOutputStream dos = new DataOutputStream(new FileOutputStream(
//            "catalogos.dat"));
//            try{
//                while(true){
//                    idDepor = dis.readInt();
//                    nombreD = dis.readUTF();
//                    ciudad = dis.readUTF();
//                    direccion = dis.readUTF();
//                    telefono = dis.readUTF();
//                    correo = dis.readUTF();
//                    estado = dis.readUTF();
//                    dos.writeInt(idDepor);
//                    dos.writeUTF(nombreD);
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("jCheckBoxMenuItem4");

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Catálogo de Deportistas");

        jLabel2.setText("ID del deportista");

        jLabel3.setText("Nombre Completo");

        jLabel4.setText("Ciudad");

        jLabel5.setText("Dirección");

        jLabel6.setText("Teléfono");

        jLabel7.setText("Correo electrónico");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Estado");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jButton1)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(36, 36, 36)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(jTextField6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
