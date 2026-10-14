public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "Toyota";
        car1.colour = "Red";
        car1.speed = 0;

        car1.displayInfo();

        car1.accelerate();
        car1.accelerate();

        car1.displayInfo();
    }
}