import java.io.BufferedReader;
import java.io.FileReader;

public class ExampleA {
    public static void main(String[] args) {
        final String FILE_PATH = "./TODO.TXT";
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
