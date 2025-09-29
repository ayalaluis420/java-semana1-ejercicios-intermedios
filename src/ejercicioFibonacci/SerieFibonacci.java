/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioFibonacci;

import java.util.Scanner;

/**
 *
 * @author ayala
 */
public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese los terminos de la serie Fibonacci que quiere que se muestren");
        int N = sc.nextInt();
        System.out.println("Ingrese el primer termino de la serie: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo termino de la serie: ");
        int b = sc.nextInt();
        
        System.out.println("********** Serie Fibonacci **********");
        
        for (int i = 0; i < N; i++) {
            
            System.out.println(a + "");
            int suma = a + b;
            a = b;
            b = suma;
        }
    }
}
