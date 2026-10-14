public class Developer extends Employee {

    String programmingLanguage;

    void displayDeveloper() {
        displayEmployee();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}