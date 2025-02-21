/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package errores;

/**
 *
 * @author jv
 */
public class Errores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            validarEdad(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            
        }

        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;

            int[] numeros = {1, 2, 3};

            System.out.println("Resultado: " + resultado);
            System.out.println("Indice: " + numeros[5]);
            System.out.println("FINAL...");
        } catch (ArithmeticException e) {
            System.out.println("No puedes dividir por 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de indice");
        } finally {
            System.out.println("Siempre...");
        }

    }

    public static void validarNumero(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El numero no puede ser negativo");
        }
        System.out.println("Numero correcto: " + numero);

    }
    
    
    
    public static void validarEdad(int edad) throws ErrorEdad{
        if(edad < 18){
            throw new ErrorEdad("Tienes que tener 18 años o más");
        }
        System.out.println("Edad correcta: " + edad);
        
    }

}
