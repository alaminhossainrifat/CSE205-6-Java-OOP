package Question4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int inputNumber = scanner.nextInt();
        
        ThreeDigitNumber number = new ThreeDigitNumber(inputNumber);
        number.display();
        
        scanner.close();
    }
}
