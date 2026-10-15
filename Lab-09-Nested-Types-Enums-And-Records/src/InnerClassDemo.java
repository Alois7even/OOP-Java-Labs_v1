public class InnerClassDemo {
    public static void main(String[] args) {

        Computer computer = new Computer();

        Computer.Processor processor = computer.new Processor();

        processor.display();
    }
}