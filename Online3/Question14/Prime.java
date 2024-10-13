package Online3.Question14;

public class Prime {
    
    public static boolean isPrime(int number) {
        if (number <= 1) return false; 
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
