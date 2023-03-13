import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class NumbersReader {

    Map<String, List<String>> readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        Map<String, List<String>> numbers = new TreeMap<>();
        String line;
        while ((line = reader.readLine()) != null) {
            if (!numbers.containsKey(line)) {
                List<String> list = new ArrayList<>();
                list.add(line);
                numbers.put(line, list);
            } else {
                List<String> list = numbers.get(line);
                list.add(line);
            }
        }
        return numbers;
    }
}
