import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseMinFromArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nrs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nrs.add(scanner.nextInt());
        }
        int min = nrs.get(0);
        for (int i = 1; i < nrs.size(); i++) {
            if (min > nrs.get(i)) {
                min = nrs.get(i);
            }
        }
        System.out.println("Valoarea minima este: " + min);

    }
}
