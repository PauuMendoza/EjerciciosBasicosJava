/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Paulina
 * 4) Modifica la aplicación anterior, para que nos pida el nombre que queremos
 * introducir (recuerda usar JOptionPane).
 */
public class Ejercicio4_DimeTuNombre {
    
     public static void main(String[] args) {
         
         String nombre = JOptionPane.showInputDialog(null,"Ingresa tu nombre","TU NOMBRE ES" ,JOptionPane.INFORMATION_MESSAGE);
         
        JOptionPane.showMessageDialog(null, nombre);
         
     }
    
}
