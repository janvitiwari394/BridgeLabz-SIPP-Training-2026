import java.util.Random;

public class MatrixOperations {

    public static int[][] createMatrix(int rows, int cols) {
        Random r = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = r.nextInt(10) + 1;
            }
        }
        return matrix;
    }

    public static void display(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] t = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                t[j][i] = matrix[i][j];
            }
        }
        return t;
    }

    public static int determinant2x2(int[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    public static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    public static void main(String[] args) {
        int[][] matrix = createMatrix(3, 3);

        System.out.println("Original Matrix:");
        display(matrix);

        System.out.println("Transpose:");
        display(transpose(matrix));

        System.out.println("Determinant: " + determinant3x3(matrix));
    }
}