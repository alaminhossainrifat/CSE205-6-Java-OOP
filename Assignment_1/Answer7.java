// Write a Java Program to display whether a number is odd or even.

import java.util.Scanner;

public class Answer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number;

        System.out.print("Enter Number: ");
        number = scanner.nextDouble();

        if (number % 2 == 0) 
            System.out.println("Even");
        else
            System.out.println("Odd");
        
        scanner.close();
    }
}
