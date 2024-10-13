package Online3.Question11;
import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
                scanner.close();
            }
        }

        int sum = sumOfOddNumbers(array);
        System.out.println("The sum of all odd numbers in the array is: " + sum);
    }
    

    public static int sumOfOddNumbers(int[][] array) {
        int sum = 0;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    sum += array[i][j];
                }
            }
        }
        
        return sum;
    }
}

