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
 * 9) Lee un número por teclado que pida el precio de un producto (puede tener
 * decimales) y calcule el precio final con IVA. El IVA sera una constante que 
 * sera del 21%.
 */
public class Ejercicio9_PrecioProducto {
    
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        
        double iva, resultado;
        
        System.out.println("Ingrese el precio del producto: ");
        float precio = tec.nextFloat();
        
        iva = precio * 0.21;
        
        resultado = precio + iva;
        
        
        System.out.println("El precio con IVA incluido del 21 % es : "+resultado);
       
    }
    
}
