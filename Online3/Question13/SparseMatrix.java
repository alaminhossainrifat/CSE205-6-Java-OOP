package Online3.Question13;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {0, 0, 2},
            {3, 0, 0}
        };

        boolean sparse = isSparse(matrix);
        String result = sparse ? "sparse." : "not sparse.";
        System.out.println("The matrix is " + result);

    }

    public static boolean isSparse(int[][] matrix) {
        int zeroCount = 0;
        int totalElements = matrix.length * matrix[0].length;

        for (int[] row : matrix) {
            for (int element : row) {
                if (element == 0) {
                    zeroCount++;
                }
            }
        }

        return zeroCount > totalElements / 2;
    }
}

