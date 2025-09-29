/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioRandom;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ayala
 */
public class NumeroSecreto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1;
        
        int intentos = 0;
        int numeroUsuario;
        
        System.out.println("********* Juego de Adivinar número **********");
        
        do{
            System.out.println("Ingrese un número: ");
            numeroUsuario = sc.nextInt();
            intentos++;
            
            if (numeroUsuario  > numeroAleatorio){
                System.out.println("Demasiado alto");
            }else if (numeroUsuario < numeroAleatorio){
                System.out.println("Demasiado bajo");
            }else{
                System.out.println("¡Felicidades lo lograste en " + intentos + " intentos!");
            }
            
        } while (numeroUsuario != numeroAleatorio);
    }
}
