
package proyecto_cliente_servidor;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.LinkedList;



public class CatRutinas extends javax.swing.JFrame {

    //CatDeporte catD= new CatDeporte();
    Catalogos catalogo;
    public CatRutinas(Catalogos catalogo) {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Catalago de Rutinas");
        this.catalogo =  catalogo;
    }

public void agregar(){
        String verificarR = jTextField2.getText();
        boolean encontrado = false;
//        if(!catalogo.equals(verificarR)){
//            JOptionPane.showMessageDialog(null, "El deporte no existe en la base de datos",
//                    "Deporte no encontrado", JOptionPane.ERROR_MESSAGE);
//           
//        }
        
        for(CatalogoRutinas rutina : catalogo.getCatalogoRutinas()){
            if(rutina.getDeporteC().equals(verificarR)){
                JOptionPane.showMessageDialog(null, "la rutina del deporte  "+
                        verificarR+" ya se encuentra registrada","Rutina ya registrada",
                        JOptionPane.INFORMATION_MESSAGE);
               encontrado = true;
               break;
            }
        }
        if(!encontrado){
        CatalogoRutinas r = new CatalogoRutinas();
        r.setDescrip(jTextField1.getText());
        r.setDeporteC(jTextField2.getText());
        r.setTiempo(Integer.parseInt(jTextField3.getText()));
        if(jCheckBox1.isSelected()){
            r.setEstadoR("Activo");
        }else{
             r.setEstadoR("Inactivo");
        }
    LinkedList<CatalogoRutinas> registroR = this.catalogo.getCatalogoRutinas();
        registroR.add(r);
        JOptionPane.showMessageDialog(null, "Datos guardados correctamente",
                "Datos Guardados", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        
        }
    }

    public void editar(){
         CatalogoRutinas rutinaEncontrada = null;
         String nombDeporte = jTextField1.getText();
         for(CatalogoRutinas unDeporte : this.catalogo.getCatalogoRutinas()){
             if(nombDeporte.equals(unDeporte.getDeporteC())){
                 JOptionPane.showMessageDialog(null, "Deporte encontrado");
                 rutinaEncontrada = unDeporte;
                 
                 break;
             }
         }
         if(rutinaEncontrada !=null){
             rutinaEncontrada.setDescrip(jTextField2.getText());
             rutinaEncontrada.setTiempo(Integer.parseInt(jTextField3.getText()));
             if(jCheckBox1.isSelected()){
                 rutinaEncontrada.setEstadoR("Activo");
             }else{
                 rutinaEncontrada.setEstadoR("Inactivo");
             }
             JOptionPane.showMessageDialog(null,"Rutina actualizada");
         }else{
            JOptionPane.showMessageDialog(null,"La rutina no existe en la base de datos");
        }
    }
    
    
    public void inactivar(){
        CatalogoRutinas rutinaEncontrada = null;
         String nombDeporte = jTextField2.getText();
         for(CatalogoRutinas unDeporte : this.catalogo.getCatalogoRutinas()){
             if(nombDeporte.equals(unDeporte.getDeporteC())){
                 JOptionPane.showMessageDialog(null, "Deporte encontrado");
                 rutinaEncontrada = unDeporte;
                 
                 break;
             }
         }
         if(rutinaEncontrada !=null){
             if(rutinaEncontrada.getEstadoR().equals("Activo")){
                 rutinaEncontrada.setEstadoR("Inactivo");
                 JOptionPane.showMessageDialog(null, "La rutina ha sido inactivada");
             }else{
                JOptionPane.showMessageDialog(null, "La rutina esta inactivada");
             }
         }else{
            JOptionPane.showMessageDialog(null,"La rutina no existe en la base de datos");
        }
    }

    public void limpiar(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jCheckBox1.setSelected(false);
    }


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Catálogo de Rutinas");

        jLabel2.setText("Descripción");

        jLabel3.setText("Deporte");

        jLabel4.setText("Tiempo");

        jCheckBox1.setText("Estado");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton1)
                                .addGap(108, 108, 108)
                                .addComponent(jButton3))
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        inactivar();
    }//GEN-LAST:event_jButton3ActionPerformed
//
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
