public class Student extends Person {

    String studentId;

    void displayStudent() {
        displayName();
        System.out.println("Student ID: " + studentId);
    }
}