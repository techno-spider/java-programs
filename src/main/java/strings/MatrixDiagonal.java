package strings;

public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        displayDiagonalElements(matrix);
    }

    private static void displayDiagonalElements(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            System.out.println("Invalid matrix. Rows and Columns should be equal.");
            return;
        }
        System.out.println("Diagonal Elements: ");
        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i][i] + " ");
        }
        System.out.println();
    }
}
