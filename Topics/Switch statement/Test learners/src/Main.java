import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int answerNumber = scanner.nextInt();
        final int java = 1;
        final int kotlin = 2;
        final int scala = 3;
        final int python = 4;

        String message;
        switch (answerNumber) {
            case java:
                message = "Yes!";
                break;
            case kotlin:
            case scala:
            case python:
                message = "No!";
                break;
            default:
                message = "Unknown number";
        }

        System.out.println(message);
    }
}