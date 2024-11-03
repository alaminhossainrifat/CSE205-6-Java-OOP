// Write a Java Program to check if a number is Positive or Negative.

import java.util.Scanner;

public class Answer8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number;

        System.out.print("Enter Number: ");
        number = scanner.nextDouble();

        if (number > 0) 
            System.out.println("Positive");
         else if(number < 0) 
            System.out.println("Negative");
        else
            System.out.println("Please enter number.");
        
        scanner.close();
    }
}