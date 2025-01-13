import java.util.Scanner;

public class Main {

    public static int menu(boolean error){
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una opcion");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Salir");

        int option = sc.nextInt();

        while(option < 0 || option > 3) {
            System.out.println("Opción invalida por favor ingrese valores entre 1 y 2");
            option = menu(true);
            sc.nextLine();
        }
        return option;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account cuenta = new Account();


        int selectedOption = menu(false);

        switch (selectedOption){
            case 1:
                System.out.println("Ingrese la cantidad a depositar");
                int cantidad = sc.nextInt();
                cuenta.depositar(cantidad);
                System.out.println("El saldo actual despues del retiro es: " + cuenta.getSaldo());
                break;
            case 2:
                System.out.println("Ingrese la cantidad a retirar");
                int cantidadRetiro = sc.nextInt();
                cuenta.retirar(cantidadRetiro);
                System.out.println("El saldo actual despues del retiro es: " + cuenta.getSaldo());
                break;
            case 3:
                System.out.println("Gracias por usar nuestros servicios");
                break;
        }
    }
}