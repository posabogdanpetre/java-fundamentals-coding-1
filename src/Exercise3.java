import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu valoarea coeficientului a");
        int a = scanner.nextInt();
        System.out.println("Introdu valoarea coeficientului b");
        int b = scanner.nextInt();
        System.out.println("Introdu valoarea coeficientului c");
        int c = scanner.nextInt();

        double delta = b * b - 4 * a * c;
        double x1 = (-b - Math.sqrt(delta)) / (2 * a);
        double x2 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.println("x1 este: " + x1);
        System.out.println("x2 este: " + x2);

    }
}
