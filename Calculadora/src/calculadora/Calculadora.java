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
 * @author jv
 */
public class Calculadora extends JFrame{
    private JTextField textA, textB, textResul;
    private JButton bSuma;
    
    public Calculadora(String titulo){
        setTitle(titulo);
        setSize(300,200); 
        // FINALIZAR APLICACIÓN AL CERRAR CON LA X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2,10,10));
        
        //Etiqueta del primer valor
        add(new JLabel("Valor A:"));
        textA = new JTextField();
        add(textA);
         //Etiqueta del segundo valor
        add(new JLabel("Valor B:"));
        textB = new JTextField();
        add(textB);
        
        add(new JLabel(""));
        bSuma = new JButton("+");
        add(bSuma);
        
        bSuma.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                  
                    calcular();
                 }
        });
        
        add(new JLabel("Resultado:"));
        textResul = new JTextField();
        add(textResul);
    }
    
    private void calcular(){
        int iA = Integer.parseInt(textA.getText());
        int iB = Integer.parseInt(textB.getText());
        int resultado = iA + iB;
        textResul.setText(String.valueOf(resultado));
    }
    
    
    
}
