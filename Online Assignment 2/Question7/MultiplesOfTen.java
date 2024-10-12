package Question7;

import java.util.Scanner;

public class MultiplesOfTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();

        System.out.println("Multiples of 10: ");

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

