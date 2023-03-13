import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String fileName = "numbers.txt";
        NumbersReader reader = new NumbersReader();
        try {
            Map<Integer, List<Integer>> numbers = reader.readFile(fileName);
            Collection<List<Integer>> values = numbers.values();
            for (List<Integer> value : values) {
                System.out.println(value.get(0) + " - liczba wystąpień " + value.size());
            }
        } catch (IOException e) {
            System.out.println("Nie udało się odczytać pliku.");
        }
    }

}
