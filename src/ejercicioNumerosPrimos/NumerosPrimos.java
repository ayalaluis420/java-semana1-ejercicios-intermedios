/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioNumerosPrimos;
import java.util.Scanner;
/**
 *
 * @author ayala
 */
public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Ingrese un número para determinar si es primo: ");
        numero = sc.nextInt();
        
        boolean esPrimo = true;
        
        if (numero <= 1){
            esPrimo = false;
        }else{
            for (int i = 2; i < numero; i++) {
                if(numero % i == 0){
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo){
            System.out.println("El número es primo");
        }else{
            System.out.println("El número no es primo");
        }
    }
}
