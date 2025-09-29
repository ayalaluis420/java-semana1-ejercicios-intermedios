/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioFactorial;

import java.util.Scanner;

/**
 *
 * @author ayala
 */
public class FactorialNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        
        System.out.println("Ingrese el numero para el factorial");
        int numero = sc.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            factorial*=i;
            
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
       
}
