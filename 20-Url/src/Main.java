import java.util.Scanner;
import com.acortador.Acortar;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Acortar acortador = new Acortar();

    System.out.println("******* Acortador de URL *******");
    System.out.println("Ingrese la URL a acortar:");
    String longURL = sc.nextLine();
    String shortURL = acortador.shortUrl(longURL);

    System.out.println("URL acortada: " + shortURL);
  }
}
