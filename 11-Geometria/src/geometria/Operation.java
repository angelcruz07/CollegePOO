package geometria;

public class Operation {

    public Operation(){
        
    }
    
    public int generateRandomNumber(int initNumber, int finalNumber) {
        int number = 0;
        number = (int) (Math.random() * (finalNumber - initNumber + 1) + initNumber);

        return number;
    }

}
