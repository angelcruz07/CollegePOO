import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bonus = 0;
        double salary = 0;
        int yearsOfService = 0;

        Bono employeeBonus = new Bono();

        System.out.println("Ingrese el salario del empleado:");
        salary = sc.nextDouble();
        employeeBonus.setSueldo(salary);

        System.out.println("Ingrese la antiguedad del empleado:");
        yearsOfService = sc.nextInt();

        employeeBonus.setAntiguedad(yearsOfService);

        bonus = employeeBonus.calcularBono(salary, yearsOfService);

        System.out.println("El bono del empleado es: " + bonus);
    }
}