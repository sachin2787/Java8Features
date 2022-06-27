package defaultmethods.predefinedfunctionalinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bp = (a, b) -> (a + b) % 2 == 0;
        System.out.println(bp.test(4,6));
        System.out.println(bp.test(33, 56));
    }
}
