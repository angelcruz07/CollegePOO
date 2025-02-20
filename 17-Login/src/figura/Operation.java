package figura;

public class Operation {
    public Operation(){
        
    }
    
    public int generateRandom(int ranMin, int ranMax){
        int number = 0;
        number = (int)  (Math.random() * (ranMax - ranMin + 1 ) + ranMin);
        return number;
    }
    
}
