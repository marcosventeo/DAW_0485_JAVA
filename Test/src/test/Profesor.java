/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author jv
 */
public class Profesor extends Persona{
    private Integer aula;
    
    
    public Profesor(String nom, Integer edad){
        super(nom, edad);
    }
      
    public void setAula(Integer aula){
        this.aula = aula;
    }
    public Integer getAula(){
        return aula;
    }
    
    public void corregir(){
        System.out.println("Estoy corrigiendo");
    }
}
