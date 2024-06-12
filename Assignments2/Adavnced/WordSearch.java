class WordSearch {

    public static boolean wordExists(char[][] matrix, String word) {
        if (matrix == null || matrix.length == 0 || word == null || word.isEmpty())
            return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Check horizontally (left-to-right)
        for (int i = 0; i < rows; i++) {
        	System.out.println(matrix[i]);
            String rowString = new String(matrix[i]);
            if (rowString.contains(word))
                return true;
        }

        // Check vertically (up-to-down)
        for (int j = 0; j < cols; j++) {
            String colString = "";
            for (int i = 0; i < rows; i++) {
                colString += matrix[i][j];
            }
            if (colString.contains(word))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        char[][] matrix = {
            {'F', 'A', 'C', 'I'},
            {'O', 'B', 'Q', 'P'},
            {'A', 'N', 'O', 'B'},
            {'M', 'A', 'S', 'S'}
        };

        String word1 = "FOAM";
        String word2 = "MASS";

        System.out.println("Does 'FOAM' exist in the matrix? " + wordExists(matrix, word1));
        System.out.println("Does 'MASS' exist in the matrix? " + wordExists(matrix, word2));
    }
}
