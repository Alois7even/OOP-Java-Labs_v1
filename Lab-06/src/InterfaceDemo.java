public class InterfaceDemo {
    public static void main(String[] args) {

        Printable p1 = new Document();
        Printable p2 = new Photo();

        p1.print();
        p2.print();
    }
}