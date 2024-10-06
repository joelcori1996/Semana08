package Programa;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            // Solicitar al usuario que ingrese el nombre de la figura
            System.out.print("Ingresa el nombre de la figura (triangulo, cuadrado, rectangulo): ");
            String figura = scanner.nextLine().toLowerCase(); // Convertir a minúsculas
            // Mostrar la figura correspondiente
            switch (figura) {
                case "triangulo":
                    // Imprimir triángulo usando un bucle for
                    for (int i = 1; i <= 5; i++) {
                        // Espacios en blanco
                        for (int j = i; j < 5; j++) {
                            System.out.print(" ");
                        }
                        // Estrellas
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println(); // Nueva línea después de cada fila
                    }
                    break;
                case "cuadrado":
                    // Imprimir cuadrado usando un bucle for
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (i == 0 || i == 4 || j == 0 || j == 9) {
                                System.out.print("*"); // Imprimir bordes
                            } else {
                                System.out.print(" "); // Espacios en blanco
                            }
                        }
                        System.out.println(); // Nueva línea después de cada fila
                    }
                    break;
                case "rectangulo":
                    // Imprimir rectángulo usando un bucle for
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 14; j++) {
                            if (i == 0 || i == 3 || j == 0 || j == 13) {
                                System.out.print("*"); // Imprimir bordes
                            } else {
                                System.out.print(" "); // Espacios en blanco
                            }
                        }
                        System.out.println(); // Nueva línea después de cada fila
                    }
                    break;
                default:
                    System.out.println("Figura no reconocida. Intenta de nuevo.");
                    break;
            }
            // Preguntar al usuario si desea continuar
            System.out.print("¿Deseas continuar? (si/no): ");
            respuesta = scanner.nextLine().toLowerCase(); // Convertir a minúsculas
        } while (respuesta.equals("si")); // Continuar mientras la respuesta sea "si"  
    }
}
