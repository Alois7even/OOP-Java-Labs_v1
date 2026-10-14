public class LambdaDemo {
    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Hello from a lambda expression!");
        };

        task.run();
    }
}
