package herencia;


/**
 *
 * @author Angel
 */
public class OperacionesAvanzadas {
    
    double resultado;
    
    public OperacionesAvanzadas() {

    }
    
    public double getResult()  {
        return resultado; 
    }
    
    public double raiz(double num){
       return resultado = Math.sqrt(num);
    }
    
    public double potencia(double base, int exponente) {
       double result = 1;
       for(int i = 0; i < exponente; i++) {
           result *= base;
       }
       return result;
    } 
    
    public double factorial() {
     return 0;
    }
    
}
