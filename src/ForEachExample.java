import java.util.ArrayList;

public class ForEachExample {

    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Scufita Rosie");
        books.add("Capra cu 3 iezi");
        books.add("Harry Potter");

//        for (int i = 0; i < books.size(); i++) {
//            System.out.println(books.get(i));
//        }

        for(String b: books) {
            System.out.println(b.toLowerCase().contains("c"));
        }
    }
}
