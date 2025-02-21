/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author jv
 */
abstract class Animal {
    private String nom;
    
    public Animal(String nom){
        this.nom = nom;
    }
    
    abstract void mover();
    
    void respirar(){
        System.out.println(nom + " esta respirando");
    }
    
}
