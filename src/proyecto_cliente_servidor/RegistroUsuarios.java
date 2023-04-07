/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_cliente_servidor;
import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author valery
 */
public class RegistroUsuarios implements Serializable {
    
    private LinkedList<Usuario> listaUsuarios;

    public RegistroUsuarios() {
        listaUsuarios = new LinkedList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }
    //Consulta si existe el nickname
    public Usuario consultarUsuario(String nickname) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getUsuario().equals(nickname)) {
                return usuario;
            }
        }
        return null;
    }
    //Se inactiva el usuario
    public void inactivarUsuario(String nickname) {
        Usuario usuario = consultarUsuario(nickname);
        if (usuario != null) {
            if (verificarRelaciones(usuario)) {
                usuario.setEstado("Inactivo");
            } else {
                System.out.println("El usuario no puede ser inactivado porque tiene datos relacionados en otros catálogos.");
            }
        } else {
            System.out.println("El usuario no existe.");
        }
    }

    private boolean verificarRelaciones(Usuario usuario) {
        // Aquí se verificarían las relaciones del usuario con otros catálogos
        // Si el usuario tiene datos relacionados en otros catálogos, se devuelve false
        // Si el usuario no tiene datos relacionados en otros catálogos, se devuelve true
        return true;
    }
    //Lista todos los usuarios registrados en el sistema
    public void verUsuarios() {
    System.out.println("Lista de usuarios registrados:");
    for (Usuario usuario : listaUsuarios) {
        System.out.println("Nombre completo: " + usuario.getNombre() + " " + usuario.getApellidos());
        System.out.println("Nickname: " + usuario.getUsuario());
        System.out.println("Estado: " + (usuario.getEstado()));
        System.out.println("------------------------------------------------------------");
    }
}

}
