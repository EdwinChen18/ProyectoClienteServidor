/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_cliente_servidor;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CatalogoPadres implements Serializable {
    private String nombreCompletoPadres;
    private String ninoCargo;
    private String ciudadP;
    private String direccionP;
    private String telefonoP;
    private String correoP;
    private String estadoP;

    public CatalogoPadres(String nombreCompletoPadres, String ninoCargo, String ciudadP, String direccionP, String telefonoP, String correoP, String estadoP) {
        this.nombreCompletoPadres = nombreCompletoPadres;
        this.ninoCargo = ninoCargo;
        this.ciudadP = ciudadP;
        this.direccionP = direccionP;
        this.telefonoP = telefonoP;
        this.correoP = correoP;
        this.estadoP = estadoP;
    }
      public CatalogoPadres() {
        this.nombreCompletoPadres = "";
        this.ninoCargo = "";
        this.ciudadP = "";
        this.direccionP = "";
        this.telefonoP = "";
        this.correoP = "";
        this.estadoP = "";
      }

    public String getNombreCompletoPadres() {
        return nombreCompletoPadres;
    }

    public void setNombreCompletoPadres(String nombreCompletoPadres) {
        this.nombreCompletoPadres = nombreCompletoPadres;
    }

    public String getNinoCargo() {
        return ninoCargo;
    }

    public void setNinoCargo(String ninoCargo) {
        this.ninoCargo = ninoCargo;
    }

    public String getCiudadP() {
        return ciudadP;
    }

    public void setCiudadP(String ciudadP) {
        this.ciudadP = ciudadP;
    }

    public String getDireccionP() {
        return direccionP;
    }

    public void setDireccionP(String direccionP) {
        this.direccionP = direccionP;
    }

    public String getTelefonoP() {
        return telefonoP;
    }

    public void setTelefonoP(String telefonoP) {
        this.telefonoP = telefonoP;
    }

    public String getCorreoP() {
        return correoP;
    }

    public void setCorreoP(String correoP) {
        this.correoP = correoP;
    }

    public String getEstadoP() {
        return estadoP;
    }

    public void setEstadoP(String estadoP) {
        this.estadoP = estadoP;
    }
     public void agregarPCargo(){
        JOptionPane.showMessageDialog(null, "Bienvenido al catálogo de padres de familia");
        nombreCompletoPadres = JOptionPane.showInputDialog("Escriba su nombre completo: ");
        ninoCargo = JOptionPane.showInputDialog("Escriba su nombre completo: ");
        ciudadP = JOptionPane.showInputDialog("Escriba el nomdre de la ciudad: ");
        direccionP = JOptionPane.showInputDialog("Escriba su direccion: ");
        telefonoP = JOptionPane.showInputDialog("Digite su numero de telefono: ");
        correoP = JOptionPane.showInputDialog("Escriba su correo electronico: ");
        estadoP = JOptionPane.showInputDialog("Escriba su estado: ");
}
}
