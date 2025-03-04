public class MatrixAddition {
    public static void main(String[] args) {
        int rows = 3, columns = 3;
        
        // Two example matrices
        int[][] mat1 = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        int[][] mat2 = {{9, 8, 7},
                        {6, 5, 4},
                        {3, 2, 1}};
        
        // Function call for matrix addition
        int[][] resultMatrix = addMatrix(mat1, mat2, rows, columns);
        
        // Display the result
        System.out.println("Sum of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to add matrices
    public static int[][] addMatrix(int[][] mat1, int[][] mat2, int rows, int columns) {
        int[][] resultMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return resultMatrix;
    }
}
