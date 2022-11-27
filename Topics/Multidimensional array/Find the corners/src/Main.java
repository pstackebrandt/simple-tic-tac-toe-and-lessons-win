class ArrayOperations {
    public static void printCorners(int[][] arr) {
        final int lastPositionOfFirstRow = arr[0].length - 1;
        final int lastRowPosition = arr.length - 1;
        final int lastPositionOfLastRow = arr[lastRowPosition].length - 1;

        System.out.printf("%d %d\n%d %d%n", arr[0][0], arr[0][lastPositionOfFirstRow],
                arr[lastRowPosition][0], arr[lastRowPosition][lastPositionOfLastRow]);
    }
}