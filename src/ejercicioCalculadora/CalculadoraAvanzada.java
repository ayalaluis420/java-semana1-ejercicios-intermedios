/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioCalculadora;

import java.util.Scanner;

/**
 *
 * @author ayala
 */
public class CalculadoraAvanzada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        int opcion;
        
        do{
            System.out.println("**********Calculadora Avanzada**********");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz cuadrada");
            System.out.println("================================");
            System.out.println("Selecciona una opción: ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese un número: ");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese el otro número: ");
                    num2 = sc.nextDouble();
                    
                    double suma = num1 + num2;
                    System.out.println("La suma de ambos numeros es: " + suma);
                    break;
                case 2:
                    System.out.println("Ingrese el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo número: ");
                    num2 = sc.nextDouble();
                    
                    double resta = num1 - num2;
                    System.out.println("La resta de ambos números es: " + resta);
                    break;
                case 3:
                    System.out.println("Ingrese el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo número: ");
                    num2 = sc.nextDouble();
                    
                    double multiplicacion = num1 * num2;
                    System.out.println("La multiplicación de ambos números es: " + multiplicacion);
                    break;
                case 4:
                    System.out.println("Ingrese el primer número: ");
                    double dividendo = sc.nextDouble();
                    System.out.println("Ingrese el segundo número: ");
                    double divisor = sc.nextDouble();
                    
                    double division = dividendo / divisor;
                    if (divisor != 0){
                        System.out.println("La división de los números es: " + division);
                    }else{
                        System.out.println("No se puede dividir un número entre 0");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el numero base: ");
                    double base = sc.nextDouble();
                    System.out.println("Ingrese el exponente: ");
                    double exponente = sc.nextDouble();
                    
                    double resultado = Math.pow(base, exponente);
                    
                    System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
                    break;
                case 6:
                    System.out.println("Ingrese un número");
                    double num = sc.nextDouble();
                    double raiz = Math.sqrt(num);
                    System.out.println("La raiz cuadrada de " + num + " es: " + raiz);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo");
            }
            System.out.println("");
        } while(opcion != 7);
        
    }
}
