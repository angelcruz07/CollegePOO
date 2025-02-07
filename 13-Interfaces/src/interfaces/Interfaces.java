package interfaces;

public class Interfaces {

    public static void main(String[] args) {
        JuegoDeDados juego1 = new JuegoDeDados();
        juego1.init();
        juego1.play();
        juego1.finish();

        JuegoAdivinaElNumero juego2 = new JuegoAdivinaElNumero();
        juego2.init();
        juego2.play();
        juego2.finish();
    }
}
