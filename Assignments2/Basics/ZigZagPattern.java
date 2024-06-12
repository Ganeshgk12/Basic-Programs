public class ZigZagPattern {
    public static void main(String[] args) {
        printPattern();
    }

    public static void printPattern() {
        char[][] pattern = new char[4][14];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 14; j++) {
                if (i == 0 && j == 0) {
                    pattern[i][j] = 't';
                } else if (i == 1 && j == 1) {
                    pattern[i][j] = 'h';
                } else if (i == 2 && j == 2) {
                    pattern[i][j] = 'i';
                } else if (i == 3 && j == 3) {
                    pattern[i][j] = 's';
                } else if (i == 2 && j == 5) {
                    pattern[i][j] = 'i';
                } else if (i == 1 && j == 6 ) {
                    pattern[i][j] = 's';
                } else if (i == 0 && j == 7) {
                    pattern[i][j] = 'a';
                } else if (i == 1 && j == 8) {
                    pattern[i][j] = 'z';
                } else if (i == 2 && j == 9) {
                    pattern[i][j] = 'i';
                } else if (i == 3 && j == 10) {
                    pattern[i][j] = 'g';
                } else if (i == 2 && j == 11) {
                    pattern[i][j] = 'z';
                } else if (i == 1 && j == 12) {
                    pattern[i][j] = 'a';
                } else if (i == 0 && j == 13) {
                    pattern[i][j] = 'g';
                } else {
                    pattern[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 14; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }
}
