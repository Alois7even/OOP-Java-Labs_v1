public class Manager extends Employee {

    String department;

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}