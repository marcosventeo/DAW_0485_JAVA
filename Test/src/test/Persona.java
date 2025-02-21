/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author jv
 */
public class Persona {
    private String nom;
    private Integer edad;
    
    public Persona(String nom, Integer edad){
        this.nom = nom;
        this.edad = edad;
    }
    
    public String getNom(){
        return nom;
    }
    
    public Integer getEdad(){
        return edad;
    }
    public void caminar(){
        System.out.println("Estoy caminando");
    }
}
