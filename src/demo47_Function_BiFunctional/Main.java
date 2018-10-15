package demo47_Function_BiFunctional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> stringIntegerFunction = s -> Integer.parseInt(s);
        Integer apply = stringIntegerFunction.apply("123");
        System.out.println(apply);

        BiFunction<String, Integer, Integer> biFunction = (s, integer) -> Integer.parseInt(s) + integer;
        //user friend

    }
}
