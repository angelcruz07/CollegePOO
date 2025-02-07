package interfaces;
import java.util.Scanner;


public class JuegoAdivinaElNumero implements Game {
    private int numAdivina;
    private Scanner teclado;
    private int intentos;

    public JuegoAdivinaElNumero(){
        teclado = new Scanner(System.in);
    }

    @Override
    public void init() {
        numAdivina = 1 + (int) (Math.random() * 100);
    }

    @Override
    public void play() {
        int numero;
        do {
            System.out.print("Adivina un número entre 1 y 100:");
            numero = teclado.nextInt();
            if (numAdivina < numero)
                System.out.println("El número a adivinar es menor");
            else if (numAdivina > numero)
                System.out.println("El número a adivinar es mayor");
            intentos++;
        } while (numero != numAdivina);
    }

    @Override
    public void finish() {
        System.out.println("Ganaste luego de " + intentos + " intentos");
    }
    
}
