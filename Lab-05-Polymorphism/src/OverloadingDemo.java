public class OverloadingDemo {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(5, 3));

        System.out.println(c.add(5, 3, 2));

        System.out.println(c.add(2.5, 3.5));
    }
}