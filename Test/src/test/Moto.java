/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author jv
 */
public class Moto extends Vehiculo{
    private String tipo;
    
    public Moto(String marca, String matricula, Integer potencia, String tipo){
        super(marca,matricula,potencia);
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void caballito(){
        System.out.println("Levantando rueda");
    }
    
}
