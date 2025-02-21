/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author jv
 */
public class Electronics extends Producte implements Operacions{

    public Electronics(String nomProducte, double preu) {
        super(nomProducte, preu);
    }
    
    @Override
    public void mostrarProducte(){
        System.out.println("Electrònic: " + super.getNomProducte() + " - " + super.getPreu());
    }
    
    @Override
    public void registrar(){
        System.out.println("Electrònic: " + super.getNomProducte() + " afegit a l'inventari." );
    }
    
    @Override
    public void eliminar(){
        System.out.println("Electrònic: " + super.getNomProducte() + " eliminat de l'inventari." );
     }
    
}
