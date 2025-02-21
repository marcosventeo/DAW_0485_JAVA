/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author jv
 */
public class Coche extends Vehiculo implements Motorizado{

    public Coche(String marca, int any) {
        super(marca, any);
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
    }
    
    @Override
    public void mover() {
       System.out.println("Run run");
    }
    
    @Override
    public void arrancar(){
        System.out.println("Arrancando");
    }
    
    @Override
    public void parar(){
        System.out.println("Parando");
    }  
}
