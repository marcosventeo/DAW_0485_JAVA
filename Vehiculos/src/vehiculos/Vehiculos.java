/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

/**
 *
 * @author jv
 */
public class Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Vehiculo[] v = new Vehiculo[3];
        v[0] = new Coche("Tesla", 2020);
        v[1] = new Bicicleta("BMX", 2025);
        v[2] = new Coche("Seat", 2009);

        for (int i = 0; i < 3; i++) {
            v[i].mostrarInfo();
            v[i].mover();
            
            if(v[i] instanceof Motorizado motor){
                motor.arrancar();
                motor.parar();
            }
            
            
        }
    }

}


