import java.util.ArrayList;

public class Exercise16 {
    public static void main(String[] args) {
        ArrayList<Integer> nrs = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            nrs.add(scanner.nextInt());
//        }
        nrs.add(1);
        nrs.add(3);
        nrs.add(8);
        nrs.add(4);
        nrs.add(2);
        nrs.add(5);
        nrs.add(6);
        nrs.add(11);
        nrs.add(13);
        nrs.add(7);

        boolean suntemPeCrestere = false;
        int pozitieDeInceputACreterii = 0;
        int max = 0;
        for (int i = 0; i < nrs.size() - 1; i++) {
            if (nrs.get(i) < nrs.get(i + 1)) {
                if (!suntemPeCrestere) {
                    pozitieDeInceputACreterii = i;
                }
                suntemPeCrestere = true;
            } else {
                suntemPeCrestere = false;
                int lungimeaSiruluiCrescator = i - pozitieDeInceputACreterii + 1;

                if (max < lungimeaSiruluiCrescator) {
                    max = lungimeaSiruluiCrescator;
                }
            }
        }
        System.out.println(max);
    }
}
