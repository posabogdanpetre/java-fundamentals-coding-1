import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int nr) {
        boolean isPrime = true;
        for (int i = 2; i < nr; i++) {
            if (nr % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
