/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioCajero;

import java.util.Scanner;

/**
 *
 * @author ayala
 */
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double saldo = 500.00;
        int opcion;
        
        do{
            System.out.println("================================");
            System.out.println("        Cajero Automatico       ");
            System.out.println("================================");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("================================");
            System.out.println("Selecciona una opción");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.printf("Saldo actual: %.2f%n", saldo);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a depositar: $");
                    double deposito = sc.nextDouble();
                    if(deposito > 0){
                        saldo += deposito;
                        System.out.printf("\nDeposito exitoso. Nuevo saldo: %.2f%n", saldo);
                    }else{
                        System.out.println("Cantidad invalida");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a retirar: $");
                    double retiro = sc.nextDouble();
                    if(retiro > 0 && retiro <= saldo){
                        saldo -= retiro;
                        System.out.printf("\nRetiro exitoso. Nuevo saldo: %.2f%n", saldo);
                    }else{
                        System.out.println("Cantidad invalida o fondos insuficientes");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestros servicios.");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo");
            }
            System.out.println("");
        } while(opcion != 4);
    }
}
