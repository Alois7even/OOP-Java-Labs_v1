public class ShapeDemo {
    public static void main(String[] args) {

        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        Shape s3 = new Triangle(4, 8);

        System.out.println("Circle area: " + s1.area());
        System.out.println("Rectangle area: " + s2.area());
        System.out.println("Triangle area: " + s3.area());
    }
}