import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<String> customers = new LinkedList<>();

        customers.add("Alois");
        customers.add("Miles");
        customers.add("Jinwoo");

        System.out.println("Queue: " + customers);

        System.out.println("Next customer: " + customers.peek());

        customers.poll();

        System.out.println("After serving one customer: " + customers);
    }
}