import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExampleB {
    public static void main(String[] args) {
        final String FILE_PATH = "./TODO.TXT";

        try (BufferedWriter wr = new BufferedWriter(new FileWriter(FILE_PATH))) {

            wr.write("4. Work on Assignment 6\n");
            wr.write("5. Work on Lab 6\n");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
