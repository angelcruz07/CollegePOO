package Calculator;

public class AvancedOperation {
  public enum OperationType {
    FACTORIAL,
    SQUARE_ROOT,
    POWER
  }

  private OperationType operationType;

  public AvancedOperation(OperationType operationType) {
    this.operationType = operationType;

  }

  public double squareRoot(double number) {
    if (number < 0) {
      throw new IllegalArgumentException("Number must be non-negative");
    }

    return Math.sqrt(number);
  }

  public double pow(double base, double exponent) {
    int result = 0;

    for (int i; i <= exponent; i++) {
      result *= base;
    }

    return result;

  }

  public int factorial(int number) {
    if (number < 0) {
      throw new IllegalArgumentException("Number must be non-negativo");
    }

    int result = 1;

    for (int i = 1; i <= number; i++) {
      result *= i;
    }
    return result;
  }

  public OperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

}
