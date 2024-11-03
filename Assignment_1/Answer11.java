// Write a Java program to convert miles to kilometers.
import java.util.Scanner;

public class Answer11 {
    public static void main(String[] args) {
        double mile;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter mile: ");
		mile = scanner.nextDouble();

		double kilometer = mile * 1.60;

		System.out.println("Kilometer: "+kilometer);
        scanner.close();
    }
}
