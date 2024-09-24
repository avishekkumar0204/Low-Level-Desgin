package StreamApi;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hello", "idfiyd", "dkjhf");
        Stream<String> s1 = names.stream();

        String str = s1.collect(Collectors.joining(","));
        System.out.println(str);
    }
}
