import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] parts = text.split(" ");
        for (int i = 0; i < parts.length; i++) {
            System.out.print(parts[i] + " " + parts[i] + " ");
        }
    }
}
