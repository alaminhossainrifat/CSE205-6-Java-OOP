package Question6;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = scanner.nextInt();

        if (num < 1) {
            System.out.println("Please enter a positive number greater than 0.");
        } else {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }

            System.out.println("The sum of natural numbers is: " + sum);
        }

        scanner.close();
    }
}

