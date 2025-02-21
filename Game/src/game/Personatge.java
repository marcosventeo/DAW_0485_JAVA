/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author jv
 */
public abstract class Personatge {
    private String nom;
    private Integer nivell;
    private Integer vida;
    private Habilitat habilitat;
    
    
    public Personatge(String nom, Integer nivell, Integer vida, Habilitat hab){
        this.nom = nom;
        this.nivell = nivell;
        this.vida = vida;
        this.habilitat = hab;
        
    }
    public void mostrarInfo(){
        System.out.println("Nom: "+ nom);
        System.out.println("nivell: "+ nivell);
        System.out.println("vida: "+ vida);
    }
    public void pujarNivell(){
        nivell++;
        vida += 10;
        System.out.println(nom + "ha pujat de nivell! Nivell actual: " + nivell);
    }
    
    public abstract void accioEspecial();
    
    public Habilitat getHabilitat() {
        return this.habilitat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNivell(Integer nivell) {
        this.nivell = nivell;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public String getNom() {
        return nom;
    }

    public Integer getNivell() {
        return nivell;
    }

    public Integer getVida() {
        return vida;
    }
    
   
}
