package Calculator;

public class AdvancedOperation {

  public enum OperationType {
    FACTORIAL, SQUARE_ROOT, POWER
  }

  private final double num1;
  private final double num2;
  private double result;
  private final OperationType operationType;

  public AdvancedOperation(double num1, double num2, OperationType operationType) {
    this.num1 = num1;
    this.num2 = num2;
    this.operationType = operationType;
  }

  public double getResult() {
    return result;
  }

  private void setResult(double result) {
    this.result = result;
  }

  public void calculate() {
    switch (operationType) {
      case FACTORIAL -> setResult(factorial((int) num1));
      case SQUARE_ROOT -> setResult(squareRoot(num1));
      case POWER -> setResult(power(num1, num2));
      default -> throw new UnsupportedOperationException("Operación no soportada.");
    }
  }

  private int factorial(int number) {
    if (number < 0) {
      throw new IllegalArgumentException("El número debe ser positivo para calcular el factorial.");
    }
    int result = 1;

    for (int i = 1; i <= number; i++) {
      result *= i;
    }
    return result;
  }

  private double squareRoot(double number) {
    if (number < 0) {
      throw new IllegalArgumentException("El número debe ser no negativo para calcular la raíz cuadrada.");
    }
    return Math.sqrt(number);
  }

  private double power(double base, double exponent) {

    if (exponent == 0) {
      return 1;
    }
    double result = 1;

    if (exponent > 0) {
      for (int i = 0; i < exponent; i++) {
        result *= base;
      }
    } else {
      for (int i = 0; i < Math.abs(exponent); i++) {
        result *= base;
      }
      result = 1 / result;
    }

    return result;
  }
}
