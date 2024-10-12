package Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isBuzzNumber(number)) {
            System.out.println(number + " is a Buzz number.");
        } else {
            System.out.println(number + " is not a Buzz number.");
        }
        
        scanner.close();
    }

    public static boolean isBuzzNumber(int num) {
        return (num % 7 == 0 || num % 10 == 7);
    }
}
