/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author jv
 */
abstract class Usuari {

    protected String nom;
    static int identificador=0;

    public Usuari(String nom) {
        this.nom = nom;
        identificador++;
    }

    public abstract void mostrarDades();

    public void saludar() {
        System.out.println("Hola, sóc " + nom);
    }
    
    public String getNom(){
        return nom;
    }

}
