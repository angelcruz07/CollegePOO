import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double amount = 0;
    double result = 0;
    Currency usd = new Currency("USD", "$", "United States");
    Currency mxn = new Currency("MXN", "$", "Mexico");
    Currency eur = new Currency("EUR", "€", "Eurozone");

    CurrencyConvert convert = new CurrencyConvert(20.50, 21.36);

    System.out.println("Conversor de Divisas");
    System.out.println("1. Convertir MXN a USD");
    System.out.println("2. Convertir MXN a EUR");
    System.out.println("3. Convertir USD a MXN");
    System.out.println("4. Convertir EUR a MXN");

    System.out.print("Seleccione una opción (1 o 4): ");
    int option = sc.nextInt();

    switch (option) {
      case 1:
        System.out.println("Ingrese la cantidad en MXN: ");
        amount = sc.nextDouble();
        result = convert.mxnToUsd(amount);
        System.out.printf("%.2f %s equivalen a %.2f %s%n", amount, mxn.getSymbol(), result, usd.getSymbol());
        break;
      case 2:
        System.out.println("Ingrese la cantidad en MXN");
        amount = sc.nextDouble();
        result = convert.mxnToEur(amount);
        System.out.printf("%.2f %s equivalen a %.2f %s%n", amount, mxn.getSymbol(), result, eur.getSymbol());
        break;
      default:
        System.out.println("Opción invalida");
        break;
    }

    sc.close();
  }
}
