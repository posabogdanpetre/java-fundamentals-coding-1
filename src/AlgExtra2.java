import java.util.ArrayList;

public class AlgExtra2 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(20);
        numbers1.add(10);
        numbers1.add(9);
        numbers1.add(1);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(9);
        numbers2.add(20);
        numbers2.add(4);
        numbers2.add(6);

        //Trebuie sa afisam toate numerele care se afla in ambele liste !!!
        for (Integer nr1 : numbers1) {
            if (numbers2.contains(nr1)) {
                System.out.println(nr1);
            }
        }

    }
}
