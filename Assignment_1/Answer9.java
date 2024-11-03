// Write a Java program to find a maximum of three numbers.

import java.util.Scanner;

public class Answer9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number1,number2,number3;

        System.out.print("Enter First Number:" );
        number1 = scanner.nextDouble();
        System.out.print("Enter Second Number:" );
        number2 = scanner.nextDouble();
        System.out.print("Enter Third Number:" );
        number3 = scanner.nextDouble();

        if( number1 >= number2 && number1 >= number3)
            System.out.println(number1 + " is the largest number.");

        else if (number2 >= number1 && number2 >= number3)
            System.out.println(number2 + " is the largest number.");

        else
            System.out.println(number3 + " is the largest number.");
            scanner.close();
    }
}
