package herencia;

/**
 *
 * @author Angel
 */
public class Herencia {
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a  = 6, b = 16, r = 0;
        double potencia;
   
        OperacionesBasicas operacion = new OperacionesBasicas();
        potencia = operacion.potencia(2, 2);

        System.out.println("La potencia es " + potencia);
    }
}
