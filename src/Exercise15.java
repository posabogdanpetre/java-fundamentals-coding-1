import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nrs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nrs.add(scanner.nextInt());
        }
        HashSet<Integer> foundTwice = new HashSet<>();
        for (int i = 0; i < nrs.size(); i++) {
            //Trebuie sa detectez daca nrs.get(i) se mai afla o data in lista
            for (int j = 0; j < nrs.size(); j++) {
                if (i != j && nrs.get(i) == nrs.get(j)) {
                    foundTwice.add(nrs.get(i));
                }
            }
        }
        System.out.println(foundTwice);
    }
}
