package defaultmethods.predefinedfunctionalinterfaces;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> bf = (a, b) -> a + b;
        System.out.println(bf.apply(34,56));
    }
}
