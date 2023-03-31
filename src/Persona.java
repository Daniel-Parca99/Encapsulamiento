/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Persona {
    private String nombre;
    private String dni;
    private double peso;
    
    /**
     * Esta funcion permite encapsular el nombre de la persona
     * @return
     */
    
    public String getNombre(){
    return this.nombre;
    }
 
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
