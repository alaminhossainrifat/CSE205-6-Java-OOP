package Online3.Question19;

import java.util.Scanner;

class Matrix {
    private int[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }

    public void fillMatrix(Scanner scanner) {
        System.out.println("Enter values for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = scanner.nextInt();
            }
        }
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int[][] getData() {
        return data;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class MatrixOperations {
    public static Matrix multiply(Matrix a, Matrix b) {
        if (a.getCols() != b.getRows()) {
            throw new IllegalArgumentException("Matrix dimensions do not match for multiplication.");
        }

        Matrix result = new Matrix(a.getRows(), b.getCols());
        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < b.getCols(); j++) {
                for (int k = 0; k < a.getCols(); k++) {
                    result.getData()[i][j] += a.getData()[i][k] * b.getData()[k][j];
                }
            }
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int colsA = scanner.nextInt();

        System.out.print("Enter the number of rows for the second matrix: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int colsB = scanner.nextInt();

        Matrix matrixA = new Matrix(rowsA, colsA);
        Matrix matrixB = new Matrix(rowsB, colsB);

        matrixA.fillMatrix(scanner);
        matrixB.fillMatrix(scanner);

        try {
            Matrix resultMatrix = MatrixOperations.multiply(matrixA, matrixB);
            System.out.println("Resultant Matrix:");
            resultMatrix.print();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}

