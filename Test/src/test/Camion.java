/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author jv
 */
public class Camion extends Vehiculo{
    
    private Integer carga;
    
    public Camion(String marca, String matricula, Integer potencia, Integer carga){
        super(marca,matricula,potencia);
        this.carga = carga;
    }
    
    public Integer getCarga(){
        return carga;
    }
    
    public void setCarga(Integer carga){
        this.carga = carga;
    }
      
}
