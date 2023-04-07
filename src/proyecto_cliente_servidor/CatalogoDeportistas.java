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
public class CatalogoDeportistas implements Serializable  {
    private int identificacion;
    private String nombreCompletoN;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String correo;
    private String estadoN;

    public CatalogoDeportistas(int identificacion, String nombreCompletoN, String ciudad, String direccion, String telefono, String correo, String estadoN) {
        this.identificacion = identificacion;
        this.nombreCompletoN = nombreCompletoN;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.estadoN = estadoN;
    }
    public CatalogoDeportistas() {
        this.identificacion = 0;
        this.nombreCompletoN = "";
        this.ciudad = "";
        this.direccion = "";
        this.telefono = "";
        this.correo = "";
        this.estadoN = "";
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreCompletoN() {
        return nombreCompletoN;
    }

    public void setNombreCompletoN(String nombreCompletoN) {
        this.nombreCompletoN = nombreCompletoN;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.ciudad = Ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstadoN() {
        return estadoN;
    }

    public void setEstadoN(String estadoN) {
        this.estadoN = estadoN;
    }
    public void agregarN(){
        JOptionPane.showMessageDialog(null, "Bienvenido al catálogo de deportistas");
        identificacion = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de identificacion: "));
        nombreCompletoN = JOptionPane.showInputDialog("Escriba su nombre completo: ");
        ciudad = JOptionPane.showInputDialog("Escriba el nomdre de la ciudad: ");
        direccion = JOptionPane.showInputDialog("Escriba su direccion: ");
        telefono = JOptionPane.showInputDialog("Digite su numero de telefono: ");
        correo = JOptionPane.showInputDialog("Escriba su correo electronico: ");
        estadoN = JOptionPane.showInputDialog("Escriba su estado: ");
    }
}
