/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author jv
 */
public class Alumno extends Persona{
    private Double nota;
    
    public Alumno(String nom, Integer edad, Double nota){
        super(nom, edad);
        this.nota = nota;
    }
    public Double getNota(){
        return nota;
    }
    
    public void setNota(Double nota){
        this.nota = nota;
    }
    
    public void estudiar(){
        System.out.println("Estoy estudiando");
    }
    
    public void caminar(){
        super.caminar();
        System.out.println("Caminando como alumno");
    }
    
    
}
