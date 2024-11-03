// Write a Java program to change temperature from Celsius to Fahrenheit

import java.util.Scanner;

public class Answer3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        float Celsius,Fahrenheit;
        System.out.print("Enter Celsius: ");
        Celsius = scanner.nextFloat();

        Fahrenheit = (Celsius * 9/5)+32;
        System.out.println("Fahrenheit: "+Fahrenheit);

        scanner.close();
    }
}