package archivos;

import java.io.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        File archivo = null;
        String ruta = "C:\\Users\\Angel\\IdeaProjects\\POO\\Libros\\Libros.txt";
        boolean encontrado = false;
        
        MetodoArchivos ma = new MetodoArchivos();
//        ma.crearArchivo(archivo, ruta);
//        ma.escribir(ruta);
//        ma.anexarDatos(ruta);
        encontrado = ma.buscar(ruta, "L01");
        
        if(encontrado)
            JOptionPane.showMessageDialog(null, "Libro encontrado");
        else
           JOptionPane.showMessageDialog(null, "No se encuentra registro"); 
    }
}
