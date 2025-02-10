import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {
        int a = 7, b = 0, number = 0;
        String name = "";

        Scanner sc = new Scanner(System.in);

        try {
            int div = a/b;
            System.out.println("Resultado: " + div); 
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
        }
        
        boolean validInput = false;
        
        while (!validInput) {
            try {
            System.out.println("Ingrese tu nombre: ");
            name = sc.nextLine();

            System.out.println("Ingresa tu edad: ");
            number = sc.nextInt();
            validInput = true;

            } catch (InputMismatchException e) {
            System.out.println("Ingrese un número valido");
            sc.next(); 
            }
            sc.nextLine();
        }
        sc.close();
    }
}