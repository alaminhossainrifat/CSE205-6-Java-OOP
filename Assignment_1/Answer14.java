// Write a Java program to check whether a number is divisible by 5 or not.

import java.util.Scanner;

public class Answer14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;

        System.out.print("Enter number: ");
        number = scanner.nextDouble();

        if (number % 5 == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println("Not divisible");
        }
        scanner.close();
    }
}
