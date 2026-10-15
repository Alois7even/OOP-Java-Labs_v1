public class MultipleCatchDemo {
    public static void main(String[] args) {

        try {
            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index does not exist.");

        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }

        System.out.println("Program continues.");
    }
}