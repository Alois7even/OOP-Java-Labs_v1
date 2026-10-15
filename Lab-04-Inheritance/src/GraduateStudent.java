public class GraduateStudent extends Student {

    String researchTopic;

    void displayGraduateStudent() {
        displayStudent();
        System.out.println("Research Topic: " + researchTopic);
    }
}