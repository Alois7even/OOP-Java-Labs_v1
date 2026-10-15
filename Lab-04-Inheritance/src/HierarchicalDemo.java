public class HierarchicalDemo {
    public static void main(String[] args) {

        Manager m1 = new Manager();

        m1.name = "Miles";
        m1.salary = 1500;
        m1.department = "CS";

        Developer d1 = new Developer();

        d1.name = "Alois";
        d1.salary = 1200;
        d1.programmingLanguage = "Java";

        System.out.println("Manager Details:");
        m1.displayManager();

        System.out.println();

        System.out.println("Developer Details:");
        d1.displayDeveloper();
    }
}