package calculadora;

public class BasicOperation extends AvancedOperation {
  int result = 0;

  public BasicOperation() {
    this.result = 0;
  }

   public int getResult() {
        return result;
   }
  
  public int suma(int a, int b) {
    return a + b;
  }

  public int resta(int a, int b) {
    return a - b;
  }

  public int multiplicación(int a, int b) {
    return a * b;
  }

  public double division(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("No se puede dividir por cero");
    }

    return a / b;
  }

}
