import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Alois");
        students.put(102, "Miles");
        students.put(103, "Jinwoo");

        System.out.println("Students: " + students);

        System.out.println("Student 102: " + students.get(102));

        students.remove(103);

        System.out.println("After removal: " + students);
        System.out.println("Total students: " + students.size());
    }
}