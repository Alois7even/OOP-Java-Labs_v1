public class RecordDemo {
    public static void main(String[] args) {

        StudentRecord student =
                new StudentRecord("Alois", 21, "Computer Science");

        System.out.println("Name: " + student.name());
        System.out.println("Age: " + student.age());
        System.out.println("Course: " + student.course());

        System.out.println(student);
    }
}