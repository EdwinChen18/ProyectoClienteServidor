/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_cliente_servidor;

import java.io.Serializable;
import javax.swing.JOptionPane;


public class CatalogoDeportes implements Serializable {
    private String nombreDeporte;
    private String caracteristicasD;
    private String estadoD;

    public CatalogoDeportes() {
        this.nombreDeporte = "";
        this.caracteristicasD = "";
        this.estadoD = "";
     }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public String getCaracteristicasD() {
        return caracteristicasD;
    }

    public void setCaracteristicasD(String caracteristicasD) {
        this.caracteristicasD = caracteristicasD;
    }

    public String getEstadoD() {
        return estadoD;
    }

    public void setEstadoD(String estadoD) {
        this.estadoD = estadoD;
    }
    public void agregarDeporte(){
        JOptionPane.showMessageDialog(null, "Bienvenido al catálogo de deportes");
        nombreDeporte = JOptionPane.showInputDialog("Escriba el nombre del deporte: ");
        caracteristicasD = JOptionPane.showInputDialog("Escriba las caracteristicas del deporte: ");
        estadoD = JOptionPane.showInputDialog("Escriba su estado: ");
    }
}
