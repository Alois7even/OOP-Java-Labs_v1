public class ThrowDemo {
    static void checkAge(int age) {

        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }

        System.out.println("Access allowed.");
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues.");
    }
}