import java.util.ArrayList;

public class AlgExtra1 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(10);
        numbers.add(9);
        numbers.add(1);

        //Se da o lista de numere
        //Trebuie sa adunam toate numerele din lista
        //Insa sa le adunam numai pe acelea care sunt mai mari decat toate numerele din dreapta
        //Exemplu: 2 - nu este eligibil de adunare
        // 10 - este eligibil de adunare
        // 9 - este eligbil de adunare
        int sum = 0;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (isEligibleForAdding(i, numbers.get(i), numbers)) {
                sum = sum + numbers.get(i);
            }
        }
        System.out.println(sum);
    }

    static boolean isEligibleForAdding(int position, int nr, ArrayList<Integer> numbers) {
        for (int i = position + 1; i < numbers.size(); i++) {
            if (numbers.get(i) > nr) {
                return false;
            }
        }
        return true;
    }
}
