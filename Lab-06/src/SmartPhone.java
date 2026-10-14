public class SmartPhone implements Printable, Showable {

    @Override
    public void print() {
        System.out.println("Printing smartphone details");
    }

    @Override
    public void show() {
        System.out.println("Showing smartphone screen");
    }
}