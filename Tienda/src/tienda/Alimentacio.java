/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author jv
 */
public class Alimentacio extends Producte implements Operacions {

    public Alimentacio(String nomProducte, double preu) {
        super(nomProducte, preu);
    }

    @Override
    public void mostrarProducte() {
        System.out.println("Alimentació: " + super.getNomProducte() + " - " + super.getPreu());
    }

    @Override
    public void registrar() {
        System.out.println("Alimentació: " + super.getNomProducte() + " afegit a l'inventari.");
    }

    @Override
    public void eliminar() {
        System.out.println("Alimentació: " + super.getNomProducte() + " eliminat de l'inventari.");
    }

}
