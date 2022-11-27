class ArrayOperations {
    public static void printTheThirdRow(int[][] twoDimArray) {
        final var thirdRow = twoDimArray[2];

        final var builder = new StringBuilder();
        for (int i : thirdRow) {
            builder.append(String.format("%d ", i));
        }
        System.out.println(builder.toString().trim());
    }
}