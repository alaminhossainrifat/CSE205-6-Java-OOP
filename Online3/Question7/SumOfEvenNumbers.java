package Online3.Question7;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of array: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = sumOfEvenNumbers(numbers);

        System.out.println("The sum of even numbers is: " + sum);

        scanner.close();
    }

    public static int sumOfEvenNumbers(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (number % 2 == 0) { 
                sum += number;
            }
        }
        return sum;
    }
}

