package Calculator;

public class Calculator {

  public static void main(String[] args) {
    BasicOperation operacion = new BasicOperation(5, 3, BasicOperation.OperationType.ADD);
    operacion.calculate();
    System.out.println("Resultado: " + operacion.getResult()); 
  }
}
