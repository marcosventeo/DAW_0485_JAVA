/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author jv
 */
public class Bicicleta extends Vehiculo {

    public Bicicleta(String marca, int any) {
        super(marca, any);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }

    @Override
    public void mover() {
        System.out.println("Riin riin");
    }

}
