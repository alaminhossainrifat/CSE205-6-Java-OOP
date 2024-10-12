package Question2;

public class Factorial {

    public static void main(String[] args) {
        int number = 7;
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int number) {
        long fact = 1;
        for (int i = 2; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}

