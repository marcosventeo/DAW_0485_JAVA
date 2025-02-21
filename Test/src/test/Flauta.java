/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author jv
 */
public class Flauta extends Instrumento{
    private String material;
  
    
    public Flauta(String nombre, String material){
        super(nombre, "Viento");
        this.material = material;
        
    }
    
    public String getmaterial(){
        return material;
    }
    
    @Override
    public void tocar(){
        super.tocar();
        System.out.println("Pi piri pi piri piii");
    }
    
    
}
