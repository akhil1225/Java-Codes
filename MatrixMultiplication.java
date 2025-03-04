public class MatrixMultiplication {

    public static void main(String[] args) {
        int rows1 = 3, columns1 = 3;
        int  columns2 = 3;

        // Example matrices
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
        
        int[][] mat2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}};

        // Function call for matrix multiplication
        int[][] resultMatrix = multMatrix(mat1, mat2, rows1, columns1, columns2);

        // Display the result
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to multiply matrices
    public static int[][] multMatrix(int[][] mat1, int[][] mat2, int rows1, int columns1, int columns2) {
        int[][] resultMatrix = new int[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    resultMatrix[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return resultMatrix;
    }
}
