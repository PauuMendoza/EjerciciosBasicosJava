/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulina
 * 7) Lee un número por teclado y muestra por consola, el carácter al que
 * pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una
 * a.
 */
public class Ejercicio7_ASCII {
    
     public static void main(String[] args) {
         Scanner tec=new Scanner(System.in);
         
         //System.out.println("Ingresa un numero: ");
         //int numero=tec.nextInt();
         
         String numero = JOptionPane.showInputDialog(null, "Ingresa un nùmero");
         
         int numeroConvertido = Integer.parseInt(numero);
         
         char caracter = (char) numeroConvertido;
         
         //System.out.println("El nùmero en codigo ascci es: "+caracter);
         JOptionPane.showMessageDialog(null, "El nùmero en codifo ASCCI es: "+caracter);
         
}
}