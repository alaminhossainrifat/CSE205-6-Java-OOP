//Write a Java program to add two numbers.

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1,n2,add;
        System.out.print("Enter Number1: ");
        n1 = scanner.nextDouble();
        System.out.print("Enter Number2: ");
        n2 = scanner.nextDouble();

        add =n1 + n2;

        System.out.println("Result = "+add);

        scanner.close();
    }
}
