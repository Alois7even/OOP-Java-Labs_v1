import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(40, 10, 30, 20);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("Sorted list: " + sortedNumbers);
    }
}