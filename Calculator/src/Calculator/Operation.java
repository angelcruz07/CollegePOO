package Calculator;

public abstract class Operation {
  protected double num1;
  protected double num2;
  protected double result;

  public Operation(double num1, double num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  public double getResult() {
    return result;
  }

  public void setResult(double result) {
    this.result = result;
  }

  public abstract void calculate();
}
