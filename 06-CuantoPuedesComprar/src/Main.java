import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 0.0;

        Scanner sc = new Scanner(System.in);
        Package pack = new Package();
        String packageUser = null;

        // Pidiendo datos
        System.out.println("Ingresa el dinero que tienes disponible: ");
        money = sc.nextDouble();

        // Estableciendo los valores de mis propiedades
        pack.setMoney(money);

        // Imprimir los paquetes que puede comprar
        packageUser = pack.determinePackage(pack.getMoney());

        System.out.println(packageUser);

    }
}