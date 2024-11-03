// Write a Java program for the following grading system.

import java.util.Scanner;

public class Answer13 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double percentage;
         char grade;

        System.out.print("Enter the percentage: ");
        percentage = scanner.nextDouble();
        
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("The grade is: " + grade);
        scanner.close();
    }
}
