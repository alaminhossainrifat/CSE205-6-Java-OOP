package Online3.Question5;

public class ArraySum {
    public static void main(String[] args) {
        int[][] array1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] array2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        int[][] sumArray = sumArrays(array1, array2);

        System.out.println("Sum of the two arrays:");
        for (int i = 0; i < sumArray.length; i++) {
            for (int j = 0; j < sumArray[i].length; j++) {
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] sumArrays(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
}
