import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float i = scanner.nextFloat();
        String symbol = scanner.next();
        float j = scanner.nextFloat();
        switch (symbol) {
            case "+": {
                System.out.println(i + j);
                break;
            }
            case "-": {
                System.out.println(i - j);
                break;
            }
            case "/": {
                if (j == 0) {
                    System.out.println("Cannot calculate");
                } else {
                    System.out.println(i / j);
                }
                break;
            }
            case "*": {
                System.out.println(i * j);
                break;
            }
            default: {
                System.out.println("invalid symbol");
            }
        }

    }
}
