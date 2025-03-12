/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Mks
 */
public class Calculadora extends JFrame {

    private JTextField textField1, textField2, resultField;
    private JButton sumaButton;

    public Calculadora() {
        setTitle("Calculadora Bàsica");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 2, 2));

        //AÑADIMOS PARA INSERTAR LOS VALORES DE A
        add(new JLabel("Valor A:"));
        textField1 = new JTextField();
        add(textField1);

        //AÑADIMOS PARA INSERTAR LOS VALORES DE A
        add(new JLabel("Valor B:"));
        textField2 = new JTextField();
        add(textField2);

      
       add(new JLabel(""));
        //Boton suma
        sumaButton = new JButton("+");
        add(sumaButton);

        //AÑADIMOS PARA mostrar resultado
        add(new JLabel("Resultado:"));
        resultField = new JTextField();
        add(resultField);

        sumaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular();

            }

        });

    }

    private void calcular() {
        int iA = Integer.parseInt(textField1.getText());
        int iB = Integer.parseInt(textField2.getText());
        int resultat = iA + iB;
        resultField.setText(String.valueOf(resultat));

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculadora().setVisible(true));
    }

}
