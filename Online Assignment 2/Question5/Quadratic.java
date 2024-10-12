package Question5;


import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Roots are real and different.\nRoot 1: %.2f\nRoot 2: %.2f\n", x1, x2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Roots are real and the same.\nRoot: %.2f\n", root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("Roots are complex and different.\nRoot 1: %.2f + %.2fi\nRoot 2: %.2f - %.2fi\n", realPart, imaginaryPart, realPart, imaginaryPart);
        }

        scanner.close();
    }
}
