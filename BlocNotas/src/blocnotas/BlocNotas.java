/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blocnotas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


/**
 *
 * @author jv
 */
public class BlocNotas extends JFrame implements ActionListener{

    private JTextArea areaTexto;
    private JFileChooser fileSelector;
    
    public BlocNotas(){
        
            //Configuración de la ventana
            setTitle("Bloc de notas");
            setSize(600,400);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            //Creación area de texto
            areaTexto = new JTextArea();
            areaTexto.setFont(new Font("Arial", Font.PLAIN, 16));
            
            //Barra de scroll con el Textarea
            JScrollPane scrollPane = new JScrollPane(areaTexto);
            
            add(scrollPane);
                       
            
            //funcion crear menu
            crearMenu();
            
            //Inicializar el selector
            fileSelector = new JFileChooser();
       
    }
    
    private void crearMenu(){
        
        // Barra del menu
        JMenuBar barraMenu = new JMenuBar();
        
        // Menus principales
        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuFormato = new JMenu("Formato");
        
        // Items del menu
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem salir = new JMenuItem("Salir");
        JMenuItem cambiarFuente = new JMenuItem("Cambiar Fuente");
        JMenuItem cambiarColor = new JMenuItem("Cambiar Color");
        
        // Añadir al menu cada item
        menuArchivo.add(abrir);
        menuArchivo.add(guardar);
        menuArchivo.add(salir);
        menuFormato.add(cambiarFuente);
        menuFormato.add(cambiarColor);
        
        // Añadir eventos
        abrir.addActionListener(this);
        guardar.addActionListener(this);
        salir.addActionListener(this);
        cambiarFuente.addActionListener(this);
        cambiarColor.addActionListener(this);
        
        // Añadir a la barra los menus
        barraMenu.add(menuArchivo);
        barraMenu.add(menuFormato);
        
        // Añadir la barra a la ventana
        setJMenuBar(barraMenu);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
       
        String evento = e.getActionCommand();
        switch(evento){
            case "Abrir":
                abrirArchivo();
                break;
            case "Guardar":
                guardarArchivo();
                break;
            case "Salir":
                dispose();
                break;
            case "Cambiar Fuente":
                cambiarFuente();
                break;
            case "Cambiar Color":
                cambiarColor();
               break;
        }
        
    }
        
    private void cambiarColor(){
        Color cNuevo = JColorChooser.showDialog(this,"Elige un color", areaTexto.getForeground());
        if(cNuevo!=null){
            areaTexto.setForeground(cNuevo);
        }
    }
    
    private void cambiarFuente(){
        String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        String fuenteSeleccionada = (String) JOptionPane.showInputDialog(this, "Elige una fuente","Fuente",JOptionPane.PLAIN_MESSAGE,null,fuentes,areaTexto.getFont().getFamily());
        
        if(fuenteSeleccionada!=null){
            String tFuente = JOptionPane.showInputDialog(this,"Introduce el tamaño",areaTexto.getFont().getSize());
            
            try{
                int tam = Integer.parseInt(tFuente);    
                areaTexto.setFont(new Font(fuenteSeleccionada,Font.PLAIN, tam));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Tamaño no valido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
    
    private void abrirArchivo(){
        int opcion =  fileSelector.showOpenDialog(this);
        if(opcion == JFileChooser.APPROVE_OPTION){
            File arx = fileSelector.getSelectedFile();
            try(BufferedReader reader = new BufferedReader(new FileReader(arx))){
                areaTexto.read(reader,null);
            }catch (IOException e){
                JOptionPane.showMessageDialog(this, "Error al abrir arvhico", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void guardarArchivo(){
        int opcion = fileSelector.showSaveDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION){
            File arx = fileSelector.getSelectedFile();
            
            try(BufferedWriter write = new BufferedWriter(new FileWriter(arx))){
                areaTexto.write(write);
            }catch (IOException e){
                JOptionPane.showMessageDialog(this, "Error al guardar archivo", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
        
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(()->{
           new BlocNotas().setVisible(true);
        });
    }
    
}
