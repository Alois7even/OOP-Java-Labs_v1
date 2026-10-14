public class GenericsDemo {
    public static void main(String[] args) {

        Box<String> nameBox = new Box<>();
        nameBox.setValue("Alois");

        Box<Integer> ageBox = new Box<>();
        ageBox.setValue(22);

        System.out.println("Name: " + nameBox.getValue());
        System.out.println("Age: " + ageBox.getValue());
    }
}