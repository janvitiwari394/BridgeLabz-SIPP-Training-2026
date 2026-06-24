import java.util.Scanner;

public class MatrixOperations {

    // Create Random Matrix
    static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); // 0-9
            }
        }
        return matrix;
    }

    // Display Matrix
    static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Addition
    static int[][] addMatrix(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Subtraction
    static int[][] subtractMatrix(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Multiplication
    static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int common = a[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = sc.nextInt();

        System.out.print("Cols: ");
        int cols = sc.nextInt();

        int[][] A = createMatrix(rows, cols);
        int[][] B = createMatrix(rows, cols);

        System.out.println("\nMatrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nAddition:");
        displayMatrix(addMatrix(A, B));

        System.out.println("\nSubtraction:");
        displayMatrix(subtractMatrix(A, B));

        System.out.println("\nMultiplication:");
        displayMatrix(multiplyMatrix(A, B));
    }
}