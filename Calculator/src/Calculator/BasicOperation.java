package Calculator;

public class BasicOperation extends Operation{
    public enum OperationType {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }
    
    private final double num1;
    private final double num2;
    private final OperationType operationType;
    private double result;
    
    public BasicOperation(double num1, double num2, OperationType operationType) {
        this.num1 = num1;
        this.num2 = num2;
        this.operationType = operationType;
    }
    
    @Override
    public void calculate() {
        switch (operationType) {
            case ADD:
                result = add(num1, num2);
                break;
            case SUBTRACT:
                result = subtract(num1, num2);
                break;
            case MULTIPLY:
                result = multiply(num1, num2);
                break;
            case DIVIDE:
                result = divide(num1, num2);
                break;
        }
    }
    
    public double add(double num1, double num2){
        return num1 + num2;
    }
    
    public double subtract(double num1, double num2){
        return num1 - num2;
    }
    
    public double multiply(double num1, double num2){
        return num1 * num2;
    }
    
    public double divide(double num1, double num2){
        if(num2 == 0){
            throw new ArithmeticException("No se puede dividir por 0");
        }
        
        return num1 /  num2;
    }
    
    @Override
    public double getResult() {
        return result;
    }
}
