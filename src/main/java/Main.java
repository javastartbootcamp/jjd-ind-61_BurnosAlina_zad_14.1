import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String fileName = "numbers.txt";
        NumbersReader reader = new NumbersReader();
        try {
            Map<Integer, Integer> numbers = reader.readFile(fileName);
            Set<Map.Entry<Integer, Integer>> entries = numbers.entrySet();
            for (Map.Entry<Integer, Integer> entry : entries) {
                System.out.println(entry.getKey() + " - liczba wystąpień " + entry.getValue());
            }
        } catch (IOException e) {
            System.out.println("Nie udało się odczytać pliku.");
        }
    }

}
