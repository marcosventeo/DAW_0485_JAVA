/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author jv
 */
public class Instrumento {
    private String nombre;
    private String tipo;
      private static int contador = 0;
    
    public Instrumento(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        contador++;
       
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public void tocar(){
        System.out.println("Tocando el instrumento: " + nombre);
    }
     public static int getContador(){
        return contador;
    }
   
    
}
