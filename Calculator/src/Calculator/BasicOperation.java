package Calculator;

public class BasicOperation extends Operation {

  public enum OperationType {
    ADD, SUBTRACT, MULTIPLY, DIVIDE
  }

  private OperationType operationType;

  public BasicOperation(double num1, double num2, OperationType operationType) {
    super(num1, num2);
    this.operationType = operationType;
  }

  @Override
  public void calculate() {
    switch (operationType) {
      case ADD:
        setResult(add(num1, num2));
        break;
      case SUBTRACT:
        setResult(subtract(num1, num2));
        break;
      case MULTIPLY:
        setResult(multiply(num1, num2));
        break;
      case DIVIDE:
        setResult(divide(num1, num2));
        break;
      default:
        throw new UnsupportedOperationException("Operación no soportada");
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
