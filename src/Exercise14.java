import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        char char1 = text1.charAt(0);
        char char2 = text2.charAt(0);

        System.out.println(char2 - char1 - 1);
    }
}
