import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> positivNumber = new ArrayList<>(); // отбор положительных
        for (Integer integer : intList) {
            if (integer > 0)
            positivNumber.add(integer);
        }

        Set<Integer> evenNumbers = new TreeSet<>(); // отбор четных
        for (Integer integer : positivNumber) {
            if (integer % 2 == 0)
                evenNumbers.add(integer);
        }

        for (Integer integer : evenNumbers) { // вывод на экран
            System.out.println(integer);
        }

        System.out.println("Далее через Stream");

        StreamMain.main();
    }
}
