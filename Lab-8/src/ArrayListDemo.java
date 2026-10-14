import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Alois");
        names.add("Miles");
        names.add("Jinwoo");

        System.out.println("Student names: " + names);

        names.remove("Alois");

        System.out.println("After removing Alois: " + names);

        System.out.println("First student: " + names.get(0));

        System.out.println("Total students: " + names.size());
    }
}