/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraencadenada;

/**
 *
 * @author Mks
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraEncadenada extends JFrame implements ActionListener {

    private JTextField pantalla;
    private double resultado = 0;
    private String operador = "";
    private boolean nuevaOperacion = true;

    public CalculadoraEncadenada() {
        setTitle("Calculadora Encadenada");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        pantalla = new JTextField();
        pantalla.setEditable(false);
        pantalla.setFont(new Font("Arial", Font.BOLD, 24));
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        add(pantalla, BorderLayout.NORTH);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4, 5, 5));

        String[] botones = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "=", "+", "C"
        };

        for (String texto : botones) {
            JButton boton = new JButton(texto);
            boton.setFont(new Font("Arial", Font.BOLD, 20));
            boton.addActionListener(this);
            panelBotones.add(boton);
        }

        add(panelBotones, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String entrada = e.getActionCommand();

        if ("0123456789".contains(entrada)) {
            if (nuevaOperacion) {
                pantalla.setText(entrada);
                nuevaOperacion = false;
            } else {
                pantalla.setText(pantalla.getText() + entrada);
            }
        } else if ("+-*/".contains(entrada)) {
            if (!operador.isEmpty()) {
                calcular(Double.parseDouble(pantalla.getText()));
            } else {
                resultado = Double.parseDouble(pantalla.getText());
            }
            operador = entrada;
            nuevaOperacion = true;
        } else if ("=".equals(entrada)) {
            calcular(Double.parseDouble(pantalla.getText()));
            operador = "";
            nuevaOperacion = true;
        } else if ("C".equals(entrada)) {
            pantalla.setText("");
            resultado = 0;
            operador = "";
            nuevaOperacion = true;
        }
    }

    private void calcular(double numero) {
        switch (operador) {
            case "+": resultado += numero; break;
            case "-": resultado -= numero; break;
            case "*": resultado *= numero; break;
            case "/":
                if (numero == 0) {
                    JOptionPane.showMessageDialog(this, "No se puede dividir por cero");
                    resultado = 0;
                } else {
                    resultado /= numero;
                }
                break;
            default: resultado = numero; break;
        }
        pantalla.setText(String.valueOf(resultado));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraEncadenada().setVisible(true);
        });
    }
}
