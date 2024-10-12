package Question7;

public class Main {
    
    public static void main(String[] args) {
        
        Fraction fraction1 = new Fraction();
        System.out.println("Fraction 1:");
        fraction1.display();
        Fraction fraction2 = new Fraction(3,4);
        System.out.println("Fraction 2:");
        fraction2.display();
        Fraction fraction3 = new Fraction(fraction2);
        System.out.println("Fraction 3:");  
        fraction3.display();
    }
}
