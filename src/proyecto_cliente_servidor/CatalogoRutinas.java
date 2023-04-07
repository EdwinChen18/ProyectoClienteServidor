
package proyecto_cliente_servidor;

import java.io.Serializable;


public class CatalogoRutinas implements Serializable  {
    
    private String descrip;
    private String deporteC;
    private int tiempo;
    private String estadoR;

    public CatalogoRutinas(String descrip, String deporteC, int tiempo, String estadoR) {
        this.descrip = descrip;
        this.deporteC = deporteC;
        this.tiempo = tiempo;
        this.estadoR = estadoR;
    }
    
    public CatalogoRutinas(){
        
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
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
