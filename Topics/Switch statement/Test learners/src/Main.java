import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int answerNumber = scanner.nextInt();

        String message;
        switch (answerNumber){
            case 1:
                message = "Yes!";
                break;
            case 2:
            case 3:
            case 4:
                message = "No!";
                break;
            default:
                message = "Unknown number";
        }

        System.out.println(message);
    }
}