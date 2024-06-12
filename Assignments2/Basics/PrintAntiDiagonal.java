public class PrintAntiDiagonal{

    public static void main(String[] args){
        int[][] matrix = {{1,2,3},
                      	      {4,5,6},
                        	      {7,8,9}
        };
        printAntiDiagonal(matrix);
    }
    
static void printAntiDiagonal(int[][] matrix) {
    int n = matrix.length;

    // Iterate over each diagonal starting from the top-left corner
    for (int diag = 0; diag < 2 * n - 1; diag++) {
        // Determine the starting row and column for the current diagonal
        int row = (diag < n) ? 0 : diag - n + 1;
        int col = (diag < n) ? diag : n - 1;

        while (row < n && col >= 0) {
            System.out.print(matrix[row][col] + " ");
            row++;
            col--;
        }
        System.out.println();
    }
}

}

