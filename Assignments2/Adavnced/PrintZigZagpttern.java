import java.util.Scanner;

class PrintZigZagpttern {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = in.nextLine();
        
       // input = input.replace(" ", "");
       System.out.println("Enter the number of rows to print ");
        int numRows = in.nextInt();

        printZigzag(input, numRows);
    }

    public static void printZigzag(String str, int numRows) {
        if (numRows <= 0) {
            System.out.println("Invalid number of rows.");
            return;
        }

        if (numRows == 1 || str.length() <= numRows) {
            System.out.println(str);
            return;
        }

        char[][] zigzag = new char[numRows][str.length()];
        int row = 0;
        boolean goingDown = true;

        for (int i = 0; i < str.length(); i++) {
            zigzag[row][i] = str.charAt(i);
            if (goingDown) {
                row++;
                if (row == numRows - 1) goingDown = false;
            } else {
                row--;
                if (row == 0) goingDown = true;
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < str.length(); j++) {
                System.out.print(zigzag[i][j] == 0 ? " " : zigzag[i][j]);
            }
            System.out.println();
        }
    }
}

