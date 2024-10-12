package Question3;

public class Main {
    public static void main(String[] args) {
        
        Complex complex1 = new Complex(2.5, 3.5);
        Complex complex2 = new Complex(1.5, 2.5);

        complex1.add(complex2);
        complex2.add(complex1);
    }
}
