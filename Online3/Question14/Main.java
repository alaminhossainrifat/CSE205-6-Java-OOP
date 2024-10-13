package Online3.Question14;

public class Main {

    // Function to count prime numbers in an array
    public static int countPrimes(int[] array) {
        int primeCount = 0;
        for (int num : array) {
            if (Prime.isPrime(num)) {
                primeCount++;
            }
        }
        return primeCount;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 10, 11, 12, 13, 14, 15, 16, 17};
        
        int primeCount = countPrimes(numbers);
        System.out.println("The number of prime numbers in the array is: " + primeCount);
    }
}
