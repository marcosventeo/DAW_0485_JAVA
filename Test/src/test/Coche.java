/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author jv
 */
public class Coche extends Vehiculo{
    private String color;
    private Integer puertas;
    
    public Coche(String marca, String matricula, Integer potencia, String color, Integer puertas){
        super(marca,matricula,potencia);
        this.color = color;
        this.puertas = puertas;
    }
    
    public String getColor(){
        return color;
    }
    
    
    
    public Integer getPuertas(){
        return puertas;
    }
    
    public void pintar(String color){
        this.color = color;
    }
    
    public void abrirMaletero(){
        System.out.println("Abriendo maletero");
    }
    
    
    
}
