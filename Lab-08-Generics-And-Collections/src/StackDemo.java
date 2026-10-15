import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> books = new Stack<>();

        books.push("Java");
        books.push("Python");
        books.push("C++");

        System.out.println("Stack: " + books);

        System.out.println("Top book: " + books.peek());

        books.pop();

        System.out.println("After removing the top book: " + books);
    }
}