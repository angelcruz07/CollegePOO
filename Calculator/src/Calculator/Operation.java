package Calculator;

public abstract class Operation {
  protected double num1;
  protected double num2;
  protected double result;

  public Operation() {

  }

  public double getResult() {
    return result;
  }

  protected void setResult(double result) {
    this.result = result;
  }

  // Método abstracto que debe ser implementado por las subclases
  public abstract void calculate();
}
