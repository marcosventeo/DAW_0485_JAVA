/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author jv
 */
public class Arquero extends Personatge{
    public Arquero(String nom, Integer nivell, Integer vida, Habilitat habilitat){
        super (nom, nivell, vida, habilitat);
    }
    @Override
    public void accioEspecial(){
        System.out.println(getNom() + "S'ha llençat una flecha");
    }
    
}
