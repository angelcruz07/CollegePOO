package calculadora;

public class AvancedOperation {

  public AvancedOperation() {

  }

  public double potencia(int base, int exponente) {
    double result = 1;
    
    for(; exponente != 0; --exponente){
        result *= base;
    }
    
    return result;
  }
  
  public double raiz(int number) {
    if (number < 0) {
      throw new IllegalArgumentException("El número debe ser no negativo para calcular la raíz cuadrada.");
    }
    return Math.sqrt(number);
  }
  
    public int factorial(int number) {
    if (number < 0) {
      throw new IllegalArgumentException("El número debe ser positivo para calcular el factorial.");
    }
    
    int result = 1;

    for (int i = 1; i <= number; i++) {
      result *= i;
    }
    return result;
   }
}
