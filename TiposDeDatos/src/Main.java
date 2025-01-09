import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 0;
        float numberFloat = 3.2f;
        String word = "Hello Angel";

        // Definir un objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero entero: " + number);
        System.out.println("Palabra: " + word);
        System.out.println("Numero flotante: " + numberFloat);

        // Leer un entero
        System.out.println("Ingrese un numero entero:");
        number = sc.nextInt();

        // Leer un flotante
        System.out.println("Ingresa un numero con punto decimal: ");
        numberFloat = sc.nextFloat();


        // Leer una frase
        sc.nextLine();
        System.out.println("Ingresa una palabra:");
        word = sc.nextLine();

        System.out.println("Numero entero: " + number);
        System.out.println("Palabra: " + word);
        System.out.println("Numero flotante: " + numberFloat);
    }
}