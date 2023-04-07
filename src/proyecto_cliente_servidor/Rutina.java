
package proyecto_cliente_servidor;

import java.io.Serializable;


public class Rutina implements Serializable {
    
    private String descripcionR;
    private String deporteC;//No se si se va a usar
    private int tiempo;
    private String estadoR;
    
    public Rutina(){
        this.descripcionR="";
        this.deporteC="";
        this.tiempo=0;
        this.estadoR="";
    }

    public String getDescripcionR() {
        return descripcionR;
    }

    public void setDescripcionR(String descripcionR) {
        this.descripcionR = descripcionR;
    }

    public String getDeporteC() {
        return deporteC;
    }

    public void setDeporteC(String deporteC) {
        this.deporteC = deporteC;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getEstadoR() {
        return estadoR;
    }

    public void setEstadoR(String estadoR) {
        this.estadoR = estadoR;
    }
    
    
}
