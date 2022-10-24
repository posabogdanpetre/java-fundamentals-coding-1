import java.util.Scanner;

public class ExerciseString {

    /*
    Sa citim un text (o linie de text) de la tastatura
    Sa afisam inapoi textul insa trebuie sa inlocuim
        - primul caracter cu ultimul
        - al 3-lea cu al 7-lea
        - ultimul cu al 2-lea
     Exemplu: Ana are mere si pere -> ene are mere si pern
     Hint: sa folosim metoda .charAt
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
// Solutie 1
//        char char2 = text.charAt(1);
//        char char7 = text.charAt(6);
//        char charLast = text.charAt(text.length() - 1);
//
//        String res = charLast + "" + char2  + char7 + text.substring(3, text.length() -1) +  char2;
//        System.out.println(res);

        char[] chars = text.toCharArray();
        chars[0] = chars[chars.length - 1];
        chars[2] = chars[6];
        chars[chars.length - 1] = chars[1];
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }

    }
}
