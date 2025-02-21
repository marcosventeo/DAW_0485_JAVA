/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author jv
 */
abstract class Vehiculo {

    private String marca;
    private int any;

    public Vehiculo(String marca, int any) {
        this.marca = marca;
        this.any = any;
    }

    public String getMarca() {
        return marca;
    }

    public int getAny() {
        return any;
    }

    public void mostrarInfo() {
        System.out.println("Info del vehiculo");
    }

    abstract void mover();

}
