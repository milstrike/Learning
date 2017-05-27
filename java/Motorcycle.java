class Vehicles{}

public class Motorcycle extends Vehicles {
    
    public static void main (String[] args){
        
        Vehicles a = new Motorcycle();
        boolean result = a instanceof Motorcycle;
        System.out.println( result );
        
    }
    
}

