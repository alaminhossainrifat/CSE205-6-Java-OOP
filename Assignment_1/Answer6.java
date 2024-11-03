// Write a Java program to find the area and perimeter of a circle.

import java.util.Scanner;
//import java.lang.math;

public class Answer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double redius;

        System.out.print("Enter Redius: ");
        redius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * redius;
        double area = Math.PI * redius * redius;

        System.out.println("Perimeter of circle: "+perimeter);
        System.out.println("Area of circle: "+area);

        scanner.close();
    }
}
