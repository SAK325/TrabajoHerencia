/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author qfsak
 */
public class Persona {
    
    protected String nombre , apellido;
    protected int indentificacion;

    public Persona(String nombre, String apellido, int indentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.indentificacion = indentificacion;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIndentificacion() {
        return indentificacion;
    }

    public void setIndentificacion(int indentificacion) {
        this.indentificacion = indentificacion;
    }
 
    
}
