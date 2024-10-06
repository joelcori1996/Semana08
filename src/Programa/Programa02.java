package Programa;
import java.util.Scanner;
public class Programa02 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese una cadena de texto
        System.out.print("Ingresa texto: ");
        String texto = scanner.nextLine();
        // Variable para guardar las letras ya contadas
        String letrasContadas = ""; 
        // Contar la frecuencia de cada letra
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i); // Obtener el carácter en la posición i
            // Convertir la letra a minúsculas y verificar si es una letra
            if (Character.isLetter(letra)) {
                letra = Character.toLowerCase(letra); // Convertir a minúsculas
                // Verificar si la letra ya ha sido contada
                if (letrasContadas.indexOf(letra) == -1) {
                    letrasContadas += letra; // Agregar la letra a las contadas
                    // Contar cuántas veces aparece la letra en el texto
                    int contador = 0;
                    for (int j = 0; j < texto.length(); j++) {
                        if (Character.toLowerCase(texto.charAt(j)) == letra) {
                            contador++; // Incrementar el contador si coincide
                        }
                    }
                    // Imprimir la frecuencia de la letra
                    System.out.println("Letra '" + letra + "': " + contador +(contador<=1?" Vez":" Veces"));
                }
            }
        }
    }
}
