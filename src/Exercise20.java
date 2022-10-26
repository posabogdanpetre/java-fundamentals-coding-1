import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {
        double randomNumber = Math.random();
        int randomInt = (int) (randomNumber * 100);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = scanner.nextInt();
            if (input == randomInt) {
                System.out.println("Congrats!!!");
                break;
            }
            if (input > randomInt) {
                System.out.println("too much!");
            }
            if (input < randomInt) {
                System.out.println("not enough!");
            }
        }
    }
}
