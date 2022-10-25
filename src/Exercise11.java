import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        ArrayList<String> inputsUntilEnough = new ArrayList<>();
        do {
            input = scanner.nextLine();
            inputsUntilEnough.add(input);
        } while (!input.equals("Enough!"));
        if (inputsUntilEnough.size() == 1) {
            System.out.println("No text provided");
        } else {
            System.out.println(inputsUntilEnough);
            String longestString = inputsUntilEnough.get(0);
            for (int i = 1; i < inputsUntilEnough.size() - 1; i++) {
                if (longestString.length() < inputsUntilEnough.get(i).length()) {
                    longestString = inputsUntilEnough.get(i);
                }
            }
            System.out.println(longestString);
        }

//        while (true) {
//            String input = scanner.nextLine();
//            if(input.equals("Enough!")) {
//                break;
//            }
//        }
    }
}
