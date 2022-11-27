import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        // System.out.println("Please enter size of Matrix.");
        final int matrixSize = scanner.nextInt();
        scanner.close();

        final var filler = new MatrixFiller(matrixSize);
        filler.run();
    }
}

class MatrixFiller {

    private final int matrixSize;

    public MatrixFiller(int matrixSize) {
        this.matrixSize = matrixSize;
    }

    public void run() {
        int[][] theMatrix = createMatrix(matrixSize);
        theMatrix = getFilledMatrix(theMatrix);
        String formattedText = MatrixFiller.print(theMatrix);
        System.out.println(formattedText);
    }

    protected static int[][] getFilledMatrix(int[][] pMatrix) {
        int[][] matrix = deepCopy(pMatrix);
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == 0) {
                    matrix[row][col] = col;
                }

                if (col > row) {
                    matrix[row][col] = col - row;
                }

                if (col < row) {
                    matrix[row][col] = row - col;
                }
            }
            System.out.println("\n");
        }
        return matrix;
    }

    /** */
    protected static int[][] deepCopy(int[][] matrix) {
        return java.util.Arrays.stream(matrix).map(int[]::clone).toArray(a -> matrix.clone());
    }

    protected static int[][] createMatrix(int matrixSize) {
        return new int[matrixSize][matrixSize];
    }

    /** Returns formatted figure. Lines are delimited by \n. */
    public static String print(int[][] matrix) {
        final var builder = new StringBuilder();

        for (var row : matrix) {
            var lineBuilder = new StringBuilder();
            for (var col : row) {
                lineBuilder.append(col).append(" ");
            }
            builder.append(lineBuilder.toString().trim()).append("\n");
        }

        return builder.toString();
    }
}
