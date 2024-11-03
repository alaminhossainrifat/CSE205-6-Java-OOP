// Write a Java program to change temperature from Fahrenheit to Celsius.
import java.util.*;
public class Answer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float Celsius,Fahrenheit;

        System.out.print("Enter Fahrenheit: ");
        Fahrenheit = scanner.nextFloat();

        Celsius = (Fahrenheit - 32) * 5/9;

        System.out.println("Celsius: "+Celsius);

        scanner.close();
    }
}
