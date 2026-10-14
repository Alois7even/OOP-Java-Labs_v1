public class FinallyDemo {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");

        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program finished.");
    }
}