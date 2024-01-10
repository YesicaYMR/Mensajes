/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Yesica
 */
public class Email {
    private String de;
    private String para;
    private String asunto;
    private String fecha;
    private String mensaje;
    boolean leido;

    public Email(String de, String para, String asunto, String fecha, String mensaje) {
        this.de = de;
        this.para = para;
        this.asunto = asunto;
        this.fecha = fecha;
        this.mensaje = mensaje;
        leido=false;
    }

    public String getDe() {
        return de;
    }

    public String getPara() {
        return para;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public boolean isLeido() {
        return leido;
    }

    
    
    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return de;
    }
    
    
    
    
}
