import java.io.File;
import java.io.IOException;
import java.util.*;

public class NumbersReader {

    private static final int FIRST_OCCURRENCE = 1;

    Map<Integer, Integer> readFile(String fileName) throws IOException {
        Scanner scanner = new Scanner(new File(fileName));
        Map<Integer, Integer> numbers = new TreeMap<>();
        while (scanner.hasNextLine()) {
            int number = scanner.nextInt();
            if (!numbers.containsKey(number)) {
                numbers.put(number, FIRST_OCCURRENCE);
            } else {
                int value = numbers.get(number);
                value++;
                numbers.put(number, value);
            }
        }
        return numbers;
    }
}
