import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ExerciseHOTNEWS {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.hotnews.ro");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            } else {
                if (line.contains("<div class=\"info is-actualitate\">")) {
                    line = bufferedReader.readLine();
                    line = bufferedReader.readLine();
                    line = bufferedReader.readLine();
                    line = bufferedReader.readLine();
                    line = bufferedReader.readLine();
                    line = bufferedReader.readLine();
                    line = bufferedReader.readLine();
                    if (line.contains("<h1 class=\"title\">")) {
                        String title = line.replace("<h1 class=\"title\">", "");
                        if (title.length() > 1 && !title.isBlank()) {
                            System.out.println("Stire -> " + title);
                        }
                    }
                }
            }
        }

    }
}
