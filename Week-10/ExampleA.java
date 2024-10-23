import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExampleA {
    public static void main(String[] args) {
        final String FILE_PATH = "./TODO.TXT"; // Whichever the path to your file is.
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.getMessage();
        }

    }
}
