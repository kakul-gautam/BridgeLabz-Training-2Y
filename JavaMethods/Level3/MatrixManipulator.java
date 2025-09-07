package JavaMethods.Level3;

import java.util.Scanner;

public class MatrixManipulator {
    public static double[][] generateMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 1 + (int)(Math.random() * 9); 
            }
        }
        return matrix;
    }
    public static void displayMatrix(String title, double[][] matrix) {
        System.out.println("\n" + title + ":");
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }
    public static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] adj = new double[3][3];

        adj[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        adj[0][1] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        adj[0][2] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]);

        adj[1][0] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        adj[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        adj[1][2] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);

        adj[2][0] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]);
        adj[2][1] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        adj[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]);

        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] = adj[i][j] / det;

        return inv;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix size (2 or 3): ");
        int size = scanner.nextInt();

        if (size != 2 && size != 3) {
            System.out.println("Only 2x2 or 3x3 matrices are supported.");
            return;
        }
        double[][] matrix = generateMatrix(size, size);
        displayMatrix("Original Matrix", matrix);
        double[][] transposed = transpose(matrix);
        displayMatrix("Transpose", transposed);
        double determinant = (size == 2) ? determinant2x2(matrix) : determinant3x3(matrix);
        System.out.printf("\nDeterminant: %.2f\n", determinant);
        double[][] inverse = (size == 2) ? inverse2x2(matrix) : inverse3x3(matrix);
        if (inverse != null) {
            displayMatrix("Inverse", inverse);
        } else {
            System.out.println("Inverse does not exist (determinant is zero).");
        }
    }
}
