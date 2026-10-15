import java.io.FileWriter;
import java.io.IOException;

public class FileAppendDemo {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("student.txt", true);

            writer.write("Year: 2\n");

            writer.close();

            System.out.println("Information appended successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
