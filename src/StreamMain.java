import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    static List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

    public static void main() {

        Stream<Integer> stream = intList.stream();
        stream = stream.filter(x -> x > 0);
        stream = stream.filter(x -> x % 2 == 0);
        stream = stream.sorted(Comparator.naturalOrder());
        stream.forEach(System.out::println);
    }

}
