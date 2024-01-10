/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author Yesica
 */
public class Empresa {

    private ArrayList<Usuario> usuarios;

    /**
     * Constructor
     */
    public Empresa() {
        usuarios = new ArrayList<>();
    }

    /**
     * Añade usuarios al arryList creado en el constructor
     *
     * @param u
     */
    public void anadirUsuarios(Usuario u) {
        usuarios.add(u);
    }

    /**
     * Busca si existe un usuario y devuelve el objeto tipo Usuario. Si no lo
     * encuentra, devuleve nulo
     *
     * @param login
     * @param contra
     * @return
     */
    public Usuario buscarUsuario(String login, String contra) {
        Usuario u = null;
        int pos = usuarios.indexOf(new Usuario(login));//Index of xq necesito la posicion paral uego compararlo con la contraseña
        if (pos != -1) {
            if (usuarios.get(pos).getContra().equals(contra)) {
                u = usuarios.get(pos);
            }
        }
        return u;
    }

    /**
     * Busca si existe un email para poder otorgar un email a un usuario que no
     * esté repetido
     *
     * @param email
     * @return
     */
    public boolean existeEmail(String email) {
        boolean encontrado = false;
        int pos = 0;
        while (!encontrado && pos < usuarios.size()) {
            Usuario usuario = usuarios.get(pos);
            if (usuario.getEmail().trim().equalsIgnoreCase(email)) {
                encontrado = true;
            } else {
                pos++;
            }
        }
        return encontrado;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

}
