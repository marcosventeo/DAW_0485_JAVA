/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author jv
 */
public class Client extends Usuari implements Operacions {

    public Client(String nom) {
        super(nom);
    }

    @Override
    public void mostrarDades() {
        System.out.println("Client: " + super.nom + "(ID: " + identificador + ")");
    }

    @Override
    public void registrar() {
        System.out.println("Client " + super.getNom() + " registrat correctament");
    }

    @Override
    public void eliminar() {
        System.out.println("Client " + super.getNom() + " eliminat del sistema");
    }

}
