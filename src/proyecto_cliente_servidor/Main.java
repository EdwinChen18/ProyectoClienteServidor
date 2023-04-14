/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_cliente_servidor;

import java.util.LinkedList;

/**
 *
 * @author valery
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Catalogos catalogoGeneral = new Catalogos();
        catalogoGeneral.cargarCatalogos();
        Pantalla_Inicio pi = new Pantalla_Inicio(catalogoGeneral);
        // TODO code application logic here
        pi.setVisible(true);
    }
    //
    
}
