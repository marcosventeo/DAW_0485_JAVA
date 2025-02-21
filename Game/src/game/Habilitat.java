/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author jv
 */
public class Habilitat {
    private String nom;
    private Integer dany;
    
    public Habilitat(String nom, Integer dany){
        this.nom = nom;
        this.dany=dany;
    }
    
    public Integer getDany(){
        return dany;
    }
    
    public void usarhabilitat(){
        System.out.println("S'ha utilitzat" + nom + 
                "i ha fet un total de" + dany + "dany");
        
    }
    
}
