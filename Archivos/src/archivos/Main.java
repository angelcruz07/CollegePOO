package archivos;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File archivo = null;
        String ruta = "C:\\Users\\Angel\\IdeaProjects\\POO\\Libros\\Libros.txt";

        MetodoArchivos ma = new MetodoArchivos();
//        ma.crearArchivo(archivo, ruta);
//        ma.escribir(ruta);
        ma.anexarDatos(ruta);
    }
}
