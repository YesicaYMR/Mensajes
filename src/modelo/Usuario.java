/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Yesica
 */
public class Usuario {

    String nombre;
    String contra;
    int perfil;//1-Administrador    2-Usuario estandar
    String email;
    ArrayList<Email>emails;

    public Usuario(String nombre, String contra, int perfil, String email) {
        this.nombre = nombre;
        this.contra = contra;
        this.perfil = perfil;
        this.email=email;
        emails=new ArrayList<>();
    }

    public Usuario(String nombre) {//me creo este constructor para el metodo buscar usuario
        this.nombre = nombre;
    }



    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override //modificas un metodo que ya existe
    public boolean equals(Object obj) {//no se puede modificar esta linea
        if (this == obj) {//compara primero si esta guardado en la misma direccion de memoria
            return true;
        }
        if (obj == null) {//compara si es nulo
            return false;
        }
        if (getClass() != obj.getClass()) {//compara si son de la misma clase
            return false;
        }
        final Usuario other = (Usuario) obj;//para este caso trata obj como un usuario
        if (!Objects.equals(this.nombre, other.nombre)) {//compara si los login son iguales
            return false;
        }
        return true;
    }//fin metodo buscar usuario

    public String getContra() {
        return contra;
    }

    public int getPerfil() {
        return perfil;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Email> getEmails() {
        return emails;
    }
    
    

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    public void anadirEmail(Email e) {
        emails.add(e);
    }
    
    
    

    @Override
    public String toString() {
        return nombre;
    }
    
    

}
