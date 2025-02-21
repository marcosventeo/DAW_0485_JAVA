/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author jv
 */
abstract class Producte {
    private String nomProducte;
    private double preu;
    
    public Producte(String nomProducte, double preu){
        this.nomProducte = nomProducte;
        this.preu = preu;
    }
    
    public abstract void mostrarProducte();

    public String getNomProducte() {
        return nomProducte;
    }

    public double getPreu() {
        return preu;
    }
    
    
}
