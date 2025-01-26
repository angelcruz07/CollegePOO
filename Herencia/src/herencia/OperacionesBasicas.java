package herencia;

/**
 *
 * @author Angel
 */
public class OperacionesBasicas extends OperacionesAvanzadas {
    //Atributos 
    int result; 
    
    public OperacionesBasicas(){
        this.result = 0;
    }
    
    public int getResultado(){
        return result;
    }
    
    public int suma(int num1, int num2){
       return result = num1 + num2;
    }
    
    public int resta(int num1, int num2){
      return result = num1 - num2;
    }
    
    public int multipicacion(int num1,int num2){
        return result = num1 * num2;
    }
    
}
