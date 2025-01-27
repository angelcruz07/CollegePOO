package Calculator;

public class BasicOperation extends Operation {

  public enum OperationType {
    ADD, SUBTRACT, MULTIPLY, DIVIDE, FACTORIAL, SQUARE_ROOT, POWER
  }

  private OperationType operationType;
  private AvancedOperation avancedOperation;
  // For function pow
  private double num3;

  public BasicOperation(double num1, double num2, OperationType operationType) {
    super(num1, num2);
    this.operationType = operationType;
    this.avancedOperation = new AvancedOperation(AvancedOperation.OperationType.FACTORIAL);
  }

  public BasicOperation(double num1, double num2, double num3, OperationType operationType) {
    super(num1, num2);
    this.operationType = operationType;
    this.num3 = num3;
    this.avancedOperation = new AvancedOperation(AvancedOperation.OperationType.POWER);
  }

  @Override
  public void calculate() {
    switch (operationType) {
      case ADD -> setResult(add(num1, num2));
      case SUBTRACT -> setResult(subtract(num1, num2));
      case MULTIPLY -> setResult(multiply(num1, num2));
      case DIVIDE -> setResult(divide(num1, num2));
      case FACTORIAL -> {
        this.avancedOperation.setOperationType(AvancedOperation.OperationType.FACTORIAL);
        setResult(avancedOperation.factorial((int) num1));
      }
      case SQUARE_ROOT -> {
        this.avancedOperation.setOperationType(AvancedOperation.OperationType.SQUARE_ROOT);
        setResult(avancedOperation.squareRoot(num1));
      }
      case POWER -> {
        this.avancedOperation.setOperationType(AvancedOperation.OperationType.POWER);
        setResult(avancedOperation.pow(num1, num3));
      }
      default -> throw new UnsupportedOperationException("Operación no soportada");
    }
  }

  public double add(double num1, double num2) {
    return num1 + num2;
  }

  public double subtract(double num1, double num2) {
    return num1 - num2;
  }

  public double multiply(double num1, double num2) {
    return num1 * num2;
  }

  public double divide(double num1, double num2) {
    if (num2 == 0) {
      throw new ArithmeticException("No es posible dividir por cero");
    }

    return num1 / num2;
  }
}
