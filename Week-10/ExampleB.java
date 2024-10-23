import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleB {
    public static void main(String[] args) {
        final String FILE_PATH = "./TODO.TXT"; // Whichever the path to your file is.

        // try (BufferedWriter wr = new BufferedWriter(new FileWriter(FILE_PATH,  true))) { // append to text file
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(FILE_PATH))) { // Overwrite text file contents
            wr.write("4. Work on Assignment 6\n");
            wr.write("5. Work on Lab 6\n");

        } catch (IOException e) {
            e.getMessage();
        }

    }
}
