package Programa;
import java.util.Scanner;
public class Programa01 {
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el rango de inicio y fin
        System.out.print("Ingresa el rango de inicio: ");
        int rangoInicio = scanner.nextInt();
        System.out.print("Ingresa el rango de fin: ");
        int rangoFin = scanner.nextInt();

        System.out.println("Numeros primos entre " + rangoInicio + " y " + rangoFin + ":");

        for (int i = rangoInicio; i <= rangoFin; i++) {
            boolean esPrimo = true; // Suponemos que el número es primo
            if (i <= 1) {
                esPrimo = false; // 0 y 1 no son primos
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false; // No es primo si tiene un divisor
                    break; // Salimos del bucle si encontramos un divisor
                }
            }
            if (esPrimo) {
                System.out.print(i + " - ");
            }
        }
        System.out.println();
    }
}
