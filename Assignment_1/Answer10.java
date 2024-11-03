// 

import java.util.Scanner;

public class Answer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float first, second,test;

        System.out.print("Enter First Number: ");
        first = scanner.nextFloat();
        System.out.print("Enter Second Number: ");
        second = scanner.nextFloat();

        test = first;
        first = second;
        second = test;


        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        scanner.close();
    }
}
