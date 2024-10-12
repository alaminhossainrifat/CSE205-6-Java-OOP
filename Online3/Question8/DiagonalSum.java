package Online3.Question8;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int sum = calculateDiagonalSum(matrix);
        System.out.println("Sum of diagonal elements: " + sum);
    }

    public static int calculateDiagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i]; 
            sum += matrix[i][n - 1 - i];
        }

        if (n % 2 != 0) {
            sum -= matrix[n / 2][n / 2];
        }

        return sum;
    }
}

