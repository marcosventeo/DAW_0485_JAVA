/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author jv
 */
public class Proveidor extends Usuari implements Operacions{
    
    public Proveidor(String nom) {
        super(nom);
    }

    @Override
    public void mostrarDades() {
        System.out.println("Proveidor: " + super.getNom() + "(ID: " + identificador + ")");
    }

    @Override
    public void registrar() {
        System.out.println("Proveidor " + super.getNom() + " registrat correctament");
    }

    @Override
    public void eliminar() {
        System.out.println("Proveidor " + super.getNom() + " eliminat del sistema");
    }
}
