package StreamApi;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<Integer> l = List.of(8,1,4,6,2,1,4,7,87,4,2,2,1,5,6,7,9);

        /*
            Two types of method in Stream Api
            1. Intermediate: After applying such method in stream it again returns stream.
            Ex: filter(), sorted(), limit(), map()
            2. Terminal: It is the final method call upon stream and it can be applied only once
            in a stream.
            Ex: count(), findFirst(), collect()


            Note:
            1. Once we apply terminal method on stream we can't apply another terminal method upon
            same stream.
            2. The order of execution won't be in the order method call is mentioned.
            Stream Api works like Lazy and Eager, It doesn't do anything until terminal operation comes and
            as soon as terminal method comes it executes all intermediate method in best possible optimised way
            and then returns the result.
        */

        // Map expects a object of Function interface
        // We can create lambda expression also
        Function<Integer, Integer> f = new Function<>(){
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        Stream<Integer> s1 = l.stream();
        List<Integer> result = s1.filter((i) -> i % 2 == 0)
                .sorted((e1, e2) -> Integer.compare(e2, e1))
                .map(f)
                .collect(Collectors.toList());

        System.out.println(result);


        Stream<Integer> s2 = l.stream();
        Optional<Integer> res = s2.filter((i) -> i % 2 == 0)
                .sorted((e1, e2) -> Integer.compare(e2, e1))
                .map(f)
                .findFirst();


    }
}
