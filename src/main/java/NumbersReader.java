import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class NumbersReader {

    Map<Integer, List<Integer>> readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        Map<Integer, List<Integer>> numbers = new TreeMap<>();
        String line;
        while ((line = reader.readLine()) != null) {
            int number = Integer.parseInt(line);
            if (!numbers.containsKey(number)) {
                List<Integer> list = new ArrayList<>();
                list.add(number);
                numbers.put(number, list);
            } else {
                List<Integer> list = numbers.get(number);
                list.add(number);
            }
        }
        return numbers;
    }
}
