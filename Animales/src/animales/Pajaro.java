/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author jv
 */
public class Pajaro extends Animal implements Volador {

    public Pajaro(String nom) {
        super(nom);
    }

    @Override
    public void respirar() {
        super.respirar(); 
    }

    @Override
    public void mover() {
        System.out.println("Me estoy moviendo");
    }

    @Override
    public void volar() {
        System.out.println("Estoy volando");
    }

}
