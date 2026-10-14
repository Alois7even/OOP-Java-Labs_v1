public class EnumSwitchDemo {
    public static void main(String[] args) {

        Day today = Day.FRIDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the week.");
                break;

            case FRIDAY:
                System.out.println("Almost the weekend!");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;

            default:
                System.out.println("It's a normal working day.");
        }
    }
}