// Write a Java program to check whether a year is a leap year or not.

import java.util.Scanner;

public class Answer12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double year;

        System.out.println("Enter Year to check leap year: ");
        year = scanner.nextDouble();

        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
        scanner.close();
    }
}
