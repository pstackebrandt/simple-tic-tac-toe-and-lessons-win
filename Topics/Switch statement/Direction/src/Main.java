import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int direction = scanner.nextInt();
        String message;
        switch (direction) {
            case 1:
                message = "move up";
                break;
            case 2:
                message = "move down";
                break;

            case 3:
                message = "move left";
                break;
            case 4:
                message = "move right";
                break;
            case 0:
                message = "do not move";
                break;
            default:
                message = "error!";
        }

        System.out.println(message);
    }
}