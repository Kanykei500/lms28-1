import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list);
        list.stream().filter(x -> x % 2 == 0).map(x -> x * x).toList().stream()
                .max(Integer::compareTo).ifPresent(System.out::println);


        }

    }







