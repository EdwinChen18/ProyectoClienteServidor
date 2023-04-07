
package proyecto_cliente_servidor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

/**
 *
 * @author Usuario
 */
public class Catalogos {
    private LinkedList<CatalogoDeportes> catalogoDeportes ;
    private LinkedList<CatalogoDeportistas> catalogoDeportistas ;
    private LinkedList<CatalogoPadres> catalogoPadres;
    private LinkedList<CatalogoRutinas> catalogoRutinas;
    private RegistroUsuarios registro ;

    public Catalogos() {
        catalogoDeportes = new LinkedList<>();
        catalogoDeportistas = new LinkedList<>();
        catalogoPadres = new LinkedList<>();
        catalogoRutinas = new LinkedList<>();
        registro = new RegistroUsuarios();
    }

    public LinkedList<CatalogoDeportes> getCatalogoDeportes() {
        return catalogoDeportes;
    }

    public LinkedList<CatalogoDeportistas> getCatalogoDeportistas() {
        return catalogoDeportistas;
    }

    public LinkedList<CatalogoPadres> getCatalogoPadres() {
        return catalogoPadres;
    }

    public LinkedList<CatalogoRutinas> getCatalogoRutinas() {
        return catalogoRutinas;
    }

    public RegistroUsuarios getRegistro() {
        return registro;
    }
    
    public void guardarCatalogos() {
        guardarCatalogoDeportes();
        guardarCatalogoDeportistas();
        guardarCatalogoPadres();
        guardarCatalogoRutinas();
    }
     public void cargarCatalogos() {
        cargarCatalogoDeportes();
        cargarCatalogoDeportistas();
        cargarCatalogoPadres();
        cargarCatalogoRutinas();
    }
    
    private void guardarCatalogoDeportes() {
        try {
            FileOutputStream fos = new FileOutputStream("catalogo_deportes.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (CatalogoDeportes c : catalogoDeportes) {
                oos.writeObject(c);
            }
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
           // System.out.println("Error al guardar el catálogo de deportes");
        }
    }

    private void guardarCatalogoDeportistas() {
        try {
            FileOutputStream fos = new FileOutputStream("catalogo_deportistas.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (CatalogoDeportistas c : catalogoDeportistas) {
                oos.writeObject(c);
            }
            oos.close();
        } catch (Exception e) {
           System.out.println("Error al guardar el catálogo de deportistas");
        }
    }

    private void guardarCatalogoPadres() {
        try {
            FileOutputStream fos = new FileOutputStream("catalogo_padres.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (CatalogoPadres c : catalogoPadres) {
                oos.writeObject(c);
            }
            oos.close();
        } catch (Exception e) {
            System.out.println("Error al guardar el catálogo de padres");
        }
    }

    private void guardarCatalogoRutinas() {
        try {
            FileOutputStream fos = new FileOutputStream("catalogo_rutinas.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (CatalogoRutinas c : catalogoRutinas) {
                oos.writeObject(c);
            }
            oos.close();
        } catch (Exception e) {
            System.out.println("Error al guardar el catálogo de rutinas");
        }
    }
    private void cargarCatalogoDeportes() {
        try {
            FileInputStream fis = new FileInputStream("catalogo_deportes.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            CatalogoDeportes c;
            while ((c = (CatalogoDeportes) ois.readObject()) != null) {
                catalogoDeportes.add(c);
            }
            ois.close();
        } catch (Exception e) {
            // Se maneja la excepción EOFException, que se lanza al llegar al final del archivo.
            // No es un error en este caso, así que no se imprime nada.
            if (!(e instanceof java.io.EOFException)) {
                e.printStackTrace();
                System.out.println("Error al cargar el catálogo de catalogoDeportes");;
            }
        }
    }

    private void cargarCatalogoDeportistas() {
        try {
            FileInputStream fis = new FileInputStream("catalogo_deportistas.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            CatalogoDeportistas c;
            while ((c = (CatalogoDeportistas) ois.readObject()) != null) {
                catalogoDeportistas.add(c);
            }
            ois.close();
        } catch (Exception e) {
            if (!(e instanceof java.io.EOFException)) {
                System.out.println("Error al cargar el catálogo de catalogoDeportistas");
            }
        }
    }

    private void cargarCatalogoPadres() {
        try {
            FileInputStream fis = new FileInputStream("catalogo_padres.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            CatalogoPadres c;
            while ((c = (CatalogoPadres) ois.readObject()) != null) {
                catalogoPadres.add(c);
            }
            ois.close();
        } catch (Exception e) {
            if (!(e instanceof java.io.EOFException)) {
                System.out.println("Error al cargar el catálogo de catalogoPadres");
            }
        }
    }

    private void cargarCatalogoRutinas() {
        try {
            FileInputStream fis = new FileInputStream("catalogo_rutinas.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            CatalogoRutinas c;
            while ((c = (CatalogoRutinas) ois.readObject()) != null) {
                catalogoRutinas.add(c);
            }
            ois.close();
        } catch (Exception e) {
            if (!(e instanceof java.io.EOFException)) {
                System.out.println("Error al cargar el catálogo de rutinas");
            }
        }
    }
    
    
}
