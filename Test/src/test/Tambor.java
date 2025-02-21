/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author jv
 */
public class Tambor extends Instrumento{
    public Tambor(String nombre){
        super(nombre, "Percusión");
    }
    
    @Override
    public void tocar(){
        super.tocar();
        System.out.println("Porompom porompopero");
    }
}
