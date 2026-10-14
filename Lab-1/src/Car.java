public class Car {
    String brand;
    String colour;
    int speed;

    void accelerate() {
        speed = speed + 10;
        System.out.println("Current speed: " + speed + " km/h");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Colour: " + colour);
        System.out.println("Speed: " + speed + " km/h");
    }
}