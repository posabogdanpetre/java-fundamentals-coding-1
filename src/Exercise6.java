import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //Cum afisam suma numerelor intre 1 si n??
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1d/i;
        }
        System.out.println(sum);
    }
}
