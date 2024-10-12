package Question8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrices = 0;

        Items[] items = new Items[5];

        for (int i = 0; i < items.length; i++) {
            System.out.print("Enter code: ");
            String code = scanner.next();
            System.out.print("Enter price: ");
            int price = scanner.nextInt();

            items[i] = new Items(code, price);
            totalPrices += price;
        }

        System.out.println("\nCode\tPrice");
        System.out.println("---------------------");
        for (Items item : items) {
            System.out.println(item.getCode() + "\t" + item.getPrice());
        }

        System.out.println("---------------------");
        System.out.println("Total prices: " + totalPrices);

        scanner.close();
    }
}
