/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author jv
 */
public class Guerrer extends Personatge{
    public Guerrer(String nom, Integer nivell, Integer vida, Habilitat habilitat){
        super (nom, nivell, vida, habilitat);
    }
    @Override
    public void accioEspecial(){
        System.out.println(getNom() + "S'ha llençat un cop");
    }
    
}
