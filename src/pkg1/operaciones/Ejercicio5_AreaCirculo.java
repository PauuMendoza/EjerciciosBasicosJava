/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operaciones;

import java.util.Scanner;

/**
 *
 * @author Paulina
 * 5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se 
 * pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
 * Usa la constante PI y el método pow de Math.
 */
public class Ejercicio5_AreaCirculo {
    
     public static void main(String[] args) {
         Scanner tec=new Scanner (System.in);
         
         double radio, operacion;
         double pi=3.1416;
         
         System.out.println("Ingresa el valor del radio: ");
         radio = tec.nextDouble();
         
         operacion = Math.pow(radio, 2)*pi;//base, exponente
         
         System.out.println("El area del circulo es : "+operacion+" por unidad cuadrada");
         
         
     }
    
}
