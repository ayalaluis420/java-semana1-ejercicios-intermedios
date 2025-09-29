/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioCalificaciones;

import java.util.Scanner;

/**
 *
 * @author ayala
 */
public class EstadisticaCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de estudiantes: ");
        int n_estudiantes = sc.nextInt();
        
        double suma = 0;
        double notaMax, notaMin;

        // Pedir la primera nota para tener la referencia cual es la nota mayor y menor
        System.out.print("Ingrese la nota del estudiante 1: ");
        double nota = sc.nextDouble();

        suma += nota;
        notaMax = nota;  // inicializamos con la primera nota
        notaMin = nota;

        int contador = 1;
        
        do{
            System.out.println("Ingrese las notas del estudiante " + (contador + 1) + ": ");
            nota = sc.nextDouble();
            
            // Se va incrementando las notas que se van agregando
            suma += nota;
            
            if(nota > notaMax){
                notaMax = nota;
            }
            
            if (nota < notaMin){
                notaMin = nota;
            }
            
            contador++;
        }while(contador < n_estudiantes);
        
        double promedio = suma/n_estudiantes;
        
        System.out.println("********** Información de Notas **********");
        System.out.println("El promedio general es: " + promedio);
        System.out.println("La nota más alta es: " + notaMax);
        System.out.println("La nota más baja es: " + notaMin);
    }
}
