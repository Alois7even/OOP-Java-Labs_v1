import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("../Lab-10/student.txt");

            writer.write("Name: Alois\n");
            writer.write("Course: Computer Science\n");
            writer.write("University: HIT\n");

            writer.close();

            System.out.println("File written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}