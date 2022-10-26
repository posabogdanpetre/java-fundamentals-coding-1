import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //Ana are mere => am 2 spatii dar 12 caractere
        //Formula: nr_spatii * 100/nr_total

        int nrOfSpaces = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                nrOfSpaces++;
            }
        }
        System.out.println("Procentul de spatii este de " + (nrOfSpaces * 100d / text.length()) + "%");
    }
}
